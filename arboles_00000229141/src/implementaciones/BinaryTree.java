/*
* BinaryTree.java
* Creada el 24 de noviembre del 2021 5:30 PM
 */
package implementaciones;

import interfaces.ITreeIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Esta clase implementa un arbol binario generico
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
 *
 * @author José Jesús 
 */
public class BinaryTree<T> extends BinaryTreeComun<T> implements ITreeIterator<T> {

    /**
     * Crea un arbol binario vacio
     */
    public BinaryTree() {
        raiz = null;
    }

    /**
     * Crea un arbo binario con un solo nodo con el dato del nodo raiz dado por
     * el parametro datoRaiz
     *
     * @param datoRaiz Dato a guardar en el nodo raiz
     */
    public BinaryTree(T datoRaiz) {
        raiz = new NodoArbolBinario(datoRaiz);
    }

    /**
     * Crea un arbol binario con el dato del nodo raiz y los subarboles
     * izquierdo y derecho dados por los parametros
     *
     * @param datoRaiz Dato a guardar en el nodo raiz
     * @param arbolIzq Subarbol izquierdo
     * @param arbolDer Subarbol derecho
     */
    public void BinaryTree(T datoRaiz, BinaryTree<T> arbolIzq,
            BinaryTree<T> arbolDer) {
        setTree(datoRaiz, arbolIzq, arbolDer);
    }

    /**
     * Establece el nodo raiz de un arbol a partir del dato del parametro. Los
     * subarboles son nulos.
     *
     * @param datoRaiz
     */
    public void setTree(T datoRaiz) {
        raiz = new NodoArbolBinario(datoRaiz);
    }

    /**
     * Establece un arbol binario con el dato del nodo raiz y los subarboles
     * izquierdo y derecho dados por los parametros
     *
     * @param datoRaiz Dato a guardar en el nodo raiz
     * @param arbolIzq Subarbol izquierdo
     * @param arbolDer Subarbol derecho
     */
    public void setTree(T datoRaiz, BinaryTree<T> arbolIzq,
            BinaryTree<T> arbolDer) {
        raiz = new NodoArbolBinario(datoRaiz);
        if ((arbolIzq != null) && !arbolIzq.empty()) {
            raiz.hijoIzq = copy(arbolIzq.raiz);
        }
        if ((arbolDer != null) && !arbolDer.empty()) {
            raiz.hijoDer = copy(arbolDer.raiz);
        }
    }

    /**
     * Regresa un subarbol del nodo del parametro
     *
     * @param nodo Nodo del que se obtendra el subarbol
     * @return Un subarbol del nodo del parametro
     */
    private NodoArbolBinario<T> copy(NodoArbolBinario<T> nodo) {
        NodoArbolBinario<T> nuevoNodo
                = new NodoArbolBinario<>(nodo.dato);
        if (nodo.hijoIzq != null) {
            nuevoNodo.hijoIzq = copy(nodo.hijoIzq);
        }
        if (nodo.hijoDer != null) {
            nuevoNodo.hijoDer = copy(nodo.hijoDer);
        }
        return nuevoNodo;
    }
  /**
     * Esta clase miembro implementa un iterador para recorrer un arbol binario
     * en pre-orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     */
    class PreorderIterator implements Iterator<T> {

        private LinkedListStack<NodoArbolBinario<T>> pilaNodos;
        private NodoArbolBinario<T> nodoActual;
        private int u = 1;

        /**
         * Inicializa los atributos de la clase
         */
        public PreorderIterator() {
            pilaNodos = new LinkedListStack<>();
            nodoActual = raiz;
        }

