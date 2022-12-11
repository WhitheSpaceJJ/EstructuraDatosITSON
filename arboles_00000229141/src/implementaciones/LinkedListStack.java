/*
* LinkedListStack.java
* Creada el 24 de noviembre del 2021 5:30 PM
 */
package implementaciones;

import excepciones.ListException;
import excepciones.StackException;
import interfaces.IStack;

/**
 * Clase linked lista que implementa una pila sobre una lista.
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * @author josej Jesus 
 * @param <T> Paramtero de tipo para los objetos de la pila
 */
public class LinkedListStack<T> extends LinkedList<T> implements IStack<T> {

    /**
     * Constructor de la clase.
     *
     */
    public LinkedListStack() {
        super();
    }

    /**
     * Inserta un elemento en el tope de la pila
     *
     * @param o Elemento a insertar en el tope de la pila
     * @throws StackException Si la pila esta llena
     */
    @Override
    public void push(T o) throws StackException {
        try {
            append(o);
        } catch (ListException le) {
            throw new StackException("Pila llena");
        }
    }

    /**
     * Extrae el elemento en el tope de la pila
     *
     * @return El elemento en el tope de la pila
     * @throws StackException Si la pila esta vacia
     */
    @Override
    public T pop() throws StackException {
        T o = null;
        try {
            o = remove(nElementos - 1);
        } catch (ListException le) {
            throw new StackException("Pila Vacia");
        }
        return o;
    }


    /**
     * Inspecciona el elemento en el tope de la pila
     *
     * @return El elemento en el tope de la pila
     * @throws StackException Si la pila esta vacia
     */
    @Override
    public T peek() throws StackException {
        T o = null;
        try {
            o = get(nElementos - 1);
        } catch (ListException le) {
            throw new StackException("Pila Vacia");
        }
        return o;
    }

}
