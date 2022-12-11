/*
* ValueException.java
*
* Creada el 4 de septiembre de 2021, 02:08 PM
 */
package excepciones;

/**
 * Esta clase permite crear excepciones del ValueException.
 *
 * Las excepciones de este tipo serán lanzadas cuando un parámetro de un método
 * tengo un valor inválido. Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class ValueException extends RuntimeException {

    /**
     * Constructor por omision.
     */
    public ValueException() {
    }

    /**
     * Constructor que inicializa el atributo s de la clase padre.
     *
     * @param string Mensaje de error
     */
    public ValueException(String string) {
        super(string);
    }

}
