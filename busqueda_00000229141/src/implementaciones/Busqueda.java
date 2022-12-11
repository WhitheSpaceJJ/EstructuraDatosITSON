/*
 * Busqueda.java
* Creada el 5 de noviembre del 2021  a las 9:31 PM
 */
package implementaciones;

import interfaces.ICompara;

/**
 * Esta clase implementa los diferentes algoritmos de búsqueda. Alumno; José
 * Jesús Orozco Hernández ID; 00000229141
 *
 * @author Jose Jesus
 */
public class Busqueda {

    /**
     * Busca secuencialmente, la primera ocurrencia del elemento x dentro del
     * arreglo datos
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     */
    public static <T> int linearSearch(T datos[], T x) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando el Algoritmo de
     * Búsqueda Binaria recursivo. Los elementos del arreglo implementan la
     * interfaz Comparable. El método regresa la posición del elemento x dentro
     * del arreglo datos si existe, -1 en caso contrario.
     *
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     */
    public static <T extends Comparable<T>> int binarySearch(T datos[], T x) {
        return binarySearch(datos, x, 0, datos.length - 1);
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando el Algoritmo de
     * Búsqueda Binaria. Los elementos del arreglo implementan la interfaz
     * Comparable, inicio y fin son los índices del primer y último elemento del
     * arreglo. El método regresa la posición del elemento x dentro del arreglo
     * datos si existe, -1 en caso contrario.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @param inicio Indice del primer elemento del arreglo.
     * @param fin Indice del ultimo elemento del arreglo.
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     */
    public static <T extends Comparable<T>> int binarySearch(T datos[], T x, int inicio, int fin) {

// Casos base
        if (inicio > (fin)) {
            return -1;
        }
        int mitad = (inicio + fin) / 2;
        if (x.compareTo(datos[mitad]) == 0) {
            return mitad;
        }
// Casos recursivos
        if (x.compareTo(datos[mitad]) < 0) {
            return binarySearch(datos, x, inicio, (mitad - 1));
        } else {
            return binarySearch(datos, x, (mitad + 1), fin);
        }
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando el Algoritmo de
     * Búsqueda Binaria recursivo. El objeto compara contiene el método
     * compara() para comparar los elementos del arreglo. El método regresa la
     * posición del elemento x dentro del arreglo datos si existe, -1 en caso
     * contrario.
     *
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     */
    public static <T> int binarySearch(T datos[], T x, ICompara<? super T> compara) {
        return binarySearch(datos, x, compara, 0, datos.length - 1);
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando el Algoritmo de
     * Búsqueda Binaria.. El objeto compara contiene el método compara() para
     * comparar los elementos del arreglo, inicio y fin son los índices del
     * primer y último elemento del arreglo. El método regresa la posición del
     * elemento x dentro del arreglo datos si existe, -1 en caso contrario.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @param inicio Indice del primer elemento del arreglo.
     * @param fin Indice del ultimo elemento del arreglo.
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     *
     */
    public static <T> int binarySearch(T datos[], T x, ICompara<? super T> compara, int inicio, int fin) {
// Casos base

        if (inicio > fin) {
            return -1;
        }
        int mitad = (inicio + fin) / 2;
        if (compara.compara(x, datos[mitad]) == 0) {
            return mitad;
        }
// Casos recursivos
        if (compara.compara(x, datos[mitad]) < 0) {
            return binarySearch(datos, x, compara, inicio, mitad - 1);
        } else {
            return binarySearch(datos, x, compara, mitad + 1, fin);
        }
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando un Algoritmo de
     * Búsqueda Binaria no recursivo. Los elementos del arreglo implementan la
     * interfaz Comparable. El método regresa la posición del elemento x dentro
     * del arreglo datos si existe, -1 en caso contrario.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     */
    public static <T extends Comparable<T>> int binarySearchNoRec(T datos[], T x) {
        int inicio = 0;
        int fin = datos.length - 1;
        int mitad = -1;
        while (inicio <= fin) {
            mitad = (inicio + fin) / 2;
            if (datos[mitad].compareTo(x) == 0) {
                return mitad;
            } else if (x.compareTo(datos[mitad]) < 0) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }
        return -1;
    }

    /**
     * Busca en el arreglo ordenado datos el elemento x usando un Algoritmo de
     * Búsqueda Binaria no recursivo. El objeto compara contiene el método
     * compara() para comparar los elementos del arreglo. El método regresa la
     * posición del elemento x dentro del arreglo datos si existe, -1 en caso
     * contrario.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo donde se buscar el elemento x
     * @param x Elemento a buscar en el arreglo datos
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @return El índice de la primera ocurrencia del elemento x dentro del
     * arreglo datos si se encuentra, -1 en caso contrario.
     *
     */
    public static <T> int binarySearchNoRec(T datos[], T x, ICompara<? super T> compara) {
        int inicio = 0;
        int fin = datos.length - 1;
        int mitad = -1;
        while (inicio <= fin) {
            mitad = (inicio + fin) / 2;
            if (compara.compara(datos[mitad], x) == 0) {
                return mitad;
            } else if (compara.compara(x, datos[mitad]) < 0) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }
        return -1;
    }

}
