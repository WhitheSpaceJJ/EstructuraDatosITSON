/*
 * PruebaArrayListQueue.java
 * Creada el 6 de octubre del 2021 16:10 PM
 */
package pruebas;

import excepciones.QueueException;
import implementaciones.ArrayListQueue;
import interfaces.IQueue;

/**
 * Clase que prueba los metodos de la clase ArrayListQueue(Cola). Alumno; Josè
 * Jesùs Orozco Hernàndez Id; 00000229141
 *
 * @author Josè Jesùs
 */
public class PruebaArrayListQueue {

    /**
     * Metodo main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Prueba Uno de enteros");
        System.out.println("---------------------------------------------------------");
        System.out.println("Se creara una instancia de la clase ArrayListQueue de tamaño 5, llamada\n"
                + "intQueue, para guardar enteros.");
        IQueue<Integer> intQueue = new ArrayListQueue<>(Integer.class, 5);
        System.out.println(intQueue);
        System.out.println("------------------------------------");
        try {
            System.out.println("Se agregaran los siguientes valores a la cola 1,2,3. ");
            System.out.println("intQueue.enqueue(1)");
            intQueue.enqueue(1);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(2)");
            intQueue.enqueue(2);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(3)");
            intQueue.enqueue(3);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se agregaran los siguientes valores a la cola 4,5. ");
            System.out.println("intQueue.enqueue(4)");
            intQueue.enqueue(4);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(5)");
            intQueue.enqueue(5);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("intQueue.dequeue()");
            intQueue.dequeue();
            System.out.println(intQueue);
            System.out.println("------------------------------------");
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("------------------------------------");
        }
        try {
            System.out.println("Se agregaran los siguientes valores a la cola 6,7,8,9,10,11 ");
            System.out.println("intQueue.enqueue(6)");
            intQueue.enqueue(6);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(7)");
            intQueue.enqueue(7);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(8)");
            intQueue.enqueue(8);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(9)");
            intQueue.enqueue(9);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(10)");
            intQueue.enqueue(10);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
            System.out.println("intQueue.enqueue(11)");
            intQueue.enqueue(11);
            System.out.println(intQueue);
            System.out.println("------------------------------------");
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("------------------------------------");
        }
        System.out.println();
        System.out.println();
        System.out.println("Prueba dos de String");
        System.out.println("---------------------------------------------------------");
        System.out.println("Se creara una instancia de la clase ArrayListQueue de tamaño 5, llamada\n"
                + "stringQueue, para guardar cadenas.");
        IQueue<String> stringQueue = new ArrayListQueue<>(String.class, 4);
        System.out.println(stringQueue);
        System.out.println("------------------------------------");
        try {
            System.out.println("Se agregaran las siguientes cadenas a la cola A,B");
            System.out.println("stringQueue.enqueue(A)");
            stringQueue.enqueue("A");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("stringQueue.enqueue(B)");
            stringQueue.enqueue("B");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("stringQueue.dequeue()");
            stringQueue.dequeue();
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("stringQueue.dequeue()");
            stringQueue.dequeue();
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("Se extraera un valor de la cola");
            System.out.println("stringQueue.dequeue()");
            stringQueue.dequeue();
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("------------------------------------");
        }

        try {
            System.out.println("Se agregaran las siguientes cadenas a la cola C,D,E,F,G.");
            System.out.println("stringQueue.enqueue(C)");
            stringQueue.enqueue("C");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("stringQueue.enqueue(D)");
            stringQueue.enqueue("D");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("stringQueue.enqueue(E)");
            stringQueue.enqueue("E");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("stringQueue.enqueue(F)");
            stringQueue.enqueue("F");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
            System.out.println("stringQueue.enqueue(G)");
            stringQueue.enqueue("G");
            System.out.println(stringQueue);
            System.out.println("------------------------------------");
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("------------------------------------");
        }
    }
}
