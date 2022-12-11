/*
* IList<T>.java
* Creada el 19 de septiembre de 2021, 2:28 PM
 */
package interfaces;

import excepciones.ListException;
import java.util.Iterator;

/**
 * Esta es una interfaz generica que establece los métodos a implementar por una clase que
 * modele una lista.
 * Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @param <T> Parámetro de tipo para los objetos a almacenarse en la lista.
 * @author José Jesús Orozco Hernández
 */
public interface IList<T> {

    /**
     * Inserta un elemento al final de la lista
     *
     * @param o Elemento a insertar
     * @throws ListException Si la lista esta llena
     */
    public void append(T o) throws ListException;

    /**
     * Inserta un elemento en la posición i de la lista
     *
     * @param o Elemento a insertar en la posición dada
     * @param i Posición i de la lista donde se inserta el elemento
     * @throws ListException Si la lista esta llena o i esta fuera de los
     * indices de la lista.
     */
    public void insert(T o, int i) throws ListException;

    /**
     * Reemplaza el elemento en la posición i de la lista
     *
     * @param o Elemento a reemplazar en la posición i de la lista
     * @param i Posición i de la lista del elemento a reemplazar
     * @throws ListException Si i esta fuera de los indices de la lista.
     */
    public void set(T o, int i) throws ListException;

    /**
     * Extrae el elemento de la posición i de la lista
     *
     * @param i Posición i de la lista del elemento a remover
     * @return El elemento de la posición i de la lista
     * @throws ListException Si la lista esta vacia o i esta fuera de los
     * indices de la lista.
     */
    public T remove(int i) throws ListException;

    /**
     * Inspecciona el elemento en la posición i de la lista sin obtenerlo
     *
     * @param i Posición i de la lista del elemento a inspeccionar
     * @return El elemento en la posición i
     * @throws ListException Si la lista esta vacia o i esta fuera de los
     * indices de la lista.
     */
    public T get(int i) throws ListException;

    /**
     * Nos determina si la lista se encuentra vacia o no
     *
     * @return true si la lista se encuentra vacia, false en caso contrario.
     */
    public boolean empty();

    /**
     * Regresa el numero de elementos en la lista
     *
     * @return El numero de elementos en la lista
     */
    public int size();

    /**
     * Regresa un iterador para esta lista
     *
     * @return EL iterador para la lista
     */
    public Iterator<T> iterator();

    /**
     * Encontrara el indice del elemento que coincidad con el paramtero dentro
     * de lista.
     *
     * @param o El elemento a buscar
     * @return El indice si este existe, -1 en caso contrario.
     */
    public int indexOf(T o);

    /**
     * Eliminara el elemento que coincida con el paramtetro que este dentro de
     * la lista.
     *
     * @param o El elemento a eliminar
     * @return Verdadero si este fue eliminado, falso en caso contrario
     */
    public boolean remove(T o);

    /**
     * Eliminara todos los elementos de la lista
     */
    public void clear();

}
