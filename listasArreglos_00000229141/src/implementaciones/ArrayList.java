/*
 * ArrayLis<T>.java
* Creada el 19 de septiembre de 2021, 2:28 PM
 */
package implementaciones;

import excepciones.ListException;
import interfaces.IList;
import java.util.Iterator;

/**
 * Clase generica implementa una lista sobre un arreglo. Alumno; José Jesús
 * Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 * @param <T> Tipo de los elementos que se almacenaran en la lista
 */
public class ArrayList<T> implements IList<T>, Iterable<T> {

    protected int nElementos;
    private final int tamLista;
    private final T lista[];

    /**
     * Esta clase miembro representa un iterador para esta lista
     */
    private class ListIterator<T> implements Iterator<T> {

        private int actual = 0;

        /**
         * Metodo que determina si el iterador tiene otro elemento que regresar
         *
         * @return true si existe otro elemento a regresar,false en caso
         * contrario.
         */
        @Override
        public boolean hasNext() {
            return actual < nElementos;
        }

        /**
         * Regresa una referencia al siguiente elemento de la colección y avanza
         * el iterador a la siguiente posición.
         *
         * @return Una referencia al siguiente elemento de la colección
         */
        @Override
        public T next() {
            return (T) lista[actual++];
        }
    }

    /**
     * Constructor de la clase. Crea el arreglo sobre el que se implementa la
     * lista e inicializa nElementos a cero para indicar que la lista
     * inicialmente esta vacia.
     *
     * @param tipoDato Tipo de elemento que se almacenaran en la lista
     * @param tamLista Tamaño del arreglo sobre el que se implementa la lista
     */
    public ArrayList(Class<T> tipoDato, int tamLista) {
        if (tamLista < 0) {
            throw new ListException("Tamaño de lista negativo");
        }
        this.tamLista = tamLista;
        nElementos = 0;
        lista = (T[]) java.lang.reflect.Array.newInstance(tipoDato,
                tamLista);
    }

    /**
     * Inserta un elemento al final de la lista
     *
     * @param o Elemento a insertar
     * @throws ListException Si la lista esta llena
     */
    @Override
    public void append(T o) throws ListException {
        // Si la lista esta llena, lanza una excepcion
        if (nElementos >= tamLista) {
            throw new ListException("Lista llena");
        }
        // Inserta el dato en el nElementos de la lista
        lista[nElementos] = o;
        nElementos++;
    }

