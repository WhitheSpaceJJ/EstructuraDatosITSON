/*
* PruebaBinarySearchTree.java
* Creada el 25 de noviembre del 2021 16:24  PM
 */
package pruebas;

import implementaciones.BinarySearchTree;
import implementaciones.IntegerCompara;
import implementaciones.StringCompara;
import java.util.Iterator;

/**
 * Clase de prueba para busqueda binaria.
 * Alumno; José Jesús Orozco Hernández ID; 00000229141
 * @author Josè Jesùs 
 */
public class PruebaBinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaBinarySearchTree prueba = new PruebaBinarySearchTree();
        System.out.println("Arbol binario de busqueda con enteros");
        System.out.println("Se instancia un arbol binario de busqueda de tipo Integer ");
        BinarySearchTree<Integer> intBinarySearchTree = new BinarySearchTree<>(new IntegerCompara());
        System.out.println("intBinarySearchTree:" + intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("Se insertan nodos");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(8)");
        intBinarySearchTree.insert(8);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(2)");
        intBinarySearchTree.insert(2);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(9)");
        intBinarySearchTree.insert(9);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(1)");
        intBinarySearchTree.insert(1);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(4)");
        intBinarySearchTree.insert(4);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(3)");
        intBinarySearchTree.insert(3);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(5)");
        intBinarySearchTree.insert(5);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("intTree.insert(11)");
        intBinarySearchTree.insert(11);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Obtiene el dato menor del árbol");
        System.out.println("intDatoMenor = intBinarySearchTree.firstKey();");
        Integer intDatoMenor = intBinarySearchTree.firstEntry();
        System.out.println("El dato menor de " + prueba.listaNodosEnorden(intBinarySearchTree)
                + " es: " + intDatoMenor);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Obtiene el dato mayor del árbol");
        System.out.println("intDatoMayor = intBinarySearchTree.lastKey();");
        Integer intDatoMayor = intBinarySearchTree.lastEntry();
        System.out.println("El dato mayor de " + prueba.listaNodosEnorden(intBinarySearchTree)
                + " es: " + intDatoMayor);
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Se obtiene el dato 4; ");
        Integer a = intBinarySearchTree.get(4);
        System.out.println("El dato " + ((a != null) ? (a + " Si existe") : " No existe"));
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Se obtiene el dato 11; ");
        Integer b = intBinarySearchTree.get(11);
        System.out.println("El dato " + ((b != null) ? (b + " Si existe") : " No existe"));
        System.out.println(intBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(intBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Arbol binario de busqueda con String");
        System.out.println("Se instancia un arbol binario de busqueda de tipo String ");
        BinarySearchTree<String> stringBinarySearchTree = new BinarySearchTree<>(new StringCompara());
        System.out.println("stringBinarySearchTree:" + stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("Se insertan nodos");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("stringTree.insert(H)");
        stringBinarySearchTree.insert("H");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(B)");
        stringBinarySearchTree.insert("B");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(I)");
        stringBinarySearchTree.insert("I");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(A)");
        stringBinarySearchTree.insert("A");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(D)");
        stringBinarySearchTree.insert("D");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(C)");
        stringBinarySearchTree.insert("C");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(E)");
        stringBinarySearchTree.insert("E");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
          System.out.println("stringTree.insert(K)");
        stringBinarySearchTree.insert("K");
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Obtiene el dato menor del árbol");
        System.out.println("stringDatoMenor = stringBinarySearchTree.firstKey();");
        String stringDatoMenor = stringBinarySearchTree.firstEntry();
        System.out.println("El dato menor de " + prueba.listaNodosEnorden(stringBinarySearchTree)
                + " es: " + stringDatoMenor);
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Obtiene el dato mayor del árbol");
        System.out.println("intDatoMayor = intTree.lastKey();");
        String stringDatoMayor = stringBinarySearchTree.lastEntry();
        System.out.println("El dato mayor de " + prueba.listaNodosEnorden(stringBinarySearchTree)
                + " es: " + stringDatoMayor);
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Se obtiene el dato D; ");
        String ad = stringBinarySearchTree.get("D");
        System.out.println("El dato " + ((ad != null) ? (ad + " Si existe") : " No existe"));
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Se obtiene el dato M; ");
        String bd = stringBinarySearchTree.get("M");
        System.out.println("El dato " + ((bd != null) ? (bd + " Si existe") : " No existe"));
        System.out.println(stringBinarySearchTree);
        System.out.println("Nodos del arbol en orden: " + prueba.listaNodosEnorden(stringBinarySearchTree));
        System.out.println("-------------------------------------------------------------------");
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
    public <T> String listaNodosEnorden(BinarySearchTree<T> arbol) {
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
}
