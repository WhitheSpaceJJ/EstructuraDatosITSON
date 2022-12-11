/*
 * CircularQueue<T>.java
* Creada el 10 de octubre de 2021, 16:47 PM
 */
package implementaciones;

import excepciones.QueueException;
import interfaces.IQueue;

/**
 * Esta clase generica implementa una cola circular sobre un arreglo. Nombre;
 * José Jesús Orozco Hernández Id; 00000229141
 *
 * @param <T> Tipo de los elementos que se almacenaran en la cola circular.
 * @author José Jesus Orozco Hernandez.
 */
public class CircularQueue<T> implements IQueue<T> {

    public int tamCola, inicio, fin;
    private T[] colaC;

    /**
     * Constructor que iniciliza el tamaño del arreglo, deacuerdo a el tamaño
     * que recibe de paramtero, ademas inicializa inicio y fin a -1, numElemento
     * a 0.
     *
     * @param tipoDato Tipo de dato.
     * @param tamCola Tamaño de la cola circular.
     */
    public CircularQueue(Class<T> tipoDato, int tamCola) {
        if (tamCola < 0) {
            throw new QueueException("Tamaño de lista negativo");
        }
        this.tamCola = tamCola;
        colaC = (T[]) java.lang.reflect.Array.newInstance(tipoDato,
                tamCola);
        fin = inicio = -1;
    }

    /**
     * Agrega un elemento en el fin de la cola circular.
     *
     * @param t Elemento a agregar.
     * @throws QueueException Si la cola circularesta llena
     */
    @Override
    public void enqueue(T t) throws QueueException {
        //Determina si la cola esta llena
        if (full()) {
            throw new QueueException("Cola circular llena");
        }
        //Condicion axuliar para agregar o no el elemento al fin de la cola
        if (fin == tamCola - 1 && inicio != 0) {
            fin = 0;
        } else {
            fin++;
            colaC[fin] = t;
        }
        //Si inicio es igual a .1 sumarle 1 a inicio
        if (inicio == -1) {
            inicio++;
        }
    }

    /**
     * Extrae el elemento del inicio de la cola Circular.
     *
     * @return El elemento extraído.
     * @throws QueueException Si la cola circular esta vacia
     */
    @Override
    public T dequeue() {
        //Variable de apoyo para el elemento extraido
        T a = null;
        if (empty()) {
            throw new QueueException("Cola circular Vacia");
        } else {
            //Condicion auxiliar que si inicio y fin son iguales se establece a -1 cada variable y si no
            if (inicio == fin) {
                a=colaC[inicio];
                inicio = fin = -1;
            } else {
                //Condicion auxiliar para determinar donde se encuentra el inicio.
                if (inicio < fin) {
                    a = colaC[inicio];
                    inicio++;
                } else if (inicio == tamCola - 1) {
                    a = colaC[inicio];
                    inicio = 0;
                }
            }
        }
        return a;
    }

    /**
     * Inspecciona el elemento del inicio de la cola circular, sin extraerlo.
     *
     * @return El elemento inspeccionado.
     * @throws QueueException Si la cola circular esta vacia.
     */
    @Override
    public T peek() throws QueueException {
        //Determina si la cola esta vacia
        if (empty()) {
            throw new QueueException("Cola circular vacia");
        } else {
            return colaC[inicio];
        }
    }

    /**
     * Nos determina si la cola se encuentra vacia o no
     *
     * @return true si la cola se encuentra vacia, false en caso contrario.
     */
    @Override
    public boolean empty() {
        return inicio == -1 && fin == -1;
    }

    /**
     * Nos determina si la bolsa esta llena.
     *
     * @return true si la bolsa esta llena, false en caso contrario.
     */
    private boolean full() {
        return (fin == tamCola - 1 && inicio == 0) || (fin + 1 == inicio);
    }

    @Override
    public String toString() {
        //Se determina si la cola esta vacia
        String a = "[";
        if (!empty()) {
            for (int i = inicio; i < fin + 1; i++) {
                a += colaC[i] + ",";
            }
            a = a.substring(0, a.length() - 1);
            a += "]"  ;
            return a;
        }
        //Si la cola esta vacia regresa la siguiente cadena
        return "[]";
    }
}
