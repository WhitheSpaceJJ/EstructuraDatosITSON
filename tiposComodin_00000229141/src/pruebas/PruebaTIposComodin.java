/*
 * PruebaTiposComodin.java
 * Creada el 20 de octubre del 2021 9:50 AM
 */
package pruebas;

import genericos.*;
import implementaciones.ArrayList;
import implementaciones.LinkedList;
import interfaces.IList;

/**
 * Clase de prueba para probar los TipoComodin. Alumno; José Jesús Orozco
 * Hernández ID; 00000229141
 *
 * @author José Jesús
 */
public class PruebaTIposComodin {

    /**
     * Metodo Main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esta;
        // TODO code application logic here
        System.out.println("Prueba 1 ");
        System.out.println("Metodos genericos con argumentos comodin con una lista implementada sobre un arreglo");
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alEnteros de tipo\n"
                + "Integer con los valores: 5, 2, 8, 6, 7 y 2.");
        IList<Integer> alEnteros = new ArrayList<>(Integer.class, 6);
        alEnteros.append(5);
        alEnteros.append(2);
        alEnteros.append(8);
        alEnteros.append(6);
        alEnteros.append(7);
        alEnteros.append(2);
        System.out.println(alEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alEnterosOrdenados de\n"
                + "tipo Integer con los valores: 2, 2, 5, 6, 7, 8.");
        IList<Integer> alEnterosOrdenados = new ArrayList<>(Integer.class, 6);
        alEnterosOrdenados.append(2);
        alEnterosOrdenados.append(2);
        alEnterosOrdenados.append(5);
        alEnterosOrdenados.append(6);
        alEnterosOrdenados.append(7);
        alEnterosOrdenados.append(8);
        System.out.println(alEnterosOrdenados.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alDobles de tipo Double\n"
                + "con los valores: 5.2, 8.6, 7.3, 9.1.");
        IList<Double> alDobles = new ArrayList<>(Double.class, 4);
        alDobles.append(5.2);
        alDobles.append(8.6);
        alDobles.append(7.3);
        alDobles.append(9.1);
        System.out.println(alDobles.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alDoblesOrdenados de\n"
                + "tipo Double con los valores: 5.2, 7.3, 8.6, 9.1.");
        IList<Double> alDoblesOrdenados = new ArrayList<>(Double.class, 4);
        alDoblesOrdenados.append(5.2);
        alDoblesOrdenados.append(7.3);
        alDoblesOrdenados.append(8.6);
        alDoblesOrdenados.append(9.1);
        System.out.println(alDoblesOrdenados.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alCadenas de tipo\n"
                + "String con los valores:  E,B,H,F,G y H.");
        IList<String> alCadenas = new ArrayList<>(String.class, 6);
        alCadenas.append("E");
        alCadenas.append("B");
        alCadenas.append("H");
        alCadenas.append("F");
        alCadenas.append("G");
        alCadenas.append("H");
        System.out.println(alCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un arreglo llamada alCadenasOrdenadas de\n"
                + "tipo String con los valores: B,E,F,G,H y H.");
        IList<String> alCadenasOrdenadas = new ArrayList<>(String.class, 6);
        alCadenasOrdenadas.append("B");
        alCadenasOrdenadas.append("E");
        alCadenasOrdenadas.append("F");
        alCadenasOrdenadas.append("G");
        alCadenasOrdenadas.append("H");
        alCadenasOrdenadas.append("H");
        System.out.println(alCadenasOrdenadas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 2 en la lista  alEnteros.");
        System.out.println("Total; " + TiposComodin.cuenta(alEnteros, 2));
        System.out.println("Lista; " + alEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 9 en la lista  alEnteros.");
        System.out.println("Total; " + TiposComodin.cuenta(alEnteros, 9));
        System.out.println("Lista; " + alEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor H en la lista alCadenas.");
        System.out.println("Total; " + TiposComodin.cuenta(alCadenas, "H"));
        System.out.println("Lista; " + alCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor A en la lista alCadenas.");
        System.out.println("Total; " + TiposComodin.cuenta(alCadenas, "A"));
        System.out.println("Lista; " + alCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar de la lista alEnteros es; " + TiposComodin.desvStd(alEnteros));
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar de la lista alDobles es; " + TiposComodin.desvStd(alDobles));
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alEnteros; " + alEnteros.toString());
        esta = TiposComodin.enOrden(alEnteros);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alEnterosOrdenados; " + alEnterosOrdenados.toString());
        esta = TiposComodin.enOrden(alEnterosOrdenados);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alDobles ; " + alDobles.toString());
        esta = TiposComodin.enOrden(alDobles);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alDoblesOrdenados ; " + alDoblesOrdenados.toString());
        esta = TiposComodin.enOrden(alDoblesOrdenados);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alCadenas; " + alCadenas.toString());
        esta = TiposComodin.enOrden(alCadenas);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista alCadenasOrdenadas; " + alCadenasOrdenadas.toString());
        esta = TiposComodin.enOrden(alCadenasOrdenadas);
        System.out.println(esta ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("------------------------------------------------------------------------------------");
        boolean estaD;
        // TODO code application logic here
        System.out.println("Prueba 2 ");
        System.out.println("Metodos genericos con argumentos comodin con una lista implementada sobre una lista ligada");
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un lista ligada llamada llEnteros de tipo\n"
                + "Integer con los valores: 5, 2, 8, 6, 7 y 2.");
        IList<Integer> llEnteros = new LinkedList<>();
        llEnteros.append(5);
        llEnteros.append(2);
        llEnteros.append(8);
        llEnteros.append(6);
        llEnteros.append(7);
        llEnteros.append(2);
        System.out.println(llEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre una lista ligada llamada llEnterosOrdenados de\n"
                + "tipo Integer con los valores: 2, 2, 5, 6, 7, 8.");
        IList<Integer> llEnterosOrdenados = new LinkedList<>();
        llEnterosOrdenados.append(2);
        llEnterosOrdenados.append(2);
        llEnterosOrdenados.append(5);
        llEnterosOrdenados.append(6);
        llEnterosOrdenados.append(7);
        llEnterosOrdenados.append(8);
        System.out.println(llEnterosOrdenados.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre un lista ligada llamada llDobles de tipo Double\n"
                + "con los valores: 5.2, 8.6, 7.3, 9.1.");
        IList<Double> llDobles = new LinkedList<>();
        llDobles.append(5.2);
        llDobles.append(8.6);
        llDobles.append(7.3);
        llDobles.append(9.1);
        System.out.println(llDobles.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre una lista ligada llamada llDoblesOrdenados de\n"
                + "tipo Double con los valores: 5.2, 7.3, 8.6, 9.1.");
        IList<Double> llDoblesOrdenados = new LinkedList<>();
        llDoblesOrdenados.append(5.2);
        llDoblesOrdenados.append(7.3);
        llDoblesOrdenados.append(8.6);
        llDoblesOrdenados.append(9.1);
        System.out.println(llDoblesOrdenados.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre una lista Ligada llamada llCadenas de tipo\n"
                + "String con los valores:  E,B,H,F,G y H.");
        IList<String> llCadenas = new LinkedList<>();
        llCadenas.append("E");
        llCadenas.append("B");
        llCadenas.append("H");
        llCadenas.append("F");
        llCadenas.append("G");
        llCadenas.append("H");
        System.out.println(llCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Se crea una lista implementada sobre una lista ligada llamada llCadenasOrdenadas de\n"
                + "tipo String con los valores: B,E,F,G,H y H.");
        IList<String> llCadenasOrdenadas = new LinkedList<>();
        llCadenasOrdenadas.append("B");
        llCadenasOrdenadas.append("E");
        llCadenasOrdenadas.append("F");
        llCadenasOrdenadas.append("G");
        llCadenasOrdenadas.append("H");
        llCadenasOrdenadas.append("H");
        System.out.println(llCadenasOrdenadas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 2 en la lista  llEnteros.");
        System.out.println("Total; " + TiposComodin.cuenta(llEnteros, 2));
        System.out.println("Lista; " + llEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor 9 en la lista  llEnteros.");
        System.out.println("Total; " + TiposComodin.cuenta(llEnteros, 9));
        System.out.println("Lista; " + llEnteros.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor H en la lista llCadenas.");
        System.out.println("Total; " + TiposComodin.cuenta(llCadenas, "H"));
        System.out.println("Lista; " + llCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("El total del número de ocurrencias del valor A en la lista llCadenas.");
        System.out.println("Total; " + TiposComodin.cuenta(llCadenas, "A"));
        System.out.println("Lista; " + llCadenas.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar de la lista llEnteros es; " + TiposComodin.desvStd(llEnteros));
        System.out.println("---------------------------------------------------");
        System.out.println("La desviacion estandar de la lista llDobles es; " + TiposComodin.desvStd(llDobles));
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llEnteros; " + llEnteros.toString());
        estaD = TiposComodin.enOrden(llEnteros);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llEnterosOrdenados; " + llEnterosOrdenados.toString());
        estaD = TiposComodin.enOrden(llEnterosOrdenados);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llDobles ; " + llDobles.toString());
        estaD = TiposComodin.enOrden(llDobles);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llDoblesOrdenados ; " + llDoblesOrdenados.toString());
        estaD = TiposComodin.enOrden(llDoblesOrdenados);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llCadenas; " + llCadenas.toString());
        estaD = TiposComodin.enOrden(llCadenas);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista llCadenasOrdenadas; " + llCadenasOrdenadas.toString());
        estaD = TiposComodin.enOrden(llCadenasOrdenadas);
        System.out.println(estaD ? " Esta ordenado " : " No esta ordenado ");

    }

}
