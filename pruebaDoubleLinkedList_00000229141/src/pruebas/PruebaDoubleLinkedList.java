/*
* PruebaDoubleLinkedList.java
Creada el 25 de septiembre del 2021  5:35 PM
 */
package pruebas;

import excepciones.ListException;
import implementaciones.DoubleLinkedList;
import java.util.Iterator;

/**
 * Esta clase prueba las metodos sobre listas de la clase DoubleLinkedList. Alumno;
 * José Jesús Orozco Hernández ID:00000229141
 *
 *
 * @author José Jesús Orozco
 */
public class PruebaDoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Prueba uno");
        System.out.println("-----------------------------------------");
        System.out.println("Se crea una istancia de DoubleLinkedList llamada inList, para guardar enteros");
        DoubleLinkedList<Integer> intList = new DoubleLinkedList<>();
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
            System.out.println("---------------------------");
            System.out.println("Indice de la ultima ocurrencia del número 3");
            System.out.println("El indice es :" + intList.lastIndexOf(3));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Indice de la ultima ocurrencia del número 5");
            System.out.println("El indice es :" + intList.lastIndexOf(5));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia del número 3.");
            b = intList.remove(new Integer(3));
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia del número 5.");
            b = intList.remove(new Integer(5));
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la ultima ocurrencia del número 2.");
            b = intList.removeLast(2);
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(intList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia del número 6.");
            b = intList.remove(new Integer(6));
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(intList);
            System.out.println("---------------------------");
            System.out.println("El menor de los elementos de la lista es: " + min(intList));
            System.out.println(intList);
            System.out.println("---------------------------");
            System.out.println("Ahora se eliminaran todos los elementos de la lista");
            intList.clear();
            System.out.println(intList);
        } catch (ListException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Prueba dos");
        System.out.println("-----------------------------------------");
        System.out.println("Se crea una istancia de DoubleLinkedList llamada stringList, para guardar cadenas");
        DoubleLinkedList<String> stringList = new DoubleLinkedList<>();
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
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se eliminara la primera ocurrencia de la cadena David");
            b = stringList.remove("David");
            System.out.println("Se ha eliminado; " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(stringList);
            System.out.println("-------------------------");
            System.out.println("Ahora se eliminara la ultima ocurrencia de la cadena Clara");
            b = stringList.removeLast("Clara");
            System.out.println("Se ha eliminado " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se eliminara la ultima ocurrencia de la cadena Eva");
            b = stringList.removeLast("Eva");
            System.out.println("Se ha eliminado; " + (b == true ? "Si" : "No, porque no existe"));
            System.out.println(stringList);
            System.out.println("---------------------------");
            System.out.println("Ahora se obtendra una lista con las longitudes de las cadenas de la lista. ");
            System.out.println("Lista de String");
            System.out.println(stringList);
            System.out.println("Lista de tamaños de la lista String");
            System.out.println(longitudes(stringList));
            System.out.println("------------------------------");
            System.out.println("Ahora se eliminaran todos los elementos de la lista");
            stringList.clear();
            System.out.println(stringList);

        } catch (ListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Metodo estatico que regresa el menor de los elementos de la lista de
     * enteros del parámetro. Para recorrer la lista se usará un iterador de la
     * lista.
     *
     * @param intList Lista a recorrer
     * @return El menor de los elementos de la lista, -1 en caso contrario.
     */
    public static int min(DoubleLinkedList<Integer> intList) {
        if (intList.empty()) {
            throw new ListException("Lista vacia");
        } else {
            Iterator<Integer> iter = intList.iterator();
            int elemento = iter.next();
            while (iter.hasNext()) {
                int auxiliar = iter.next();
                if (auxiliar < elemento) {
                    elemento = auxiliar;
                }
            }
            return elemento;
        }
    }

    /**
     * Metodo estatico que regresa una lista doblemente enlazada con las
     * longitudes de las cadenas de stringList. Para recorrer la lista se usará
     * un ciclo foreach.
     *
     * @param stringList Lista deblemente enlazada de stringList
     * @return La lista de longitudes de la lista de string
     */
    public static DoubleLinkedList<Integer> longitudes(
            DoubleLinkedList<String> stringList) {
        DoubleLinkedList<Integer> retorno = new DoubleLinkedList<>();
        for (String s : stringList) {
            retorno.append(s.length());
        }
        return retorno;
    }

}
