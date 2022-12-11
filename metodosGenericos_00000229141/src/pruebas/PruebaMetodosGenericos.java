/*
 * PruebaMetodosGenericos.java
 * Creada el 29 de octubre del 2021 8:44 PM
 */
package pruebas;

import genericos.*;
import java.util.Arrays;

/**
 * Clase de prueba para los metodos genericos. Alumno; José Jesús Orozco
 * Hernández ID; 00000229141
 *
 * @author José Jesus
 */
public class PruebaMetodosGenericos {

    /**
     * Metodo Main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean esta;
        System.out.println("Prueba");
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo enteros del tipo Integer con los valores; 5, 2, 8, 6, 7 y 2.");
        Integer enteros[] = {5, 2, 8, 6, 7, 2};
        System.out.println(Arrays.toString(enteros));
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo enterosOrdenados del tipo Integer con los valores; 2, 2, 5, 6, 7 y 8.");
        Integer enterosOrdernados[] = {2, 2, 5, 6, 7, 8};
        System.out.println(Arrays.toString(enterosOrdernados));
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo dobles del tipo Double con los valores; 5.2, 8.6, 7.3 y 9.1.");
        Double dobles[] = {5.2, 8.6, 7.3, 9.1};
        System.out.println(Arrays.toString(dobles));
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo doblesOrdenados del tipo Double con los valores; 5.2,7.3, 8.6 y 9.1.");
        Double doblesOrdenados[] = {5.2, 7.3, 8.6, 9.1};
        System.out.println(Arrays.toString(doblesOrdenados));
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo cadenas del tipo String con los valores; E,B,H,F,G y H.");
        String cadenas[] = {"E", "B", "H", "F", "G", "H"};
        System.out.println(Arrays.toString(cadenas));
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea un arreglo cadenas del tipo String con los valores; B,E,F,G,H y H.");
        String cadenasOrdenadas[] = {"B", "E", "F", "G", "H", "H"};
        System.out.println(Arrays.toString(cadenasOrdenadas));
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 2 en el arreglo enteros.");
        System.out.println("Total; " + MetodosGenericos.cuenta(enteros, 2));
        System.out.println("Arreglo; " + Arrays.toString(enteros));
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 9 en el arreglo enteros.");
        System.out.println("Total; " + MetodosGenericos.cuenta(enteros, 9));
        System.out.println("Arreglo; " + Arrays.toString(enteros));
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor H en el arreglo cadenas.");
        System.out.println("Total; " + MetodosGenericos.cuenta(cadenas, "H"));
        System.out.println("Arreglo; " + Arrays.toString(cadenas));
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor A en el arreglo cadenas.");
        System.out.println("Total; " + MetodosGenericos.cuenta(cadenas, "A"));
        System.out.println("Arreglo; " + Arrays.toString(cadenas));
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar del arreglo de enteros es; " + MetodosGenericos.desvStd(enteros));
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar del arreglo de dobles es; " + MetodosGenericos.desvStd(dobles));
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo enteros; " + Arrays.toString(enteros));
        esta = MetodosGenericos.enOrden(enteros);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo enterosOrdenados; " + Arrays.toString(enterosOrdernados));
        esta = MetodosGenericos.enOrden(enterosOrdernados);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo dobles ; " + Arrays.toString(dobles));
        esta = MetodosGenericos.enOrden(dobles);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo doblesOrdenados; " + Arrays.toString(doblesOrdenados));
        esta = MetodosGenericos.enOrden(doblesOrdenados);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo cadenas; " + Arrays.toString(cadenas));
        esta = MetodosGenericos.enOrden(cadenas);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Arreglo cadenasOrdenadas; " + Arrays.toString(cadenasOrdenadas));
        esta = MetodosGenericos.enOrden(cadenasOrdenadas);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
    }

}
