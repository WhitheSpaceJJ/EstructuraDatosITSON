/*
* PruebaArrayList.java
Creada el 19 de septiembre del 2021
 */
package pruebas;

import excepciones.ListException;
import implementaciones.ArrayList;
import java.util.Iterator;

/**
 * Esta clase prueba las metodos sobre listas de la clase ArrayList. Alumno;
 * José Jesús Orozco Hernández ID:00000229141
 *
 *
 * @author José Jesús Orozco
 */
public class PruebaArrayList {

    /**
     * Metodo estatico
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Prueba uno");
        System.out.println("-----------------------------------------");
        System.out.println("Se crea una istancia de ArrayList llamada inList de tamaño 5, para guardar enteros");
        ArrayList<Integer> intList = new ArrayList<>(Integer.class, 5);
        Object c;
        int a;
        boolean b;
        System.out.println(intList);
        try {
            System.out.println("---------------------------");
            System.out.println("Ahora se agregaran los siguientes numeros a la lista 1,2,3,2,3.");
            System.out.println("intList.append(1)");
            intList.append(1);
            System.out.println(intList);
            System.out.println("intList.append(2)");
            intList.append(2);
            System.out.println(intList);
            System.out.println("intList.append(3)");
            intList.append(3);
            System.out.println(intList);
            System.out.println("intList.append(2))");
            intList.append(2);
            System.out.println(intList);
            System.out.println("intList.append(3)");
            intList.append(3);
            System.out.println(intList);
            System.out.println("---------------------------");
            System.out.println("Indice de la primera ocurrencia del número 2");
            System.out.println("El indice es :" + intList.indexOf(2));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Indice de la primera ocurrencia del número 4");
            System.out.println("El indice es :" + intList.indexOf(4));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia del número 3.");
            b = intList.remove(new Integer(3));
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No"));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia del número 5.");
            b = intList.remove(new Integer(5));
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No"));
            System.out.println(intList);
            System.out.println("---------------------------");
            System.out.println("Todos los elementos son pares : " + (todosPares(intList) == true ? "Si" : "No"));
            System.out.println(intList);
            System.out.println("---------------------------");
            System.out.println("Ahora se eliminaran todos los elementos de la lista");
            intList.clear();
            System.out.println(intList);
        } catch (ListException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Prueba dos");
        System.out.println("-----------------------------------------");
        System.out.println("Se crea una istancia de ArrayList llamada stringList de tamaño 5, para guardar enteros");
        ArrayList<String> stringList = new ArrayList<>(String.class, 5);
        try {
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se agregaran los siguientes nombres a la lista Alma,Bernardo,Clara,Bernardo,Clara.");
            System.out.println("stringList.append(Alma)");
            stringList.append("Alma");
            System.out.println(stringList);
            System.out.println("stringList.append(Bernardo)");
            stringList.append("Bernardo");
            System.out.println(stringList);
            System.out.println("stringList.append(Clara)");
            stringList.append("Clara");
            System.out.println(stringList);
            System.out.println("stringList.append(Bernardo)");
            stringList.append("Bernardo");
            System.out.println(stringList);
            System.out.println("stringList.append(Clara)");
            stringList.append("Clara");
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Indice de la primera ocurrencia de la cadena Clara");
            System.out.println("El indice es :" + stringList.indexOf("Clara"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Indice de la primera ocurrencia de la cadena Felipe");
            System.out.println("El indice es :" + stringList.indexOf("Felipe"));
            System.out.println(stringList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia de la cadena Bernardo");
            b = stringList.remove("Bernardo");
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia de la cadena David");
            b = stringList.remove("David");
            System.out.println("Se ha eliminado; " + (b == true ? "Si" : "No no existe"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se determinara el numero de ocurrencias de la cadena Clara en la lista");
            System.out.println("Total; " + cuenta(stringList, "Clara"));
            System.out.println(stringList);
            System.out.println("------------------------------");
            System.out.println("Ahora se eliminaran todos los elementos de la lista");
            stringList.clear();
            System.out.println(stringList);
        } catch (ListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Esta metodo determina si todos los elmento de la lista de enteros son
     * pares, usa un iterador para recorrer la lista
     *
     * @param intList Lista de enteros
     * @return true si todos los elementos de la lista son pares, false en caso
     * contrario.
     */
    public static boolean todosPares(ArrayList<Integer> intList) {
        Iterator<Integer> iter = intList.iterator();
        int nPares = 0;
        while (iter.hasNext()) {
            int elemento = iter.next();
            if (elemento % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Este metodo determina el numero cadenas de la lista de cadenas del
     * parametro que empiezan con el prefijo del parametro. Usa un ciclo foreach
     * para recorrer la lista
     *
     * @param stringList Lista de cadenas
     * @param str La cadena a comparar
     * @return La cantidad de veces que serpite una cadena en la lista.
     */
    public static int cuenta(ArrayList<String> stringList,
            String str) {
        int n = 0;
        for (String elemento : stringList) {
            if (elemento.equalsIgnoreCase(str)) {
                n++;
            }
        }
        return n;
    }
}
