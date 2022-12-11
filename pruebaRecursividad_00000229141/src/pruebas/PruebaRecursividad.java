/*
 * PruebaRecursividad.java
 * Creada el 21 de octubre del 2021 17:22 PM 
 */
package pruebas;

import implementaciones.Recursividad;

/**
 * Clase de pruebas para funciones recursivas. Alumno; José Jesús Orozco
 * Hernández Id;00000229141
 *
 * @author José Jesus
 */
public class PruebaRecursividad {

    /**
     * Metodo main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursividad r = new Recursividad();
        System.out.println("Pruebas");
        System.out.println("----------------------------------------------------");
        System.out.println("Fibonacci de 5 es ; " + r.fibonacci(5));
        System.out.println("----------------------------------------------------");
        System.out.println("Fibonacci de 40 es; " + r.fibonacci(40));
        System.out.println("----------------------------------------------------");
        System.out.println("Maximo comun divisor de 45,75, es; " + r.mcd(45, 75));
        System.out.println("----------------------------------------------------");
        System.out.println("Maximo comun divisor de 47,91, es; " + r.mcd(47, 91));
        System.out.println("----------------------------------------------------");
        Object[] a = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("El numero de ocurrencias del numero 3, dentro del");
        System.out.println("arreglo a = {1, 2, 3, 3, 2, 3,1}, es de ;" + r.count(a, a.length, 3));
        System.out.println("----------------------------------------------------");
        Object[] b = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("El numero de ocurrencias del numero 1, dentro del");
        System.out.println("arreglo b = {1, 2, 3, 3, 2, 3,1}, es de ;" + r.count(b, b.length, 1));
        System.out.println("----------------------------------------------------");
        Object[] c = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("El numero de ocurrencias del valor 'C' , dentro del");
        System.out.println("arreglo c = {'A', 'B', 'C', 'B','A', 'B', 'D'}, es de ;" + r.count(c, c.length, 'C'));
        System.out.println("----------------------------------------------------");
        Object[] d = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("El numero de ocurrencias del valor 'E' , dentro del");
        System.out.println("arreglo d = {'A', 'B', 'C', 'B','A', 'B', 'D'}, es de ;" + r.count(d, d.length, 'E'));
        System.out.println("----------------------------------------------------");
        Object[] e = {1, 2, 3, 4, 5};
        String s = "[";
        System.out.println("Ahora se invertira el arreglo e={1,2,3,4,5}");
        System.out.println("Arreglo actual;");
        String sA = "[";
        for (Object e1 : e) {
            sA += e1 + ",";
        }
        sA = sA.substring(0, sA.length() - 1);
        sA += "]";
        System.out.println(sA);
        System.out.println("Arreglo invertido;");
        r.reverse(e, 0, e.length - 1);
        for (Object e1 : e) {
            s += e1 + ",";
        }
        s = s.substring(0, s.length() - 1);
        s += "]";
        System.out.println(s);
        System.out.println("----------------------------------------------------");
        Object[] f = {'A', 'B', 'C', 'D'};
        System.out.println("Ahora se invertira el arreglo  f = {'A', 'B', 'C', 'D'}");
        System.out.println("Arreglo actual;");
        String sAD = "[";
        for (Object f1 : f) {
            sAD += f1 + ",";
        }
        sAD = sAD.substring(0, sAD.length() - 1);
        sAD += "]";
        System.out.println(sAD);
        System.out.println("Arreglo invertido;");
        r.reverse(f, 0, f.length - 1);
        String sD = "[";
        for (Object f1 : f) {
            sD += f1 + ",";
        }
        sD = sD.substring(0, sD.length() - 1);
        sD += "]";
        System.out.println(sD);
    }
}