    /**
     * Inserta un elemento en la posición i de la lista
     *
     * @param o Elemento a insertar en la posición i de la lista
     * @param i Posición i de la lista en la cual se insertara el elemento
     * @throws ListException Si la lista se encuentra llena o que i se mayor a
     * uno y menor al tamaño de la lista.
     */
    @Override
    public void insert(T o, int i) throws ListException {
        // Si la lista esta llena, lanza una excepcion
        if (nElementos >= tamLista) {
            throw new ListException("Lista llena");
        }
        // Si el indice i esta fuera de los limites de los datos
        if (i < 0 || i > nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        for (int j = nElementos; j > i; j--) {
            lista[j] = lista[j - 1];
        }
        lista[i] = o;
        nElementos++;
    }

    /**
     * Reemplaza el elemento en la posición i de la lista
     *
     * @param o Elemento a reemplazar en la posición i de la lista
     * @param i Posición i de la lista del elemento a reemplazar
     * @throws ListException Si la lista se encuentra llena o que i se mayor a
     * uno y menor al tamaño de la lista.
     */
    @Override
    public void set(T o, int i) throws ListException {
// Si el indice i esta fuera de los limites de los datos
        if (i < 0 || i >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        lista[i] = o;
    }

    /**
     * Extrae el elemento de la posición i de la lista
     *
     * @param i Posición i de la lista del elemento a remover
     * @return El elemento de la posición i de la lista
     * @throws ListException Si la lista se encuentra llena o que i se mayor a
     * uno y menor al tamaño de la lista.
     */
    @Override
    public T remove(int i) throws ListException {
        T o = get(i);
        for (int j = i; j < nElementos - 1; j++) {
            lista[j] = lista[j + 1];
        }
        nElementos--;
        return o;
    }

    /**
     * Obtiene el elemento en la posición i de la lista.
     *
     * @param i Posición i de la lista del elemento a inspeccionar
     * @return El elemento en la posición i de la lista
     * @throws ListException Si la lista se encuentra llena o que i se mayor a
     * uno y menor al tamaño de la lista.
     */
    @Override
    public T get(int i) throws ListException {
        // Si la lista esta vacia lanza una excepcion
        if (empty()) {
            throw new ListException("Lista vacia");
        }
        // Si el indice i esta fuera de los limites de los datos
        if (i < 0 || i >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        return lista[i];
    }

    /**
     *
     * Determina si la lista se encuentra vacia
     *
     * @return true si la lista esta vacia, false en caso contrario.
     */
    @Override
    public boolean empty() {
        return nElementos == 0;
    }

    /**
     * Metodo para obtener el numero de elementos en la lista
     *
     * @return El numero de elementos en la lista
     */
    @Override
    public int size() {
        return nElementos;
    }

    /**
     * Metodo para obtener un iterador para la lista
     *
     * @return El iterador para la lista
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    /**
     * Metodo para obtener el indice del objeto que coincida con alguno de la
     * lista.
     *
     * @param t El objeto a analizar.
     * @return El indice del objeto, -1 en caso contrario.
     */
    @Override
    public int indexOf(T t) {
        //Ciclo para recorrer la lista
        for (int i = 0; i < lista.length; i++) {
            //Condicion que determina sin son iguales
            if (lista[i].equals(t)) {
                return i;
            }
            //Condicion que rompe el ciclo
            if (lista[i].equals(t)) {
                break;
            }
        }
        return -1;
    }

    /**
     * Metodo que eliminar el elemento de la lista que coincida con el
     * parametro.
     *
     * @param t Ele elemento a eliminar.
     * @return true si el elemento fue eliminado, false en caso contraio.
     */
    @Override
    public boolean remove(T t) {
        //Condicon auxiliar que se apoya en el metodo intdexOf()para determinar si el elemento existe de ser asi se 
        //manda a llamar al metodo remove(int i) para enviarle el indice ,del elemnto a eliminar 
        if (indexOf(t) >= 0) {
            //Remove y condicion axuliar apara devolver true
            return remove(indexOf(t)) != null;
        }
        return false;
    }

    /**
     * Metodo para eliminar todos los elementos de la lista
     */
    @Override
    public void clear() {
        //Ciclo de eliminacion
        for (int i = 0; i < lista.length; i++) {
            lista[i] = null;
        }
        nElementos = 0;
    }

    /**
     * Genera una cadena con los valores de los elementos de la lista
     *
     * @return La cadena con los valores de los elementos de la lista
     */
    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < nElementos; i++) {
            s += lista[i];
            if (i < nElementos - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    /**
     * Genera una cadena con los valores de los elementos de la lista. Usando un
     * iterador.
     *
     * @return La cadena con los valores de los elementos de la lista
     */
    public String toString2() {
        String s = "[";
        Iterator<T> iter = iterator();
        while (iter.hasNext()) {
            T elemento = iter.next();
            s += elemento;
            if (iter.hasNext()) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    /**
     * Genera una cadena con los valores de los elementos de la lista. Sin
     * embargo este metodo utiliza una sentencia for each
     *
     * @return La cadena con los valores de los elementos de la lista
     */
    public String toString3() {
        String s = "[";
        for (T elemento : this) {
            s += elemento + ", ";
        }
        int n = s.lastIndexOf(", ");
        if (n != -1) {
            s = s.substring(0, n);
        }
        s += "]";
        return s;
    }

}
