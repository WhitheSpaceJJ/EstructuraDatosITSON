/*
 * PruebaBinaryTree.java
 * Creada el 24 de noviembre del 2021 18:10 PM
 */
package pruebas;

import implementaciones.BinaryTree;
import java.util.Iterator;

/**
* Esta clase de prueba prueba los metodos de la clase BinaryTree.
* Crea varios arboles binarios
* Alumno; José Jesús Orozco Hernández ID; 00000229141
* @author José Jesús 
*/
public class PruebaBinaryTree {

    /**
     * Metodo main.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaBinaryTree prueba = new PruebaBinaryTree();
        System.out.println("Arboles binarios con objetos de tipo Integer");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree0 de tipo Integer vacio");
        BinaryTree<Integer> intBinaryTree0 = new BinaryTree<>();
        System.out.println("intBinaryTree0: \n" + intBinaryTree0);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree0));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree0));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree0));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree1 de tipo Integer,con el valor de 1 en la raíz.");
        BinaryTree<Integer> intBinaryTree1 = new BinaryTree<>(1);
        System.out.println("intBinaryTree1 \n" + intBinaryTree1);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree1));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree1));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree1));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree10 de tipo Integer,con el valor de 10 en la raíz.");
        BinaryTree<Integer> intBinaryTree10 = new BinaryTree<>(10);
        System.out.println("intBinaryTree10: \n" + intBinaryTree10);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree10));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree10));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree10));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree2 de tipo Integer,"
                + "con el valor 2 en la raíz y el árbol intBinaryTree1 como subárbol izquierdo.");
        BinaryTree<Integer> intBinaryTree2 = new BinaryTree<>();
        intBinaryTree2.setTree(2, intBinaryTree1, null);
        System.out.println("intBinaryTree2: \n" + intBinaryTree2);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree2));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree2));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree2));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree20 de tipo Integer,"
                + "con el valor 20 en la raíz y el árbol intBinaryTree10 como subárbol derecho.");
        BinaryTree<Integer> intBinaryTree20 = new BinaryTree<>();
        intBinaryTree20.setTree(20, null, intBinaryTree10);
        System.out.println("intBinaryTree20: \n" + intBinaryTree20);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree20));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree20));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree20));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree3 de tipo Integer,"
                + "con el valor 3 en la raíz y el árbol intBinaryTree2 como subárbol izquierdo.");
        BinaryTree<Integer> intBinaryTree3 = new BinaryTree<>();
        intBinaryTree3.setTree(3, intBinaryTree2, null);
        System.out.println("intBinaryTree3: \n" + intBinaryTree3);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree3));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree3));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree3));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario intBinaryTree4 de tipo Integer,"
                + "con el valor  4 en la raíz y el árbol intBinaryTree2 como subárbol izquierdo"
                + " y el arbol intBinaryTree20 como subarbol derecho.");
        BinaryTree<Integer> intBinaryTree4 = new BinaryTree<>();
        intBinaryTree4.setTree(4, intBinaryTree2, intBinaryTree20);
        System.out.println("intBinaryTree4: \n" + intBinaryTree4);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinaryTree4));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(intBinaryTree4));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(intBinaryTree4));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Arboles binarios con objetos de tipo String");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree0 de tipo String vacio");
        BinaryTree<String> stringBinaryTree0 = new BinaryTree<>();
        System.out.println("stringBinaryTree0: \n" + stringBinaryTree0);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree0));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree0));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree0));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree1 de tipo String,con el valor de 1 en la raíz.");
        BinaryTree<String> stringBinaryTree1 = new BinaryTree<>("A");
        System.out.println("stringBinaryTree1 \n" + stringBinaryTree1);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree1));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree1));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree1));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree10 de tipo String,con el valor de Z en la raíz.");
        BinaryTree<String> stringBinaryTree10 = new BinaryTree<>("Z");
        System.out.println("stringBinaryTree10: \n" + stringBinaryTree10);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree10));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree10));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree10));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree2 de tipo String,"
                + "con el valor 2 en la raíz y el árbol stringBinaryTree1 como subárbol izquierdo.");
        BinaryTree<String> stringBinaryTree2 = new BinaryTree<>();
        stringBinaryTree2.setTree("B", stringBinaryTree1, null);
        System.out.println("stringBinaryTree2: \n" + stringBinaryTree2);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree2));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree2));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree2));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree20 de tipo String,"
                + "con el valor Y en la raíz y el árbol stringBinaryTree10 como subárbol derecho.");
        BinaryTree<String> stringBinaryTree20 = new BinaryTree<>();
        stringBinaryTree20.setTree("Y", null, stringBinaryTree10);
        System.out.println("stringBinaryTree20: \n" + stringBinaryTree20);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree20));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree20));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree20));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree3 de tipo String,"
                + "con el valor C en la raíz y el árbol stringBinaryTree2 como subárbol izquierdo.");
        BinaryTree<String> stringBinaryTree3 = new BinaryTree<>();
        stringBinaryTree3.setTree("C", stringBinaryTree2, null);
        System.out.println("stringBinaryTree3: \n" + stringBinaryTree3);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree3));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree3));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree3));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Se instancia el arbol binario stringBinaryTree4 de tipo String,"
                + "con el valor  D en la raíz y el árbol stringBinaryTree2 como subárbol izquierdo"
                + " y el arbol stringBinaryTree20 como subarbol derecho.");
        BinaryTree<String> stringBinaryTree4 = new BinaryTree<>();
        stringBinaryTree4.setTree("D", stringBinaryTree2, stringBinaryTree20);
        System.out.println("stringBinaryTree4: \n" + stringBinaryTree20);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinaryTree4));
        System.out.println("Nodos del arbol en preorden: " + prueba.listaNodosPreorden(stringBinaryTree4));
        System.out.println("Nodos del arbol en postorden: " + prueba.listaNodosPostorden(stringBinaryTree4));
        System.out.println("---------------------------------------------------------------------");
    }

    /**
     * Genera una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     * @param arbol Arbol a recorrer
     * @return Una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en orden
     */
    public <T> String listaNodosEnorden(BinaryTree<T> arbol) {
        String s = "[";
        Iterator<T> inorderIterator = arbol.getInorderIterator();
        boolean hayNodos = inorderIterator.hasNext();
        while (hayNodos) {
            s += inorderIterator.next();
            hayNodos = inorderIterator.hasNext();
            if (hayNodos) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
    /**
     * Genera una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en pre-orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     * @param arbol Arbol a recorrer
     * @return Una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en pre-orden
     */
    public <T> String listaNodosPreorden(BinaryTree<T> arbol) {
        String s = "[";
        Iterator<T> preOrderIterator = arbol.getPreorderIterator();
        boolean hayNodos = preOrderIterator.hasNext();
        while (hayNodos) {
            s += preOrderIterator.next();
            hayNodos = preOrderIterator.hasNext();
            if (hayNodos) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
    /**
     * Genera una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en post-orden
     *
     * @param <T> Parámetro de tipo para los objetos a almacenarse en el arbol
     * @param arbol Arbol a recorrer
     * @return Una cadena con los datos de los nodos del arbol generico del
     * parametro, recorriendo el arbol en post-orden
     */
    public <T> String listaNodosPostorden(BinaryTree<T> arbol) {
        String s = "[";
        Iterator<T> postOrderIterator = arbol.getPostorderIterator();
        boolean hayNodos = postOrderIterator.hasNext();
        while (hayNodos) {
            s += postOrderIterator.next();
            hayNodos = postOrderIterator.hasNext();
            if (hayNodos) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

}
