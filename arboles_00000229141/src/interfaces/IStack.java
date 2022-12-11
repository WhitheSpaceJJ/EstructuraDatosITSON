/*
* IStack.java
* Creada el 21 de noviembre del 2021 6:25 PM
 */
package interfaces;

import excepciones.StackException;

/**
 * Esta interfaz generica establece los métodos a implementar por una clase que
 * modele una pila
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * 
 * @param <T> Parámetro de tipo para los objetos a almacenarse en la pila
 * @author José Jesús 
 */
public interface IStack<T> {

    /**
     * Inserta un elemento en el tope de la pila
     *
     * @param o Elemento a insertar en el tope de la pila
     * @throws StackException Si la pila esta llena
     */
    public void push(T o) throws StackException;

    /**
     * Extrae el elemento del tope de la pila
     *
     * @return El elemento del tope de la pila
     * @throws StackException Si la pila esta vacia
     */
    public T pop() throws StackException;

    /**
     * Inspecciona el elemento del tope de la pila sin extraerlo
     *
     * @return El elemento del tope de la pila
     * @throws StackException Si la pila esta vacia
     */
    public T peek() throws StackException;

    /**
     * Determina si la pila se encuentra vacia
     *
     * @return true si la pila se encuentra vacia, false en caso contrario.
     */
    public boolean empty();
}
