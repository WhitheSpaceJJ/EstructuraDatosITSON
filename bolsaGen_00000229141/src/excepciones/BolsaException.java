/*
* BolsaExceptionGen.java
* Creada el 10 de septiembre de 2021, 10:41 PM
 */
package excepciones;

/**
 * Esta clase permite crear excepciones del tipo BolsaExceptionGen.
 *
 * Las excepciones de este tipo serán lanzadas cuando un parámetro de un método
 * tengo un valor inválido. Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class BolsaException extends RuntimeException {

    /**
     * Constructor por omision.
     */
    public BolsaException() {
    }

    /**
     * Constructor que inicializa el atributo s de la clase padre.
     *
     * @param string Mensaje de error
     */
    public BolsaException(String string) {
        super(string);
    }

}
