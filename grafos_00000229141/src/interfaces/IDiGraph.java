/*
* IDiGraph.java
* Creada el 26 de noviembre del 2021 14:21 PM 
 */
package interfaces;

import excepciones.GraphException;
import implementaciones.LinkedList;

/**
 * Esta interfaz declara los metodos que deben implementar una clase que
 * represente un grafo dirigido. Alumno; José Jesús Orozco Hernández
 * ID;00000229141
 *
 * @param <T> Tipo del vertice del grafo
 * @param <K> Tipo de la llave del dato a almacenar en una arista
 * @param <V> Tipo del dato a almacenar en una arista
 *
 * @author José Jesús Orozco Hernández
 */
public interface IDiGraph<T, K, V> extends IGraph<T, K, V> {

    /**
     * Agrega una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public void addEdge(T verticeX, T verticeY) throws GraphException;

    /**
     * Elimina una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public void removeEdge(T verticeX, T verticeY)
            throws GraphException;

    /**
     * Asocia el valor dato a la llave, en la arista entre los vertices verticeX
     * y verticeY
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @param llave Llave a la que se asocia el valor v en la arista entre los
     * vertices verticeX y verticeY
     * @param dato Valor a asociar a la llave llave en la arista entre los
     * vertices verticeX y verticeY
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public void setEdgeValue(T verticeX, T verticeY, K llave, V dato)
            throws GraphException;

    /**
     * Elimina el valor asociado a la llave, en la arista entre los vertices
     * verticeX y verticeY
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @param llave Llave a la que esta asociada el valor a eliminar de la
     * arista entre los vertices verticeX y verticeY
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public void removeEdgeValue(T verticeX, T verticeY, K llave) throws GraphException;

    /**
     * Obtiene el valor asociado a la llave en la arista entre los vertices
     * verticeX y verticeY
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @param llave Llave con la que esta asociado el valor v en la arista entre
     * los vertices verticeX y verticeY
     * @return El valor asociado asociado a la llave en la arista entre los
     * vertices verticeX y verticeY si existe, null en caso contrario
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public Object getEdgeValue(T verticeX, T verticeY, K llave)
            throws GraphException;

    /**
     * Determina si hay una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vertice a probar si esta conectado con verticeY
     * @param verticeY Vertice a probar si esta conectado con verticeX
     * @return true si hay una arista entre los vertices verticeX y verticeY,
     * false en caso contrario
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    public boolean adjacent(T verticeX, T verticeY)
            throws GraphException;

    /**
     * Obtiene la lista de todos los vértices vecinos entrantes al vertice. Son
     * todos los vertices verticeI tal que hay una arista dirigida del vértice
     * verticeI al vertice.
     *
     * @param vertice Vertice del que se quiere obtener la lista
     * @return La lista de todos los vertices vecinos entrantes al vertice
     * @throws GraphException Si el vertice vertice no existe
     */
    public LinkedList<T> incomingNeighbors(T vertice)
            throws GraphException;

    /**
     * Obtiene la lista de todos los vértices vecinos salientes de vertice. Son
     * todos los vertices verticeI tal que hay una arista dirigida del vértice
     * vertice al vertice verticeI.
     *
     * @param vertice Vertice del que se quiere obtener la lista
     * @return La lista de todos los vertices vecinos salientes de vertice
     * @throws GraphException Si el vertice vertice no existe
     */
    public LinkedList<T> outgoingNeighbors(T vertice)
            throws GraphException;
}
