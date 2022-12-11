/*
* ListException.java
* Creada el 19 de septiembre de 2021, 2:28 PM
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IList.Alumno; José Jesús Orozco Hernández
 * ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class ListException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public ListException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public ListException(String msj) {
        super(msj);
    }
}
