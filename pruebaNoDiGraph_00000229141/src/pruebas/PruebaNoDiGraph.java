/*
 * PruebaNoDiGraph.java
 * Creada el 2 de diciembre del 2021 16:50 PM  
 */
package pruebas;

import excepciones.GraphException;
import implementaciones.LinkedList;
import implementaciones.NoDiGraph;

/**  
 * Clase de prueba para un grafo no dirigido.
 * Alumno; José Jesus Orozco Hernandez ID; 00000229141
 * @author José Jesús 
 */
public class PruebaNoDiGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nGrafo No Dirigido");
        System.out.println("\nSe instancia un grafo no dirigido");
        NoDiGraph<String, String, Double> graph = new NoDiGraph(20);
        System.out.println("\nSe agregan vertices al grafo\n");
        System.out.println("graph.addVertex(\"A\")");
        graph.addVertex("A");
        System.out.println("graph.addVertex(\"B\")");
        graph.addVertex("B");
        System.out.println("graph.addVertex(\"C\")");
        graph.addVertex("C");
        System.out.println("graph.addVertex(\"D\")");
        graph.addVertex("D");
        System.out.println("graph.addVertex(\"E\")");
        graph.addVertex("E");
        System.out.println("\n" + graph);
        System.out.println("\nSe agregan aristas entre los vertices\n");
        System.out.println("graph.addEdge(\"A\", \"B\")");
        try {
            graph.addEdge("A", "B");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"A\", \"D\")");
        try {
            graph.addEdge("A", "D");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"B\", \"C\")");
        try {
            graph.addEdge("B", "C");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"B\", \"E\")");
        try {
            graph.addEdge("B", "E");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"C\", \"E\")");
        try {
            graph.addEdge("C", "E");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"D\", \"B\")");
        try {
            graph.addEdge("D", "B");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"E\", \"A\")");
        try {
            graph.addEdge("E", "A");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.addEdge(\"G\", \"A\")");
        try {
            graph.addEdge("G", "A");
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("\n" + graph);
        System.out.println("\nSe agregan valores a las aristas\n");
        System.out.println("graph.setEdgeValue(\"A\", \"B\", \"d\",1.5)");
        try {
            graph.setEdgeValue("A", "B", "d", 1.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"A\", \"B\", \"p\",1.0)");
        try {
            graph.setEdgeValue("A", "B", "p", 1.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"A\", \"D\", \"d\",2.0)");
        try {
            graph.setEdgeValue("A", "D", "d", 2.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"B\", \"C\", \"d\", 3.3)");
        try {
            graph.setEdgeValue("B", "C", "d", 3.3);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"B\", \"E\", \"p\", 2.5)");
        try {
            graph.setEdgeValue("B", "E", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"C\", \"E\", \"p\", 2.9)");
        try {
            graph.setEdgeValue("C", "E", "p", 2.9);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"D\", \"B\", \"d\", 4.0)");
        try {
            graph.setEdgeValue("D", "B", "d", 4.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"D\", \"B\", \"p\", 3.0)");
        try {
            graph.setEdgeValue("D", "B", "p", 3.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }

        System.out.println("graph.setEdgeValue(\"E\", \"A\", \"d\",2.0)");
        try {
            graph.setEdgeValue("E", "A", "d", 2.0);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"E\", \"A\", \"p\",2.5)");
        try {
            graph.setEdgeValue("E", "A", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("graph.setEdgeValue(\"D\", \"A\", \"p\", 2.5)");
        try {
            graph.setEdgeValue("D", "A", "p", 2.5);
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("\n" + graph);
        System.out.println("");
        System.out.println("Se determinara si hay una arista entre los siguientes pares de vértices:");
        System.out.println("(“A”, “B”), (“A”,“C”), (“B”, “C”), (“B”, “D”), (“C”, “E”), (“D”, “A”) y (“E”, “A”).");
        System.out.println("");
        System.out.println("graph.adjacent(\"A\", \"B\")");
        try {
            boolean a = graph.adjacent("A", "B");
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
            boolean a = graph.adjacent("A", "C");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("graph.adjacent(\"B\", \"C\")");
        try {
            boolean a = graph.adjacent("B", "C");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("graph.adjacent(\"B\", \"D\")");
        try {
            boolean a = graph.adjacent("B", "D");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("graph.adjacent(\"C\", \"E\")");
        try {
            boolean a = graph.adjacent("C", "E");
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
            boolean a = graph.adjacent("D", "A");
            if (a) {
                System.out.println("Si existe una arista");
            } else {
                System.out.println("No existe ninguna arista");
            }
        } catch (GraphException ge) {
            System.out.println("Error: " + ge.getMessage());
        }
        System.out.println("");
        System.out.println("graph.adjacent(\"E\", \"A\")");
        try {
            boolean a = graph.adjacent("E", "A");
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
        LinkedList<String> lista = graph.getVertices();
        System.out.println("Lista; " + lista);
        System.out.println("");
        System.out.println("Lista de vertices vecinos al vertice A");
        LinkedList<String> a = graph.neighbors("A");
        System.out.println("Lista; " + a);
        System.out.println("");
        System.out.println("Lista de vertices vecinos al vertice B");
        LinkedList<String> b = graph.neighbors("B");
        System.out.println("Lista; " + b);
        System.out.println("");
        System.out.println("Lista de vertices vecinos al vertice C");
        LinkedList<String> c = graph.neighbors("C");
        System.out.println("Lista; " + c);
        System.out.println("");
        System.out.println("Lista de vertices vecinos al vertice D");
        LinkedList<String> d = graph.neighbors("D");
        System.out.println("Lista; " + d);
        System.out.println("");
        System.out.println("Lista de vertices vecinos al vertice E");
        LinkedList<String> e = graph.neighbors("E");
        System.out.println("Lista; " + e);

    }

}
