/*
 * MetodosGenericos.java
 * Creada el 29 de octubre del 2021 8 PM 
 */
package genericos;

/**
 * Esta clase implementa algunas operaciones sobre arreglos genericos- Alumno;
 * José Jesús Orozco Hernández ID; 00000229141
 *
 * @author Jose Jesus Orozco Hernandez
 */
public class MetodosGenericos {

    /**
     * Este metodo regresa true si el elemento dato esta en el arreglo datos,
     * false en caso contrario.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param dato dato a buscar en el arreglo
     * @param datos Arreglo con los elementos
     * @return true si el elemento dato esta en el arreglo datos, false en caso
     * contrario
     */
    public static <T> boolean contiene(T[] datos, T dato) {
        for (T datoi : datos) {
            if (dato.equals(datoi)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Regresa la suma de los elementos del arreglo datos
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos a sumar
     * @return La suma de los elementos del arreglo datos
     */
    public static <T extends Number> double suma(T[] datos) {
        double acum = 0.0;
        for (T dato : datos) {
            acum += dato.doubleValue();
        }
        return acum;
    }

    /**
     * Regresa el promedio de los elementos del arreglo datos
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos a promediar
     * @return El promedio de los elementos del arreglo datos
     * @throws ArithmeticException Si el arreglo datos esta vacio
     */
    public static <T extends Number> double promedio(T[] datos)
            throws ArithmeticException {
        int n = datos.length;
        if (n == 0) {
            throw new ArithmeticException("Arreglo vacio");
        }
        return suma(datos) / n;
    }

    /**
     * Regresa el mayor de los elementos del arreglo datos
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos
     * @return El mayor de los elementos del arreglo datos
     */
    public static <T extends Comparable<T>> T max(T[] datos) {
        T mayor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (mayor.compareTo(datos[i]) < 0) {
                mayor = datos[i];
            }
        }
        return mayor;
    }

    /**
     * Regresa el menor de los elementos del arreglo datos
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos
     * @return El menor de los elementos del arreglo datos
     */
    public static <T extends Comparable<T>> T min(T[] datos) {
        T menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (menor.compareTo(datos[i]) > 0) {
                menor = datos[i];
            }
        }
        return menor;
    }

    /**
     * Cuenta el número de ocurrencias de un elemento dato en el arreglo datos.
     * El método regresa el número de veces que el elemento dato ocurre en el
     * arreglo datos.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos
     * @param dato dato a buscar en el arreglo
     * @return El numero de ocurrencias de datos en el arreglo de datos
     */
    public static <T> int cuenta(T[] datos, T dato) {
        int acum = 0;
        for (T dato1 : datos) {
            if (dato1.equals(dato)) {
                acum++;
            }
        }
        return acum;
    }

    /**
     * Calcula la desviación estándar de los valores del arreglo datos.
     *
     * @param <T>Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos
     * @return La desviacion estandar del arreglo datos y sus elementos
     * @throws ArithmeticException Si el arreglo datos esta vacio
     */
    public static <T extends Number> double desvStd(T[] datos)
            throws ArithmeticException {
        double mean = promedio(datos);
        double standardDeviation = 0.0;
        for (T dato : datos) {
            standardDeviation += Math.pow(dato.doubleValue() - mean, 2);
        }
        return Math.sqrt(standardDeviation / datos.length);
    }

    /**
     * Determina si los elementos del arreglo están ordenados en forma
     * ascendente.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo con los elementos
     * @return true si el arreglo esta ordenado de forma ascendente, false en
     * caso contrario
     */
    public static <T extends Comparable<T>> boolean enOrden(T[] datos) {
        T menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (menor.compareTo(datos[i]) <= 0) {
                menor = datos[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
