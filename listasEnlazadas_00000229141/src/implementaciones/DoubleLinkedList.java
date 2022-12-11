/*
 * DoubleLinkedList<T>.java
* Creada el 25 de septiembre de 2021, 4:50 PM
 */
package implementaciones;

import excepciones.ListException;
import interfaces.IList;
import java.util.Iterator;

/**
 * Esta clase generica implementa una lista sobre una lista doblemente enlazada.
 * El nodo se implementa como una clase miembro. Alumno; José Jesús Orozco
 * Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 * @param <T> Tipo de los elementos que se almacenaran en la lista
 */
public class DoubleLinkedList<T> implements IList<T>, Iterable<T> {

    private NodoDoble<T> inicio;
    private NodoDoble<T> fin;
    private int nElementos;

    /**
     * Esta clase Miembro representa un nodo de una lista enlazada simple
     *
     * @author Jose Jesus
     */
    public class NodoDoble<T> {

        private T dato;
        private NodoDoble<T> ant;
        private NodoDoble<T> sig;

        /**
         * Inicializa el atributo dato al valor de su parametro
         *
         * @param dato Dato a almacenar en el nodo
         */
        private NodoDoble(T dato) {
            this.dato = dato;
        }
    }

    /**
     * Esta clase miembro representa un iterador para esta lista
     *
     * @author Jose Jesus
     */
    private class ListIterator<T> implements Iterator<T> {

        private NodoDoble<T> nodoActual;

        /**
         * Inicializa el atributo nodo actual al valor del paramtero
         *
         * @param inicio Inicio de la lista
         */
        public ListIterator(NodoDoble<T> inicio) {
            nodoActual = inicio;
        }

        /**
         * Determina si el iterador tiene otro elemento que regresar
         *
         * @return true si el iterador tiene otro elemento que regresar, false
         * en caso contrario.
         */
        @Override
        public boolean hasNext() {
            return nodoActual != null;
        }

        /**
         * Regresa una referencia al siguiente elemento de la colección y avanza
         * el iterador a la siguiente posición.
         *
         * @return Una referencia al siguiente elemento de la colección
         * @throws Una excepción del tipo NoSuchElementException si ya no hay
         * elementos que regresar
         */
        @Override
        public T next() {
            T dato = nodoActual.dato;
            nodoActual = nodoActual.sig;
            return dato;
        }
    }

    /**
     * Inicializa las referencias al inicio y al final de la lista y el contador
     * de elementos de la lista
     */
    public DoubleLinkedList() {
        inicio = null;
        fin = null;
        nElementos = 0;
    }

    /**
     * Inserta un elemento al final de la lista
     *
     * @param o Elemento a insertar en la posición i de la lista
     */
    @Override
    public void append(T o) {
        NodoDoble<T> nodoDoble = new NodoDoble<>(o);
        NodoDoble<T> nodo = inicio;
        if (inicio == null) {
            inicio = nodoDoble;
        } else {
            fin.sig = nodoDoble;
            nodoDoble.ant = fin;
        }
        fin = nodoDoble;
        nElementos++;
    }

    /**
     * Inserta un elemento en la posición i de la lista
     *
     * @param o Elemento a insertar en la posición i de la lista
     * @param i Posición i de la lista donde se inserta el elemento
     * @throws ListException Si i es mayor al tamaño de la lista o menor a 0
     */
    @Override
    public void insert(T o, int i) throws ListException {
        NodoDoble<T> nodoDoble = new NodoDoble<>(o);
        if (i < 0 || i > nElementos) {
            throw new ListException("Indice fuera de limites");
        }
// Inserta el elemento al inicio de la lista
        if (i == 0) {
// Inserta el elemento al inicio de la lista
            if (inicio == null) {
// Si la lista estaba vacia
                fin = nodoDoble;
            } else {
                nodoDoble.sig = inicio;
                inicio.ant = nodoDoble;
            }
            inicio = nodoDoble;
        } else {
// Inserta el elemento en la posición i de la lista
            NodoDoble<T> nodo = inicio;
            for (int j = 0; j < i - 1; j++) {
                nodo = nodo.sig;
            }
            nodoDoble.sig = nodo.sig;
            if (nodoDoble.sig != null) {
// Si el nodo insertado no es el ultimo
                nodoDoble.sig.ant = nodoDoble;
            } else {
                fin = nodoDoble;
            }
            nodoDoble.ant = nodo;
            nodo.sig = nodoDoble;
        }
        nElementos++;
    }

