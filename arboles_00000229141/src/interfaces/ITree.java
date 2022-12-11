/*
* ITree.java
* Creada el 21 de noviembre del 2021 5:30 PM
 */
package interfaces;

import excepciones.TreeException;

/**
 * Esta interfaz generica establece los métodos a implementar por una clase que
 * modele un arbol general
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
 * @author José Jesús
 */
public interface ITree<T> {

    /**
     * Regresa el dato en la raiz del arbol
     *
     * @return El dato en la raiz del arbol
     * @throws TreeException Si el arbol esta vacio
     */
    public T getRootData() throws TreeException;

    /**
     * Regresa la altura del arbol
     *
     * @return La altura del arbol
     */
    public int getHeight();

    /**
     * Regresa el numero de nodos del arbol
     *
     * @return El numero de nodos del arbol
     */
    public int getNumberNodes();

    /**
     * Determina si un arbol esta vacio
     *
     * @return true si el arbol esta vacio, false en caso contrario
     */
    public boolean empty();

    /**
     * Vacia un arbol
     */
    public void clear();
}
