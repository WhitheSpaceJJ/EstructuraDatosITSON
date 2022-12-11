/*
 * ICompara.java
 * Creada el 4 de noviembre del 2021 a las 10:41 AM
 */
package interfaces;

/**
 * Esta interfaz declara un método para comparar objetos como de diferentes
 * tipos de datos
 * Alumno; josè Jesùs Orozco Hernàndez ID; 00000229141
 * 
 * @author Josè Jesùs Orozco Hernàndez
 *
 * @param <T> Tipo de los datos a comparar
 */
public interface ICompara<T> {

    /**
     * Compara el objeto del parámetro o1 con el objeto del parámetro o2.
     *
     * @param o1 Objeto a comparar.
     * @param o2 Objeto a comparar.
     * @return Un numero negativo, cero o un numero positivo si o1 es menor que,
     * igual a o mayor que o2.
     */
    public int compara(T o1, T o2);
}
