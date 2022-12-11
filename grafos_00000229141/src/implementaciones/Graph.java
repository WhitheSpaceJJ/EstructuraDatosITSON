/*
* Graph.java
* Creada el 2 de diciembre del 2021 15:34 PM
 */
package implementaciones;

import excepciones.GraphException;
import interfaces.IGraph;
import java.util.HashMap;

/**
 * Esta clase implementa las operaciones comunes a un grafo dirigido y un grafo
 * no dirigido Alumno; José Jesús Orozco Hernández ID; 00000229141
 *
 * @param <T> Tipo del vertice del grafo
 * @param <K> Tipo de la llave del dato a almacenar en una arista
 * @param <V> Tipo del dato a almacenar en una arista
 * @author José Jesús Orozco Hernández
 */
public class Graph<T, K, V> implements IGraph<T, K, V> {

    protected LinkedList<T> vertices;
    protected HashMap<K, V> adyacencias[][];
    protected int nVertices;
    protected int maxVertices;

    /**
     * Constructor de la clase
     *
     * @param maxVertices Numero maximo de vertices en el grafo
     */
    public Graph(int maxVertices) {
        this.maxVertices = maxVertices;
        nVertices = 0;
        vertices = new LinkedList<>();
        adyacencias = new HashMap[maxVertices][maxVertices];
    }

    /**
     * Agrega un vertice al grafo, si no existe
     *
     * @param vertice Vertice a agregar al grafo
     * @throws GraphException Si no hay espacio para un nuevo vertice
     */
    @Override
    public void addVertex(T vertice) throws GraphException {
// Verifica si hay espacio en la matriz de adyacencias
// para un nuevo nodo
        if (nVertices >= maxVertices) {
            throw new GraphException("Grafo lleno");
        }
// Agrega el vertice
        vertices.append(vertice);
        nVertices++;
    }

    /**
     * Elimina un vertice del grafo, si existe
     *
     * @param vertice Vertice a eliminar
     * @throws GraphException Si el vertice a eliminar no existe
     */
    @Override
    public void removeVertex(T vertice) throws GraphException {
// Verifica si el vertice existe
        int indice = vertices.indexOf(vertice);
        if (indice == -1) {
            throw new GraphException("Vertice " + vertice
                    + " inexistente");
        }
// Elimina las adyacencias que tienen al vertice vertice como
// destino
// Se elimina la columna indice de la matriz de adyacencias
        for (int i = 0; i < nVertices; i++) {
            for (int j = indice; j < nVertices - 1; j++) {
                adyacencias[i][j] = adyacencias[i][j + 1];
            }
        }
// Elimina las adyacencias que tienen al vertice vertice como
// origen
// Elimina el renglon indice de la matriz de adyacencias
        for (int j = 0; j < nVertices - 1; j++) {
            for (int i = indice; i < nVertices - 1; i++) {
                adyacencias[i][j] = adyacencias[i + 1][j];
            }
        }
// Elimina el vertice
        vertices.remove(indice);
        nVertices--;
    }

    /**
     * Obtiene una cadena con una representacion del grafo
     *
     * @return Una cadena con una representacion del grafo
     */
    @Override
    public String toString() {
        String s = " ";
        for (int j = 0; j < nVertices; j++) {
            s += vertices.get(j);
            if (j < nVertices - 1) {
                s += " ";
            }
        }
        s += "\n";
        for (int i = 0; i < nVertices; i++) {
            s += vertices.get(i);
            s += " | ";
            for (int j = 0; j < nVertices; j++) {
                s += adyacencias[i][j];
                if (j < nVertices - 1) {
                    s += ", ";
                }
            }
            s += " |\n";
        }
        return s;
    }

    /**
     * Obtener la lista de vértices del grafo.
     *
     * @return LA lista de vertices del grafo
     */
    @Override
    public LinkedList<T> getVertices() {
        return vertices;
    }

    /**
     * Obtiene la matriz de adyacencias del grafo.
     *
     * @return La matriz de adyacentes del grafo.
     */
    @Override
    public HashMap<K, V>[][] getAdyacencias() {
        return adyacencias;
    }
}
