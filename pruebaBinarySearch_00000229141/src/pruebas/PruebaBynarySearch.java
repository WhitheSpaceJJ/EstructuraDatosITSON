/*
 *PruebaBynarySearch.java
 * Creada el 6 de noviembre del 2021 a las 1:11 PM
 */
package pruebas;

import implementaciones.AlumnoPorIdCompara;
import implementaciones.AlumnoPorNombreCompara;
import implementaciones.Busqueda;
import java.util.Arrays;
import tipos.Alumno;

/**
 * Esta clase de prueba prueba los algoritmos de busqueda binaria del módulo
 * Busqueda.java Alumno; José Jesús Orozco Hernández ID; 00000229141
 *
 * @author José Jesús
 */
public class PruebaBynarySearch {

    /**
     * Metodo Main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Busqueda por el Algoritmo de busqueda Binaria recursivo");
        System.out.println("------------------------------------------------------------");
        System.out.println("Busqueda en un arreglo de objetos de tipo Integer");
        Integer datos1[] = {1, 2, 3, 3, 5, 5, 6};
        System.out.println("datos1[] = " + Arrays.toString(datos1));
        System.out.println("------------------------------------------------------------");
        int pos = Busqueda.binarySearch(datos1, 5);
        if (pos >= 0) {
            System.out.println("El valor 5 esta en la posicion "
                    + pos + " en el arreglo "
                    + Arrays.toString(datos1));
        } else {
            System.out.println("El valor 5 no se encuentra en elarreglo "
                    + Arrays.toString(datos1));
        }
        System.out.println("------------------------------------------------------------");
        pos = Busqueda.binarySearch(datos1, 2);
        if (pos >= 0) {
            System.out.println("El valor 2 esta en la posicion "
                    + pos + " en el arreglo "
                    + Arrays.toString(datos1));
        } else {
            System.out.println("El valor 2 no se encuentra en el arreglo "
                    + Arrays.toString(datos1));
        }
        System.out.println("------------------------------------------------------------");
        pos = Busqueda.binarySearch(datos1, 4);
        if (pos >= 0) {
            System.out.println("El valor 4 esta en la posicion "
                    + pos + " en el arreglo "
                    + Arrays.toString(datos1));
        } else {
            System.out.println("El valor 4 no se encuentra en el arreglo "
                    + Arrays.toString(datos1));
        }
        System.out.println("------------------------------------------------------------");
        pos = Busqueda.binarySearch(datos1, 7);
        if (pos >= 0) {
            System.out.println("El valor 7 esta en la posicion "
                    + pos + " en el arreglo "
                    + Arrays.toString(datos1));
        } else {
            System.out.println("El valor 7 no se encuentra en el arreglo "
                    + Arrays.toString(datos1));
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Busqueda en un arreglo de objetos del tipo String");
        String datos2[] = {"A", "B", "B", "C", "D"};
        System.out.println("datos2[] = " + Arrays.toString(datos2));
        System.out.println("------------------------------------------------------------");
        int pos2 = Busqueda.binarySearch(datos2, "B");
        if (pos2 >= 0) {
            System.out.println("El valor B esta en la posicion "
                    + pos2 + " en el arreglo "
                    + Arrays.toString(datos2));
        } else {
            System.out.println("El valor B no se encuentra en elarreglo "
                    + Arrays.toString(datos2));
        }
        System.out.println("------------------------------------------------------------");
        pos2 = Busqueda.binarySearch(datos2, "F");
        if (pos2 >= 0) {
            System.out.println("El valor F esta en la posicion "
                    + pos2 + " en el arreglo "
                    + Arrays.toString(datos2));
        } else {
            System.out.println("El valor F no se encuentra en elarreglo "
                    + Arrays.toString(datos2));
        }
        System.out.println("------------------------------------------------------------");
        int pos3 = 0;
        System.out.println("Busqueda en un arreglo de objetos de tipo Alumno Por ID");
        Alumno alumnos1[] = {new Alumno(1, "Alicia"),
            new Alumno(2, "Pedro"),
            new Alumno(5, "Maria"),
            new Alumno(7, "Juan")};
        System.out.println("alumnos1[] = "
                + Arrays.toString(alumnos1));
        Alumno alumno2 = new Alumno(2, "Pedro");
        Alumno alumno3 = new Alumno(3, "Lucia");
        System.out.println("------------------------------------------------------------");
        pos3 = Busqueda.binarySearch(alumnos1, alumno2, new AlumnoPorIdCompara());
        if (pos3 >= 0) {
            System.out.println("El alumno " + alumno2
                    + " esta en la posicion "
                    + pos3 + " en el arreglo "
                    + Arrays.toString(alumnos1));
        } else {
            System.out.println("El alumno " + alumno2
                    + " no se encuentra en el arreglo "
                    + Arrays.toString(alumnos1));
        }
        System.out.println("------------------------------------------------------------");
        pos3 = Busqueda.binarySearch(alumnos1, alumno3, new AlumnoPorIdCompara());
        if (pos3 >= 0) {
            System.out.println("El alumno " + alumno3
                    + " esta en la posicion "
                    + pos3 + " en el arreglo "
                    + Arrays.toString(alumnos1));
        } else {
            System.out.println("El alumno " + alumno3
                    + " no se encuentra en el arreglo  "
                    + Arrays.toString(alumnos1));
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("\n\n");

        System.out.println("Busqueda por el Algoritmo de busqueda Binaria no recursivo");
        System.out.println("------------------------------------------------------------");
        System.out.println("Busqueda en un arreglo de objetos de tipo Integer");
        Integer datos5[] = {1, 2, 3, 3, 5, 5, 6};
        System.out.println("datos5[] = " + Arrays.toString(datos5));
        System.out.println("------------------------------------------------------------");
        int pos4 = Busqueda.binarySearchNoRec(datos5, 5);
        if (pos4>= 0) {
            System.out.println("El valor 5 esta en la posicion "
                    + pos4 + " en el arreglo "
                    + Arrays.toString(datos5));
        } else {
            System.out.println("El valor 5 no se encuentra en elarreglo "
                    + Arrays.toString(datos5));
        }
        System.out.println("------------------------------------------------------------");
        pos4 = Busqueda.binarySearchNoRec(datos5, 2);
        if (pos4 >= 0) {
            System.out.println("El valor 2 esta en la posicion "
                    + pos4 + " en el arreglo "
                    + Arrays.toString(datos5));
        } else {
            System.out.println("El valor 2 no se encuentra en el arreglo "
                    + Arrays.toString(datos5));
        }
        System.out.println("------------------------------------------------------------");
        pos4 = Busqueda.binarySearchNoRec(datos5, 4);
        if (pos4 >= 0) {
            System.out.println("El valor 4 esta en la posicion "
                    + pos4 + " en el arreglo "
                    + Arrays.toString(datos5));
        } else {
            System.out.println("El valor 4 no se encuentra en el arreglo "
                    + Arrays.toString(datos5));
        }
        System.out.println("------------------------------------------------------------");
        pos4 = Busqueda.binarySearchNoRec(datos5, 7);
        if (pos4 >= 0) {
            System.out.println("El valor 7 esta en la posicion "
                    + pos4 + " en el arreglo "
                    + Arrays.toString(datos5));
        } else {
            System.out.println("El valor 7 no se encuentra en el arreglo "
                    + Arrays.toString(datos5));
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Busqueda en un arreglo de objetos del tipo String");
        String datos7[] = {"A", "B", "B", "C", "D"};
        System.out.println("datos7[] = " + Arrays.toString(datos7));
        System.out.println("------------------------------------------------------------");
        int pos6 = Busqueda.binarySearchNoRec(datos7, "B");
        if (pos6 >= 0) {
            System.out.println("El valor B esta en la posicion "
                    + pos6 + " en el arreglo "
                    + Arrays.toString(datos7));
        } else {
            System.out.println("El valor B no se encuentra en elarreglo "
                    + Arrays.toString(datos7));
        }
        System.out.println("------------------------------------------------------------");
        pos6 = Busqueda.binarySearchNoRec(datos7, "F");
        if (pos6 >= 0) {
            System.out.println("El valor F esta en la posicion "
                    + pos6 + " en el arreglo "
                    + Arrays.toString(datos7));
        } else {
            System.out.println("El valor F no se encuentra en elarreglo "
                    + Arrays.toString(datos7));
        }
        System.out.println("------------------------------------------------------------");
        int pos0 = 0;
        System.out.println("Busqueda en un arreglo de objetos de tipo Alumno Por Nombre");
        Alumno alumnos2[] = {new Alumno(1, "Alicia"),
            new Alumno(7, "Juan"),
            new Alumno(5, "Maria"),
            new Alumno(2, "Pedro")};
        System.out.println("alumnos1[] = "
                + Arrays.toString(alumnos2));
        Alumno alumno8 = new Alumno(2, "Pedro");
        Alumno alumno9 = new Alumno(3, "Lucia");
        System.out.println("------------------------------------------------------------");
        pos0 = Busqueda.binarySearchNoRec(alumnos2, alumno8, new AlumnoPorNombreCompara());
        if (pos0 >= 0) {
            System.out.println("El alumno " + alumno8
                    + " esta en la posicion "
                    + pos0 + " en el arreglo "
                    + Arrays.toString(alumnos2));
        } else {
            System.out.println("El alumno " + alumno8
                    + " no se encuentra en el arreglo "
                    + Arrays.toString(alumnos2));
        }
        System.out.println("------------------------------------------------------------");
        pos0 = Busqueda.binarySearchNoRec(alumnos2, alumno9, new AlumnoPorNombreCompara());
        if (pos0 >= 0) {
            System.out.println("El alumno " + alumno9
                    + " esta en la posicion "
                    + pos0 + " en el arreglo "
                    + Arrays.toString(alumnos2));
        } else {
            System.out.println("El alumno " + alumno9
                    + " no se encuentra en el arreglo  "
                    + Arrays.toString(alumnos2));
        }
        System.out.println("------------------------------------------------------------");
//        
//        Profe le coloco esto por si 
//              System.out.println("------------------------------------------------------------");
//        int pos0 = 0;
//        System.out.println("Busqueda en un arreglo de objetos de tipo Alumno");
//        Alumno alumnos2[] = {new Alumno(1, "Alicia"),
//            new Alumno(7, "Juan"),
//            new Alumno(5, "Maria"),
//            new Alumno(2, "Pedro")};
//        System.out.println("alumnos1[] = "
//                + Arrays.toString(alumnos2));
//        Alumno alumno8 = new Alumno(2, "Pedro");
//        Alumno alumno9 = new Alumno(3, "Lucia");
//        System.out.println("------------------------------------------------------------");
//        pos0 = Busqueda.binarySearchNoRec(alumnos2, alumno8, new AlumnoPorNombreCompara());
//        if (pos0 >= 0) {
//            System.out.println("El alumno " + alumno8
//                    + " esta en la posicion "
//                    + pos0 + " en el arreglo "
//                    + Arrays.toString(alumnos2));
//        } else {
//            System.out.println("El alumno " + alumno8
//                    + " no se encuentra en el arreglo "
//                    + Arrays.toString(alumnos2));
//        }
//        System.out.println("------------------------------------------------------------");
//        pos0 = Busqueda.binarySearchNoRec(alumnos2, alumno9, new AlumnoPorNombreCompara());
//        if (pos0 >= 0) {
//            System.out.println("El alumno " + alumno9
//                    + " esta en la posicion "
//                    + pos0 + " en el arreglo "
//                    + Arrays.toString(alumnos2));
//        } else {
//            System.out.println("El alumno " + alumno9
//                    + " no se encuentra en el arreglo  "
//                    + Arrays.toString(alumnos2));
//        }
//        System.out.println("------------------------------------------------------------");


    }

}