        /**
         * Determina si aun hay nodos del arbol binario sin recorrer
         *
         * @return true si aun hay nodos del arbol binario sin recorrer, false
         * en caso contrario.
         */
        @Override
        public boolean hasNext() {
            return !pilaNodos.empty() || (nodoActual != null);
        }
       /**
        * Metodo que devuelve el nodo actual del arbol binario en el precorrido pre-orden
        * @return El nodo actual.
        */
        @Override
        public T next() {
            NodoArbolBinario<T> nodo = null;
            if (pilaNodos.empty()) {
                pilaNodos.push(nodoActual);
            }
            if (!pilaNodos.empty()) {
                nodo = pilaNodos.pop();
                if (nodo.hijoDer != null) {
                    pilaNodos.push(nodo.hijoDer);
                }
                if (nodo.hijoIzq != null) {
                    pilaNodos.push(nodo.hijoIzq);
                }
                if (pilaNodos.empty()) {
                    nodoActual = null;
                }
            }
            return nodo.dato;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
   /**
    * Metodo que devuelve un iterador para el arbol pero en pre-orden-
    * @return Iterador para el arbol en pre-orden.
    */
    @Override
    public Iterator<T> getPreorderIterator() {
        return new PreorderIterator();

    }

    /**
     * Esta clase miembro implementa un iterador para recorrer un arbol binario
     * en post-orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     */
    class PostorderIterator implements Iterator<T> {

        private LinkedListStack<NodoArbolBinario<T>> pilaNodos;
        private NodoArbolBinario<T> nodoActual;
        private LinkedListStack<NodoArbolBinario<T>> auxiliar;

        /**
         * Inicializa los atributos de la clase
         */
        public PostorderIterator() {
            pilaNodos = new LinkedListStack<>();
            nodoActual = raiz;
            auxiliar = new LinkedListStack<>();

        }

        /**
         * Determina si aun hay nodos del arbol binario sin recorrer
         *
         * @return true si aun hay nodos del arbol binario sin recorrer, false
         * en caso contrario.
         */
        @Override
        public boolean hasNext() {
            return !auxiliar.empty() || (nodoActual != null);
        }
      /**
       * Metodo que devuelve el elemento actual del arbol en el recorrido post-orden
       * @return El nodo actual.
       */
        @Override
        public T next() {
            NodoArbolBinario<T> nodoSig = null;
            if(pilaNodos.empty()){
                pilaNodos.push(nodoActual);                
            }
            if (auxiliar.empty()) {
                while (!pilaNodos.empty()) {
                    nodoSig = pilaNodos.pop();
                    auxiliar.push(nodoSig);
                    if (nodoSig.hijoIzq != null) {
                        pilaNodos.push(nodoSig.hijoIzq);
                    }
                    if (nodoSig.hijoDer != null) {
                        pilaNodos.push(nodoSig.hijoDer);
                    }
                }
            }
            NodoArbolBinario<T> nodoRegreso = auxiliar.pop();
            if (auxiliar.empty()) {
                nodoActual = null;
            }
            return nodoRegreso.dato;
        }
//       

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Obtiene un iterador para recorrer el arbol en post-orden
     *
     * @return Un iterador para recorrer el arbol en post-orden
     */
    @Override
    public Iterator<T> getPostorderIterator() {
        return new PostorderIterator();

    }

    /**
     * Esta clase miembro implementa un iterador para recorrer un arbol binario
     * en orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     */
    class InorderIterator implements Iterator<T> {

        private LinkedListStack<NodoArbolBinario<T>> pilaNodos;
        private NodoArbolBinario<T> nodoActual;

        /**
         * Inicializa los atributos de la clase
         */
        public InorderIterator() {
            pilaNodos = new LinkedListStack<>();
            nodoActual = raiz;
        }

        /**
         * Determina si aun hay nodos del arbol binario sin recorrer
         *
         * @return true si aun hay nodos del arbol binario sin recorrer, false
         * en caso contrario.
         */
        @Override
        public boolean hasNext() {
            return !pilaNodos.empty() || (nodoActual != null);
        }
  /**
   * Metodo que devuelve el nod acrual del arbol en el recorrido post-orden.
   * @return nodo actual.
   */
        @Override
        public T next() {
            NodoArbolBinario<T> nodoSig = null;
            while (nodoActual != null) {
                pilaNodos.push(nodoActual);
                nodoActual = nodoActual.hijoIzq;
            }
            if (!pilaNodos.empty()) {
                nodoSig = pilaNodos.pop();
                nodoActual = nodoSig.hijoDer;
            } else {
                throw new NoSuchElementException();
            }
            return nodoSig.dato;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Obtiene un iterador para recorrer el arbol en orden
     *
     * @return Un iterador para recorrer el arbol en orden
     */
    @Override
    public Iterator<T> getInorderIterator() {
        return new InorderIterator();
    }
}
