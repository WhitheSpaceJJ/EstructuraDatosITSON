/*
* GraphException.java
* Creada el 26 de noviembre del 2021 9:47 PM 
 */
package excepciones;

/**
 * Esta clase implementa la excepcion lanzada por los metodos de las clases que
 * implementan la interfaz IGraph. Alumno; José Jesús Orozco Hernández ID;
 * 00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class GraphException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public GraphException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public GraphException(String msj) {
        super(msj);
    }
}
