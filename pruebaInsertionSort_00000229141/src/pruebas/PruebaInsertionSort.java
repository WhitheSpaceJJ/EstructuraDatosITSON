/*
 *PruebaInsertionSort.java
 *Creada el 5 de noviembre del 2021 a las 15:45 PM
 */
package pruebas;

import implementaciones.AlumnoPorIdCompara;
import implementaciones.AlumnoPorNombreCompara;
import implementaciones.Ordenamiento;
import java.util.Arrays;
import tipos.Alumno;

/**
 ** Esta clase de prueba prueba los algoritmos de ordenamiento de inserccion
 * (InsertionSort) del módulo Ordenamiento.java Alumno; José Jesús Orozco
 * Hernández ID; 00000229141
 *
 * @author Jose Jesus
 */
public class PruebaInsertionSort {

    /**
     * Metodo Main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Ordenamiento por el Metodo de insercion");
        System.out.println("");
        System.out.println("Ordenamiento de arreglos de objetos");
        System.out.println("que implementan la interfaz Comparable");
        System.out.println("---------------------------------------");
        System.out.println("Ordenamiento de un arreglo de objetos de tipo Integer");
        Integer datos1[] = {3, 2, 3, 5, 4, 1};
        System.out.println("Arreglo datos1 original:");
        System.out.println("datos1[] = " + Arrays.toString(datos1));
        Ordenamiento.insertionSort(datos1);
        System.out.println("Arreglo datos1 ordenado:");
        System.out.println("datos1[] = " + Arrays.toString(datos1));
        System.out.println("---------------------------------------");
        System.out.println("Ordenamiento de un arreglo de objetos de tipo String");
        String datos2[] = {"C", "B", "A", "D", "A"};
        System.out.println("Arreglo datos2 original:");
        System.out.println("datos2[] = " + Arrays.toString(datos2));
        Ordenamiento.insertionSort(datos2);
        System.out.println("Arreglo datos2 ordenado:");
        System.out.println("datos2[] = " + Arrays.toString(datos2));
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Ordenamiento de arreglos de objetos");
        System.out.println("usando un método para compararlos");
        System.out.println("---------------------------------------");
        System.out.println("Ordenamiento de un arreglo de objetos de tipo Alumno por su id");
        Alumno alumnos1[] = {new Alumno(7, "Juan"),
            new Alumno(5, "Maria"),
            new Alumno(2, "Pedro"),
            new Alumno(1, "Alicia")};
        System.out.println("Arreglo alumnos1 original:");
        System.out.println("alumnos1[] = " + Arrays.toString(alumnos1));
        Ordenamiento.insertionSort(alumnos1, new AlumnoPorIdCompara());
        System.out.println("Arreglo alumnos1 ordenado:");
        System.out.println("alumnos1[] = " + Arrays.toString(alumnos1));
        System.out.println("---------------------------------------");
        System.out.println("Ordenamiento de un arreglo de objetos de tipo Alumno por su nombre");
        Alumno alumnos2[] = {new Alumno(7, "Juan"),
            new Alumno(5, "Maria"),
            new Alumno(2, "Pedro"),
            new Alumno(1, "Alicia")};
        System.out.println("Arreglo alumnos2 original:");
        System.out.println("alumnos2[] = " + Arrays.toString(alumnos2));
        Ordenamiento.insertionSort(alumnos2, new AlumnoPorNombreCompara());
        System.out.println("Arreglo alumnos2 ordenado:");
        System.out.println("alumnos2[] = " + Arrays.toString(alumnos2));
    }
}
