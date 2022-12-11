/*
* StackException.java
* Creada el 21 de noviembre del 2021 6:25 PM
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IStack.
 *
 * @author José Jesús Orozco Hernández
 */
public class StackException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public StackException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public StackException(String msj) {
        super(msj);
    }
}
