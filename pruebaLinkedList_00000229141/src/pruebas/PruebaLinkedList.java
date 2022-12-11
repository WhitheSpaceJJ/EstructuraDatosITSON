/*
* PruebaLinkedList.java
Creada el 25 de septiembre del 2021  5:35 PM
 */
package pruebas;

import excepciones.ListException;
import java.util.Iterator;
import implementaciones.LinkedList;

/**
 * Esta clase prueba las metodos sobre listas enlazadas de la clase LinkedList(No la que java proporciona).
 * Alumno;José Jesús Orozco Hernández ID:00000229141
 *
 *
 * @author José Jesús Orozco Hernandez
 */
public class PruebaLinkedList {

    /**
     * Metodo Main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Prueba uno");
        System.out.println("-----------------------------------------");
        System.out.println("Se crea una istancia de LinkedList llamada inList, para guardar enteros");
        LinkedList<Integer> intList = new LinkedList<>();
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
            System.out.println("Algun elemento de la lista es par : " + (algunPar(intList) == true ? "Si" : "No"));
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
        System.out.println("Se crea una istancia de LinkedList llamada stringList , para guardar cadenas");
        LinkedList<String> stringList = new LinkedList<>();
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
            System.out.println("Ahora se utilizara mayusculas(stringList), para devolver una ListaEnlazada con cadenas Mayusculas.");
            System.out.println("Lista en mayusculas");
            LinkedList<String> stringListaMayusculas = mayusculas(stringList);
            System.out.println(stringListaMayusculas);
            System.out.println("------------------------------");
            System.out.println("Ahora se eliminaran todos los elementos de la lista");
            stringList.clear();
            System.out.println(stringList);
        } catch (ListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * Este metodo sive para evaluar una lista enlazada de enteros y determinar si en ella existe algun elemento par
     * @param intList Lista enlazada de enteros
     * @return true si en la lista existe algun par, false en caso contrario
     */
    public static boolean algunPar(LinkedList<Integer> intList) {
        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            int elemento = iter.next();
            if (elemento % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo regresa la cadena mas larga de la lista de cadenas del
     * parametro. Utiliza un ciclo foreach
     *
     * @param stringList Lista de cadenas
     * @return La cadena mas larga de la lista de cadenas
     */
    public static LinkedList<String> mayusculas(LinkedList<String> stringList) {
        LinkedList<String> retorno = new LinkedList<>();
        for (String s : stringList) {
            retorno.append(s.toUpperCase());
        }
        return retorno;
    }
}