    /**
     * Reemplaza el elemento en la posición i de la lista
     *
     * @param o Elemento a reemplazar en la posición i de la lista
     * @param i Posición i de la lista del elemento a reemplazar
     * @throws ListException Si i es mayor al tamaño de la lista o menor a 0
     */
    @Override
    public void set(T o, int i) throws ListException {
        if (i < 0 || i >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
// Modifica el dato en la posición i de la lista
        NodoDoble<T> nodo = inicio;
        for (int j = 0; j < i; j++) {
            nodo = nodo.sig;
        }
        nodo.dato = o;
    }

    /**
     * Extrae el elemento de la posición i de la lista
     *
     * @param i Posición i de la lista del elemento a remover
     * @return El elemento de la posición i de la lista
     * @throws ListException Si la lista esta vacia o si i es mayor al tamaño de
     * la lista o menor a 0
     *
     */
    @Override
    public T remove(int i) throws ListException {
        T o;
        if (empty()) {
            throw new ListException("Lista vacia");
        }
        if (i < 0 || i >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        if (i == 0) {
// Si el nodo a eliminar es el primero
// Obten el dato al inicio de la lista
            o = inicio.dato;
            inicio = inicio.sig;
            if (inicio != null) {
// Si la lista no esta vacia
                inicio.ant = null;
            } else {
                fin = null;
            }
        } else {
// Obten el dato en la posición i de la lista
            NodoDoble<T> nodo = inicio;
            for (int j = 0; j < i - 1; j++) {
                nodo = nodo.sig;
            }
            o = nodo.sig.dato;
            nodo.sig = nodo.sig.sig;
            if (nodo.sig != null) {
// Si no es el ultimo nodo de la lista
                nodo.sig.ant = nodo;
            } else {
                fin = nodo;
            }
        }
        nElementos--;
// Regresa el dato
        return o;
    }

    /**
     * inspecciona el elemento en la posición i de la lista sin extraerlo
     *
     * @param i Posición i de la lista del elemento a inspeccionar
     * @return El elemento en la posición i de la lista
     * @throws ListException Si la lista esta vacia o si i es mayor al tamaño de
     * la lista o menor a 0
     */
    @Override
    public T get(int i) throws ListException {
        if (empty()) {
            throw new ListException("Lista vacia");
        }
        if (i < 0 || i >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
// Regresa el dato en la posición i de la lista
        NodoDoble<T> nodo = inicio;
        for (int j = 0; j < i; j++) {
            nodo = nodo.sig;
        }
        return nodo.dato;
    }

    /**
     * Determina si la lista se encuentra vacia
     *
     * @return true si la lista se encuentra vacia, false en caso contrario.
     */
    @Override
    public boolean empty() {
        return inicio == null;
    }

    /**
     * Regresa el numero de elementos en la lista
     *
     * @return El numero de elementos en la lista
     */
    @Override
    public int size() {
        return nElementos;
    }

    /**
     * Regresa un iterador para esta lista
     *
     * @return Un iterador para esta lista
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(inicio);
    }

    /**
     * Metodo que determina el indice del onjeto si este se encuentra en la
     * lista. Cabe destacar que devolvera el indice del primer elemento que
     * coincida de la lista actual.
     *
     * @param o El elemento a determinar su indice
     * @return El indice del elemento, -1 en caso de que este no exista en la
     * lista.
     */
    @Override
    public int indexOf(T o) {
        // Condicion que nos ayuda a determinar si la lista esta vacia y regresar -1
        if (empty()) {
            return -1;
        } else {
            //Contador auxiliar que nos ayuda para regresar la posicion del elemento a buscar
            int con = 0;
            NodoDoble<T> nodo = inicio;
            //Ciclo que nos ayua a encontrar el elemento que coincida en la lista
            while (nodo != null) {
                //ondicion que determina si el elemento actual de la lista es igual que el elemento que deseamos
                //obtener su indice
                if (nodo.dato.equals(o)) {
                    return con;
                }
                con++;
                nodo = nodo.sig;
            }
            return -1;
        }
    }

    /**
     * Metodo que eliminara el primer elemento que coincida con el objeto dentro
     * de la lista
     *
     * @param t Objeto a eliminar
     * @return true si el objeto fue eliminado, false en caso contrario
     */
    @Override
    public boolean remove(T t) {
        //Variable auxiliar que nos ayuda a encontrar el indice y reducir el numero de ciclos
        int a = indexOf(t);
        //Condicion auxiliar que nos ayuda a encontrar el indice
        if (a >= 0) {
            //Remove y condicion axuliar apara devolver true
            remove(a);
            return true;
        }
        return false;
    }

    /**
     * Metodo que eliminara todos los elementos de la lista enlazada y establece
     * el numero de elementos a 0
     */
    @Override
    public void clear() {
        inicio = null;
        fin = null;
        nElementos = 0;
    }

    /**
     * Metodo que regresa el índice de la última ocurrencia del elemento del
     * parámetro en la lista o -1 si el elemento no existe.
     *
     * @param o El elemento a buscar el indice
     * @return El indice de la ultima ocurrencia del elemento, -1 en caso
     * contrario.
     */
    public int lastIndexOf(T o) {
        if (empty()) {
            return -1;
        } else {
            int auxiliar = nElementos;
            //Contador auxiliar que nos ayuda para regresar la posicion del elemento a buscar
            int con = auxiliar - 1;
            NodoDoble<T> nodo = fin;
            //Ciclo que nos ayua a encontrar el elemento que coincida en la lista
            while (nodo != null) {
                //ondicion que determina si el elemento actual de la lista es igual que el elemento que deseamos
                //obtener su indice
                if (nodo.dato.equals(o)) {
                    return con;
                }
                con--;
                nodo = nodo.ant;
            }
            return -1;
        }
    }

    /**
     * Metodo que elimina la última ocurrencia del elemento del parámetro si
     * existe. El método regresa true si el elemento existe en la lista, false
     * en caso contrario.
     *
     * @param o Elemento a eliminar
     * @return true si ele elemento fue eliminado, false en caso contrario.
     */
    public boolean removeLast(T o) {
        //Variable auxiliar que nos ayuda a encontrar el indice y reducir el numero de ciclos
        int a = lastIndexOf(o);
        //Condicion auxiliar que nos ayuda a determinar si el elemento existe
        if (a >= 0) {
            //Remove y condicion axuliar apara devolver true
            remove(a);
            return true;
        }
        return false;
    }

    /**
     * Genera una cadena con los valores de los elementos de la lista
     *
     * @return La cadena con los valores de los elementos de la lista
     */
    @Override
    public String toString() {
        String s = "[";
        NodoDoble<T> nodo = inicio;
        while (nodo != null) {
            s += nodo.dato;
            if (nodo.sig != null) {
                s += ", ";
            }
            nodo = nodo.sig;
        }
        s += "]";
        return s;
    }

    /**
     * Genera una cadena con los valores de los elementos de la lista. Usa un
     * iterador para recorrer la lista
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
     * Genera una cadena con los valores de los elementos de la lista. Usa una
     * sentencia foreach
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
