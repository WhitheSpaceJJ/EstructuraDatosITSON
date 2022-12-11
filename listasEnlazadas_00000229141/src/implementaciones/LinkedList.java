/*
 * LinkedList<T>.java
* Creada el 25 de septiembre de 2021, 4:50 PM
 */
package implementaciones;

import excepciones.ListException;
import interfaces.IList;
import java.util.Iterator;

/**
 * Esta clase generica implementa una lista sobre una lista enlazada simple. El
 * nodo se implementa como una clase miembro. Alumno; José Jesús Orozco
 * Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 * @param <T> Tipo de los elementos que se almacenaran en la lista
 */
public class LinkedList<T> implements IList<T>, Iterable<T> {

    protected NodoSimple<T> inicio;
    protected int nElementos;

    /**
     * Esta clase Miembro representa un nodo de una lista enlazada simple
     *
     * @Jose Jesus
     */
    private class NodoSimple<T> {

        private T dato;
        private NodoSimple<T> sig;

        /**
         * Inicializa el atributo dato al valor de su parametro
         *
         * @param dato Dato a almacenar en el nodo
         */
        public NodoSimple(T dato) {
            this.dato = dato;
        }
    }

    /**
     * Esta clase miembro representa un iterador para esta lista
     *
     * @author Jose Jesus
     */
    private class ListIterator<T> implements Iterator<T> {

        //Nodo actual
        private NodoSimple<T> nodoActual;

        /**
         * Inicializa el atributo nodo actual al valor del paramtero
         *
         * @param inicio Inicio de la lista
         */
        public ListIterator(NodoSimple<T> inicio) {
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
     * Inicializa la referencia al inicio de la lista y el contador de elementos
     * de la lista
     */
    public LinkedList() {
        inicio = null;
        nElementos = 0;
    }

    /**
     * Inserta un elemento al final de la lista
     *
     * @param o Elemento a insertar en la posición i de la lista
     */
    @Override
    public void append(T o) {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(o);
        NodoSimple<T> nodo = inicio;
        if (inicio == null) {
            inicio = nodoNuevo;
        } else {

            while (nodo.sig != null) {
                nodo = nodo.sig;
            }
            nodo.sig = nodoNuevo;
        }
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
        NodoSimple<T> nodoNuevo = new NodoSimple<>(o);
        if (i < 0 || i > nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        if (i == 0) {
// Inserta el elemento al inicio de la lista
            if (inicio != null) {
                nodoNuevo.sig = inicio;
            }
            inicio = nodoNuevo;
        } else {
// Inserta el elemento en la posición i de la lista
            NodoSimple<T> nodo = inicio;
            for (int j = 0; j < i - 1; j++) {
                nodo = nodo.sig;
            }
            nodoNuevo.sig = nodo.sig;
            nodo.sig = nodoNuevo;
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
        NodoSimple<T> nodo = inicio;
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
// Obten el dato al inicio de la lista
            o = inicio.dato;
            inicio = inicio.sig;
        } else {
// Obten el dato en la posición i de la lista
            NodoSimple<T> nodo = inicio;
            for (int j = 0; j < i - 1; j++) {
                nodo = nodo.sig;
            }
            o = nodo.sig.dato;
            nodo.sig = nodo.sig.sig;
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
        NodoSimple<T> nodo = inicio;
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
            NodoSimple<T> nodo = inicio;
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
        //Condicion auxiliar que nos ayuda a encontrar el indice
        if (indexOf(t) >= 0) {
            //Remueve el elemento con apoyo del metodo remove(int i) e indexOf(T t)
            remove(indexOf(t));
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
        NodoSimple<T> nodo = inicio;
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
