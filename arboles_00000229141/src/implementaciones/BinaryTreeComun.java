/*
* BinaryTreeComun.java
* Creada el 21 de noviembre del 2021 5:30 PM
 */
package implementaciones;

import excepciones.TreeException;
import interfaces.ITree;

/**
 * Esta clase implementa los metodos de la interfaz generica ITree que obtienen
 * informacion de un arbol binario
 * Alumno; José Jesus Orozco Hernández ID; 00000229141
 * @author José Jesus
 *
 * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
 *
 */
public class BinaryTreeComun<T> implements ITree<T>  {

    NodoArbolBinario<T> raiz;
    int n;

    /**
     * Esta clase miembro representa un nodo de un arbol binario
     *
     * @author mdomitsu
     */
    class NodoArbolBinario<T> {

        T dato;
        NodoArbolBinario<T> hijoIzq;
        NodoArbolBinario<T> hijoDer;

        /**
         * Inicializa el atributo dato al valor de su parametro
         *
         * @param dato Dato a almacenar en el nodo
         */
        public NodoArbolBinario(T dato) {
            this.dato = dato;
        }
    }

    /**
     * Regresa el dato en la raiz del arbol
     *
     * @return El dato en la raiz del arbol
     * @throws TreeException Si el arbol esta vacio
     */
    @Override
    public T getRootData() throws TreeException {
        if (empty()) {
            throw new TreeException("Error: Arbol vacio");
        }
        return raiz.dato;
    }

    /**
     * Regresa la altura del arbol Driver para el metodo recursivo que obtiene
     * la altura del arbol
     *
     * @return La altura del arbol
     */
    @Override
    public int getHeight() {
        return getHeight(raiz);
    }

    /**
     * Regresa la altura del arbol Metodo recursivo que obtiene la altura del
     * arbol
     *
     * @return La altura del arbol
     */
    private int getHeight(NodoArbolBinario<T> nodo) {
        int height = 0;
        if (nodo != null) {
            height = 1 + Math.max(getHeight(nodo.hijoIzq),
                    getHeight(nodo.hijoDer));
        }
        return height;
    }

    /**
     * Regresa el numero de nodos del arbol Driver para el metodo recursivo que
     * obtiene el numero de nodos del arbol
     *
     * @return El numero de nodos del arbol
     */
    @Override
    public int getNumberNodes() {
        return getNumberNodes(raiz);
    }

    /**
     * Regresa el numero de nodos del arbol Metodo recursivo que obtiene el
     * numero de nodos del arbol
     *
     * @return El numero de nodos del arbol
     */
    private int getNumberNodes(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        int numNodosIzq = getNumberNodes(nodo.hijoIzq);
        int numNodosDer = getNumberNodes(nodo.hijoDer);
        return 1 + numNodosIzq + numNodosDer;
    }

    /**
     * Determina si un arbol esta vacio
     *
     * @return true si el arbol esta vacio, false en caso contrario
     */
    @Override
    public boolean empty() {
        return raiz == null;
    }

    /**
     * Vacia un arbol
     */
    @Override
    public void clear() {
        raiz = null;
    }

    /**
     * Regresa una cadena con la información de un arbol general
     *
     * @return Una cadena con la información de un arbol general
     */
    @Override
    public String toString() {
        String s = "";
        s += "Numero de nodos: " + getNumberNodes() + "\n";
        s += "Altura del arbol: " + getHeight() + "\n";
        if (!empty()) {
            s += "Dato en el nodo raiz: " + raiz.dato + "";
        } else {
            s += "El arbol esta vacio";
        }
        return s;
    }
}
