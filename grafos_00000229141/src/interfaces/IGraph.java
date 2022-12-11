/*
* IGraph.java
* Creada el 26 de noviembre del 2021 14:21 PM
 */
package interfaces;

import excepciones.GraphException;
import implementaciones.LinkedList;
import java.util.HashMap;

/**
 *
 * Esta interfaz declara los metodos que deben implementar una clase que
 * represente un grafo
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * @param <T> Tipo del vertice del grafo
 * @param <K> Tipo de la llave del dato a almacenar en una arista
 * @param <V> Tipo del dato a almacenar en una arista
 *
 * @author José Jesús Orozco Hernández 
 */
public interface IGraph<T, K, V> {

    /**
     * Agrega un vertice al grafo, si no existe
     *
     * @param vertice Vertice a agregar al grafo
     * @throws GraphException Si no hay espacio para un nuevo vertice
     */
    public void addVertex(T vertice) throws GraphException;

    /**
     * Elimina un vertice del grafo, si existe
     *
     * @param vertice Vertice a eliminar
     * @throws GraphException Si el vertice a eliminar no existe
     */
    public void removeVertex(T vertice) throws GraphException;

    /**
     * Obtiene la lista de vertices del grafo.
     *
     * @return La lista de vertices del grafo.
     */
    public LinkedList<T> getVertices();

    /**
     * Obtiene la matriz de adyacencias del grafo.
     *
     * @return La matriz de adyacencias del grafo.
     */
    public HashMap<K, V>[][] getAdyacencias();
}
