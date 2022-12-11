/*
  * AlumnoPorNombreCompara.java
 * Creada el 4 de noviembre del 2021 a las 10:41 AM
 */
package implementaciones;

import interfaces.ICompara;
import tipos.Alumno;

/**
 * Esta clase implementa la interfaz ICompara para comparar objetos de tipo
 * Alumno por su nombre. ALumno; Josè Jesùs Orozco Hernàndez ID; 00000229141
 *
 * @author Josè Jesùs Orozco Hernàndez
 *
 * @param <T> Tipo de los datos a comparar
 */
public class AlumnoPorNombreCompara<T> implements ICompara<T> {

    /**
     * Compara como objetos del tipo Alumno, los objetos de los parametros o1 y
     * o2. La comparación es por el nombre.
     *
     * @param o1 Objeto a comparar.
     * @param o2 Objeto a comparar.
     * @return Un numero negativo, cero o un numero positivo si o1 es menor que,
     * igual a o mayor que o2.
     */
    @Override
    public int compara(T o1, T o2) {
        return ((Alumno) o1).getNombre().compareTo(((Alumno) o2).getNombre());
    }
}
