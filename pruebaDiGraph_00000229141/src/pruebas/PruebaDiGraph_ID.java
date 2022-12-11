/*
 * PruebaDiGraph.java
 * Creada el 2 de diciembre del 2021 16:50 PM  
 */
package pruebas;

import excepciones.GraphException;
import implementaciones.DiGraph;
import implementaciones.LinkedList;

/**  
 * Clase de prueba para un grafo dirigido.
 * Alumno; José Jesus Orozco Hernandez ID; 00000229141
 * @author José Jesús 
 */
public class PruebaDiGraph_ID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nGrafo Dirigido");
        System.out.println("\nSe instancia un grafo dirigido");
        DiGraph<String, String, Double> diGraph = new DiGraph(20);
        System.out.println("\nSe agregan vertices al grafo\n");
        System.out.println("diGraph.addVertex(\"A\")");
        diGraph.addVertex("A");
        System.out.println("diGraph.addVertex(\"B\")");
        diGraph.addVertex("B");
        System.out.println("diGraph.addVertex(\"C\")");
        diGraph.addVertex("C");
        System.out.println("diGraph.addVertex(\"D\")");
        diGraph.addVertex("D");
        System.out.println("diGraph.addVertex(\"E\")");
        diGraph.addVertex("E");
        System.out.println("\n" + diGraph);
        System.out.println("\nSe agregan aristas entre losvertices\n");
        System.out.println("diGraph.addEdge(\"A\", \"B\")");
        try {
            diGraph.addEdge("A", "B");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"A\", \"D\")");
        try {
            diGraph.addEdge("A", "D");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"B\", \"C\")");
        try {
            diGraph.addEdge("B", "C");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"B\", \"E\")");
        try {
            diGraph.addEdge("B", "E");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"C\", \"E\")");
        try {
            diGraph.addEdge("C", "E");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"D\", \"B\")");
        try {
            diGraph.addEdge("D", "B");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"E\", \"A\")");
        try {
            diGraph.addEdge("E", "A");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.addEdge(\"G\", \"A\")");
        try {
            diGraph.addEdge("G", "A");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("\n" + diGraph);
        System.out.println("\nSe agregan valores a las aristas\n");
        System.out.println("diGraph.setEdgeValue(\"A\", \"B\", \"d\",1.5)");
        try {
            diGraph.setEdgeValue("A", "B", "d", 1.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"A\", \"B\", \"p\",1.0)");
        try {
            diGraph.setEdgeValue("A", "B", "p", 1.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"A\", \"D\", \"d\",2.0)");
        try {
            diGraph.setEdgeValue("A", "D", "d", 2.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"B\", \"C\", \"d\", 3.3)");
        try {
            diGraph.setEdgeValue("B", "C", "d", 3.3);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"B\", \"E\", \"p\", 2.5)");
        try {
            diGraph.setEdgeValue("B", "E", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"C\", \"E\", \"p\", 2.9)");
        try {
            diGraph.setEdgeValue("C", "E", "p", 2.9);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"D\", \"B\", \"d\", 4.0)");
        try {
            diGraph.setEdgeValue("D", "B", "d", 4.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"D\", \"B\", \"p\", 3.0)");
        try {
            diGraph.setEdgeValue("D", "B", "p", 3.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }

        System.out.println("diGraph.setEdgeValue(\"E\", \"A\", \"d\",2.0)");
        try {
            diGraph.setEdgeValue("E", "A", "d", 2.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"E\", \"A\", \"p\",2.5)");
        try {
            diGraph.setEdgeValue("E", "A", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("diGraph.setEdgeValue(\"D\", \"A\", \"p\", 2.5)");
        try {
            diGraph.setEdgeValue("D", "A", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("\n" + diGraph);
        System.out.println("");
        System.out.println("Se determinara si hay una arista entre los siguientes pares de vértices:");
        System.out.println("(“A”, “B”), (“A”,“C”), (“B”, “C”), (“B”, “D”), (“C”, “E”), (“D”, “A”) y (“E”, “A”).");
        System.out.println("");
        System.out.println("diGraph.adjacent(\"A\", \"B\")");
        try {
            boolean a = diGraph.adjacent("A", "B");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"A\", \"C\")");
        try {
            boolean a = diGraph.adjacent("A", "C");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"B\", \"C\")");
        try {
            boolean a = diGraph.adjacent("B", "C");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"B\", \"D\")");
        try {
            boolean a = diGraph.adjacent("B", "D");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"C\", \"E\")");
        try {
            boolean a = diGraph.adjacent("C", "E");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"D\", \"A\")");
        try {
            boolean a = diGraph.adjacent("D", "A");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("diGraph.adjacent(\"E\", \"A\")");
        try {
            boolean a = diGraph.adjacent("E", "A");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("Lista de vertices");
        LinkedList<String> lista = diGraph.getVertices();
        System.out.println("Lista; " + lista);
        System.out.println("");
        System.out.println("Lista de vecinos entrantes para el vertice A");
        LinkedList<String> a = diGraph.incomingNeighbors("A");
        System.out.println("Lista; " + a);
        System.out.println("");
        System.out.println("Lista de vecinos salientes para el vertice A");
        LinkedList<String> as = diGraph.outgoingNeighbors("A");
        System.out.println("Lista; " + as);
        System.out.println("");
        System.out.println("Lista de vecinos entrantes para el vertice B");
        LinkedList<String> b = diGraph.incomingNeighbors("B");
        System.out.println("Lista; " + b);
        System.out.println("");
        System.out.println("Lista de vecinos salientes para el vertice B");
        LinkedList<String> bs = diGraph.outgoingNeighbors("B");
        System.out.println("Lista; " + bs);
        System.out.println("");
        System.out.println("Lista de vecinos entrantes para el vertice C");
        LinkedList<String> c = diGraph.incomingNeighbors("C");
        System.out.println("Lista; " + c);
        System.out.println("");
        System.out.println("Lista de vecinos salientes para el vertice C");
        LinkedList<String> cs = diGraph.outgoingNeighbors("C");
        System.out.println("Lista; " + cs);
        System.out.println("");
        System.out.println("Lista de vecinos entrantes para el vertice D");
        LinkedList<String> d = diGraph.incomingNeighbors("D");
        System.out.println("Lista; " + d);
        System.out.println("");
         System.out.println("Lista de vecinos salientes para el vertice D");
        LinkedList<String> ds = diGraph.outgoingNeighbors("D");
        System.out.println("Lista; " + ds);
        System.out.println("");
        System.out.println("Lista de vecinos entrantes para el vertice E");
        LinkedList<String> e = diGraph.incomingNeighbors("E");
        System.out.println("Lista; " + e);
        System.out.println("");
        System.out.println("Lista de vecinos salientes para el vertice E");
        LinkedList<String> es = diGraph.outgoingNeighbors("E");
        System.out.println("Lista; " + es);
     

    }

}
