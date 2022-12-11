/*
* DiGraph.java
* Creada el 2 de diciembre del 2021 15:34 PM
 */
package implementaciones;

import excepciones.GraphException;
import interfaces.IDiGraph;
import java.util.HashMap;

/**
 * Esta clase implementa un grafo dirigido Alumno; José Jesús Orozco Hernández
 * ID; 00000229141
 *
 * @param <T> Tipo del vertice del grafo
 * @param <K> Tipo de la llave del dato a almacenar en una arista
 * @param <V> Tipo del dato a almacenar en una arista
 *
 * @author José Jesús Orozco Hernández
*/
public class DiGraph<T, K, V> extends Graph<T, K, V> implements
        IDiGraph<T, K, V> {

    /**
     * Constructor de la clase
     *
     * @param maxVertices Numero maximo de vertices en el grafo
     */
    public DiGraph(int maxVertices) {
        super(maxVertices);
    }

    /**
     * Agrega una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    @Override
    public void addEdge(T verticeX, T verticeY)
            throws GraphException {
// Verifica si el verticeX existe
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
// Verifica si el verticeY existe
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
// Agrega la arista
        adyacencias[indicex][indicey] = new HashMap<>();
    }


    /**
     *
     * Elimina una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    @Override
    public void removeEdge(T verticeX, T verticeY)
            throws GraphException {
// Verifica si el verticeX existe
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
// Verifica si el verticeY existe
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
// Verifica si la arista existe
        if (adyacencias[indicex][indicey] == null) {
            throw new GraphException("Arista " + verticeX + " - "
                    + verticeY + " inexistente");
        }
// Elimina la arista
        adyacencias[indicex][indicey] = null;
    }

    /**
     * Obtiene el valor asociado a la llave en la arista entre los vertices
     * verticeX y verticeY
     *
     * @param verticeX Vertice origen
     * @param verticeY Vertice destino
     * @param llave Llave con la que esta asociado el valor en la arista entre
     * losvertices verticeX y verticeY
     * @return El valor asociado asociado a la llave llave en la arista entre
     * los vertices verticeX y verticeY si existe, null en caso contrario
     * @throws GraphException Si los vertices verticeX o verticeY no existen
     */
    @Override
    public V getEdgeValue(T verticeX, T verticeY, K llave) {
// Verifica si el verticeX existe
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
// Verifica si el verticeY existe
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
// Verifica si la arista existe
        if (adyacencias[indicex][indicey] == null) {
            throw new GraphException("Arista " + verticeX + " - "
                    + verticeY + " inexistente");
        }
        return (V) adyacencias[indicex][indicey].get(llave);
    }

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
    @Override
    public void setEdgeValue(T verticeX, T verticeY, K llave, V dato)
            throws GraphException {
// Verifica si el verticeX existe
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
// Verifica si el verticeY existe
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
// Verifica si la arista existe
        if (adyacencias[indicex][indicey] == null) {
            throw new GraphException("Arista " + verticeX + " - "
                    + verticeY + " inexistente");
        }
        adyacencias[indicex][indicey].put(llave, dato);
    }

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
    @Override
    public void removeEdgeValue(T verticeX, T verticeY, K llave)
            throws GraphException {
// Verifica si el verticeX existe
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
// Verifica si el verticeY existe
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
// Verifica si la arista existe
        if (adyacencias[indicex][indicey] == null) {
            throw new GraphException("Arista " + verticeX + " - "
                    + verticeY + " inexistente");
        }
        adyacencias[indicex][indicey].remove(llave);
    }

    /**
     * Determina si hay una arista entre los vertices verticeX y verticeY.
     *
     * @param verticeX Vetice x
     * @param verticeY Vertice y
     * @return true si del vertice x al y o viceversa cuenta con una arista,
     * false en caso contrario.
     * @throws GraphException
     */
    @Override
    public boolean adjacent(T verticeX, T verticeY) throws GraphException {
        int indicex = vertices.indexOf(verticeX);
        if (indicex == -1) {
            throw new GraphException("Vertice " + verticeX
                    + " inexistente");
        }
        int indicey = vertices.indexOf(verticeY);
        if (indicey == -1) {
            throw new GraphException("Vertice " + verticeY
                    + " inexistente");
        }
        if (adyacencias[indicex][indicey] != null) {
            return true;
        } else if (adyacencias[indicey][indicex] != null) {
            return true;
        }
        return false;
    }

    /**
     * Obtiene la lista de todos los vértices vecinos entrantes al vértice
     * vertice. Son todos los vertices verticeI tal que hay una arista dirigida
     * del vértice verticeI al vertice vertice.
     *
     * @param vertice vertice a obtener sus vecinos entrantes
     * @return la lista de todos los vértices vecinos entrantes al vértice.
     * @throws GraphException si el vertice no existe
     */
    @Override
    public LinkedList<T> incomingNeighbors(T vertice) throws GraphException {
        LinkedList<T> verticesE = new LinkedList<>();
        int indice = vertices.indexOf(vertice);
        if (indice == -1) {
            throw new GraphException("Vertice " + vertice
                    + " inexistente");
        }
        for (int i = 0; i < nVertices; i++) {
            if (adyacencias[i][indice] != null) {
                verticesE.append(vertices.get(i));
            }
        }
        return verticesE;
    }

    /**
     * Obtiene la lista de todos los vértices vecinos salientes de vertice. Son
     * todos los vertices verticeI tal que hay una arista dirigida del vértice
     * vertice al vertice verticeI.
     *
     * @param vertice vertice a obtener sus vecinos salientes
     * @return la lista de todos los vértices vecinos salientes de vertice.
     * @throws GraphException GraphException si el vertice no existe
     */
    @Override
    public LinkedList<T> outgoingNeighbors(T vertice) throws GraphException {
        LinkedList<T> verticesE = new LinkedList<>();
        int indice = vertices.indexOf(vertice);
        if (indice == -1) {
            throw new GraphException("Vertice " + vertice
                    + " inexistente");
        }
        for (int i = 0; i < nVertices; i++) {
            if (adyacencias[indice][i] != null) {
                verticesE.append(vertices.get(i));
            }
        }
        return verticesE;
    }
}
