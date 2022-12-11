/*
 * ArrayLisQueue<T>.java
* Creada el 6 de octubre de 2021, 16:47 PM
 */
package implementaciones;

import excepciones.ListException;
import excepciones.QueueException;
import interfaces.IQueue;

/**
 * Esta clase generica implementa una cola sobre un ArrayList Nombre; José Jesús
 * Orozco Hernández Id; 00000229141
 *
 * @param <T> Tipo de los elementos que se almacenaran en la cola
 * @author José Jesus Orozco Hernandez
 */
public class ArrayListQueue<T> extends ArrayList<T> implements IQueue<T> {

    /**
     * Constructor que iniciliza los atributos del tipo de dato, y el tamño de
     * esta.
     *
     * @param tipoDato Tipo de dato
     * @param tamLista Tamaño de la lista
     */
    public ArrayListQueue(Class<T> tipoDato, int tamLista) {
        super(tipoDato, tamLista);
    }

    /**
     * Agrega un elemento en el fin de la cola.
     *
     * @param t Elemento a agregar.
     * @throws QueueException Si la cola esta llena
     */
    @Override
    public void enqueue(T t) throws QueueException {
        try {
            append(t);
        } catch (ListException le) {
            throw new QueueException("Cola llena");
        }
    }

    /**
     * Extrae el elemento del inicio de la cola.
     *
     * @return El elemento extraído.
     * @throws QueueException Si la cola esta vacia
     */
    @Override
    public T dequeue() throws QueueException {
        T o = null;
        try {
            o = remove(0);
        } catch (ListException le) {
            throw new QueueException("Cola Vacia");
        }
        return o;
    }

    /**
     * Inspecciona el elemento del inicio de la cola, sin extraerlo.
     *
     * @return El elemento inspeccionado.
     * @throws QueueException Si la cola esta vacia.
     */
    @Override
    public T peek() throws QueueException {
        T o = null;
        try {
            o = get(0);
        } catch (ListException le) {
            throw new QueueException("Cola Vacia");
        }
        return o;
    }

    /**
     *
     * Determina si la cola se encuentra vacia
     *
     * @return true si la cola esta vacia, false en caso contrario.
     */
    @Override
    public boolean empty() throws QueueException {
        return nElementos == 0;
    }

    /**
     * Genera una cadena con los valores de los elementos de la cola.
     *
     * @return La cadena con los valores de los elementos de la cola.
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
