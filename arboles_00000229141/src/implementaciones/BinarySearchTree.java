/*
* BinarySearchTree.java
* Creada el 25 de noviembre del 2021 11:08 PM
 */
package implementaciones;

import interfaces.ICompara;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Esta clase implementa un arbol binario de busqueda generico Alumno; José
 * Jesús Orozco Hernández ID; 00000229141
 *
 * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
 *
 * @author José Jesús
 */
public class BinarySearchTree<T> extends BinaryTreeComun<T> {

    private ICompara compara;

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
// Si aun hay nodos en la pila y el nodo actual no es nulo
            return !pilaNodos.empty() || (nodoActual != null);
        }

        @Override
        public T next() {
            NodoArbolBinario<T> nodoSig = null;
// Encuentra el nodo mas a la izquierda sin hijo
// izquierdo
            while (nodoActual != null) {
                pilaNodos.push(nodoActual);
                nodoActual = nodoActual.hijoIzq;
            }
// Obten el nodo mas a la izquierda
// luego ve a su nodo derecho
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
     * Crea un arbol binario de busqueda vacio. Inicializa la clase con el
     * metodo para comparar los datos
     *
     * @param compara Clase con el metodo para comparar los datos
     */
    public BinarySearchTree(ICompara compara) {
        raiz = null;
        this.compara = compara;
    }

    /**
     * Driver para el metodo recursivo para agregar un nodo al arbol
     *
     * @param dato Dato del nodo a agregar al arbol
     */
    public void insert(T dato) {
        raiz = insert(raiz, dato);
    }

    /**
     * Metodo recursivo para agregar un nodo al arbol
     *
     * @param nodo Subarbol al que se le agrega recursivamente el nodo
     * @param dato Dato del nodo a agregar al subarbol
     * @return Subarbol al que se le agrego recursivamente el nodo
     */
    private NodoArbolBinario<T> insert(NodoArbolBinario<T> nodo,
            T dato) {
// Caso base
// Si el subarbol es vacio, regresa el nodo a agregar
        if (nodo == null) {
            return new NodoArbolBinario(dato);
        }
// Casos recursivos
// Se determina a que subarbol se agregara el nodo
        if (compara.compara(dato, nodo.dato) < 0) {
            nodo.hijoIzq = insert(nodo.hijoIzq, dato);
        } else {
            nodo.hijoDer = insert(nodo.hijoDer, dato);
        }
        return nodo;
    }

    /**
     * Driver para el metodo recursivo para eliminar un nodo del arbol
     *
     * @param dato Dato a eliminar del arbol
     */
    public void remove(T dato) {
        raiz = remove(raiz, dato);
    }

    /**
     * Metodo recursivo para eliminar un nodo del arbol
     *
     * @param nodo Subarbol del que se elimina recursivamente el nodo
     * @return Subarbol del que se elimino recursivamente el nodo
     */
    private NodoArbolBinario<T> remove(NodoArbolBinario<T> nodo,
            T dato) {
// Caso base
// Si el nodo a borrar no esta en el subarbol
        if (nodo == null) {
            return null;
        }
// Si es el nodo a borrar
        if (compara.compara(dato, nodo.dato) == 0) {
// Si el nodo a borrar es una hoja. Solo elimina el nodo
            if (nodo.hijoIzq == null && nodo.hijoDer == null) {
                return null;
            }
// Si el nodo a borrar solo tiene el hijo derecho
// sustituye el nodo a borrar por el subarbol derecho
            if (nodo.hijoIzq == null) {
                return nodo.hijoDer;
            }
// Si el nodo a borrar solo tiene el hijo izquierdo
// sustituye el nodo a borrar por el subarbol izquierdo
            if (nodo.hijoDer == null) {
                return nodo.hijoIzq;
            }
// Si el nodo a borrar tiene ambos hijos
// Encuentra el nodo con el dato mas pequeño que sea
// mayor al dato del nodo a borrar. Es el nodo mas
// a la izquierda del subarbol derecho
            NodoArbolBinario<T> nodoMenor
                    = findSmallestNode(nodo.hijoDer);
// Reemplaza el contenido del nodo a borrar por el
// contenido del nodo mas pequeño que sea mayor al
// nodo a borrar.
            nodo.dato = nodoMenor.dato;
// Elimina recursivamente el nodo con el dato mas
// pequeño que sea mayor al dato del nodo a borrar.
            nodo.hijoDer = remove(nodo.hijoDer, nodoMenor.dato);
        }
// Casos recursivos
// Se determina de que subarbol se eliminara el nodo
        if (compara.compara(dato, nodo.dato) < 0) {
            nodo.hijoIzq = remove(nodo.hijoIzq, dato);
        } else {
            nodo.hijoDer = remove(nodo.hijoDer, dato);
        }
        return nodo;
    }

    /**
     * Obtiene el nodo descendiente del nodo del parametro con el dato mas
     * pequeño. Es el nodo mas a la izquierda del nodo del parametro
     *
     * @param nodo Nodo del que se va buscar el nodo con el dato mas pequeño
     * @return El nodo con el dato mas pequeño que el dato del nodo del
     * parametro.
     */
    private NodoArbolBinario<T> findSmallestNode(NodoArbolBinario<T> nodo) {
        return nodo.hijoIzq == null ? nodo
                : findSmallestNode(nodo.hijoIzq);
    }

    /**
     * Obtiene el nodo descendiente del nodo del parametro con el dato mas
     * grande. Es el nodo mas a la derecha del nodo del parametro
     *
     * @param nodo Nodo del que se va buscar el nodo con el dato mas grande
     * @return El nodo con el dato mas grande que el dato del nodo del
     * parametro.
     */
    private NodoArbolBinario<T> findBiggestNode(NodoArbolBinario<T> nodo) {
        return nodo.hijoDer == null ? nodo
                : findBiggestNode(nodo.hijoDer);
    }

    /**
     * Regresa el dato más pequeño del arbol binario de búsqueda.
     *
     * @return El dato más pequeño del arbol binario de búsqueda.
     */
    public T firstEntry() {
// Si el arbol esta vacio
        if (raiz == null) {
            return null;
        }
// Encuentra el nodo con el dato más pequeña del arbol
// binario de búsqueda.
        NodoArbolBinario<T> nodo = findSmallestNode(raiz);
// Regresa el dato asociado al nodo
        return nodo.dato;
    }

    /**
     * Regresa el dato más grande del arbol binario de búsqueda.
     *
     * @return El dato más grande del arbol binario de búsqueda.
     */
    public T lastEntry() {
// Si el arbol esta vacio
        if (raiz == null) {
            return null;
        }
// Encuentra el nodo con el dato más grande del arbol
// binario de búsqueda.
        NodoArbolBinario<T> nodo = findBiggestNode(raiz);
// Regresa el dato asociado al nodo
        return nodo.dato;
    }

    /**
     * Obtiene un iterador para recorrer el arbol en orden
     *
     * @return Un iterador para recorrer el arbol en orden
     */
    public Iterator<T> getInorderIterator() {
        return new BinarySearchTree.InorderIterator();
    }

    /**
     * Metodo que regresa el dato del parámetro del árbol binario de búsqueda.
     *
     * @param dato Dato a buscar
     * @return Dato a regresar
     */
    public T get(T dato) {
        return get(raiz, dato);
    }

    /**
     * Busca recursivamente el dato del parámetro en el árbol del parámetro.
     *
     * @param nodo Subarbol al cual se le vuscara recursivamente el dato de un
     * nodo
     * @param dato Dato a buscar
     * @return Dato del nodo .
     */
    private T get(NodoArbolBinario<T> nodo, T dato) {
        T nodod = null;
        if (nodo == null) {
            return null;
        }
        int result = compara.compara(dato, nodo.dato);
        if (result < 0) {
            nodod = get(nodo.hijoIzq, dato);
        } else if (result > 0) {
            nodod = get(nodo.hijoDer, dato);
        } else {
            nodod = nodo.dato;
        }
        return nodod;
    }

//    /**
//     * Reemplaza el dato del parámetro por el dato datoNvo del parámetro.
//     *
//     * @param dato Dato que sera rempalzado
//     * @param datoNvo Dato que remplara el dato, a reemplazar.
//     */
//    public void set(T dato, T datoNvo) {
//        set(raiz, dato, datoNvo);
//    }
//
//    /**
//     * Busca recursivamente el dato del parámetro en el árbol del parámetro y lo
//     * reemplaza por el dato datoNvo del parámetro.
//     *
//     * @param nodo Subarbol al que se le reemplazara recursivamente el dato de
//     * un nodo, por otro dato
//     * @param dato Dato que sera rempalzado
//     * @param datoNvo Dato que remplara el dato, a reemplazar.
//     */
//    private void set(NodoArbolBinario<T> nodo, T dato, T datoNvo) {
//        if (nodo != null) {
//            int result = compara.compara(dato, nodo.dato);
//            if (result < 0) {
//                set(nodo.hijoIzq, dato, datoNvo);
//            } else if (result > 0) {
//                set(nodo.hijoDer, dato, datoNvo);
//            } else {
//                nodo.dato = datoNvo;
//            }
//        }
//
//    }

}
