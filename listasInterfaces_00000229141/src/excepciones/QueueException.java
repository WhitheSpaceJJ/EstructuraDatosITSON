

/*
* ListException.java
* Creada el 19 de septiembre de 2021, 2:28 PM
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IQueue.Alumno; José Jesús Orozco Hernández
 * ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class QueueException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public QueueException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public QueueException(String msj) {
        super(msj);
    }
}
