/*
* IQueue<T>.java
* Creada el 19 de septiembre de 2021, 2:28 PM
 */
package interfaces;

import excepciones.QueueException;

/**
 * Esta es una interfaz generica que establece los métodos a implementar por una
 * clase que modele una Cola. Alumno; José Jesús Orozco Hernández
 * ID:00000229141
 *
 * @param <T> Parámetro de tipo para los objetos a almacenarse en la lista.
 * @author José Jesús Orozco Hernández
 */
public interface IQueue<T> {

    /**
     * Agrega un elemento en el fin de la cola.
     *
     * @param t Elemento a agregar.
     * @throws QueueException Si la cola esta llena
     */
    public void enqueue(T t) throws QueueException;

    /**
     * Extrae el elemento del inicio de la cola.
     *
     * @return El elemento extraído.
     * @throws QueueException Si la cola esta vacia
     */
    public T dequeue() throws QueueException;

    /**
     * Inspecciona el elemento del inicio de la cola, sin extraerlo.
     *
     * @return El elemento inspeccionado.
     * @throws QueueException Si la cola esta vacia.
     */
    public T peek() throws QueueException;

    /**
     * Nos determina si la cola se encuentra vacia o no
     *
     * @return true si la cola se encuentra vacia, false en caso contrario.
     */
    public boolean empty();

}
