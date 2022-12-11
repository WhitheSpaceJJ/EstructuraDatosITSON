/*
 * TiposComodin.java
 * Creada el 30 de octubre del 2021 9:00 AM
 */
package genericos;

import interfaces.IList;

/**
 * Esta clase implementa algunas operaciones sobre listas genericas. Alumnno;
 * José Jesús Orozco Hernández ID; 00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class TiposComodin {

    /**
     * Este metodo regresa true si el elemento dato esta en la lista datos,
     * false en caso contrario.
     *
     * @param <T> Tipo de los elementos de la lista datos
     * @param dato dato a buscar en la lista
     * @param datos Lista con los elementos
     * @return true si el elemento dato esta en la lista datos, false en caso
     * contrario
     */
    public static <T> boolean contiene(IList<? super T> datos,
            T dato) {
        return datos.indexOf(dato) >= 0;
    }

    /**
     * Regresa la suma de los elementos de la lista datos
     *
     * @param datos Lista con los elementos a sumar
     * @return La suma de los elementos de la lista datos
     */
    public static double suma(IList<? extends Number> datos) {
        double acum = 0.0;
        for (int i = 0; i < datos.size(); i++) {
            acum += datos.get(i).doubleValue();
        }
        return acum;
    }

    /**
     * Regresa el promedio de los elementos de la lista datos
     *
     * @param datos Lista con los elementos a promediar
     * @return El promedio de los elementos de la lista datos
     * @throws ArithmeticException Si la lista datos esta vacio
     */
    public static double promedio(IList<? extends Number> datos)
            throws ArithmeticException {
        if (datos.empty()) {
            throw new ArithmeticException("Lista vacia");
        }
        return suma(datos) / datos.size();
    }

    /**
     * Regresa el mayor de los elementos de la lista datos
     *
     * @param <T> Tipo de los elementos de la lista datos
     * @param datos Lista con los elementos
     * @return El mayor de los elementos de la lista datos
     */
    public static <T> T max(IList<? extends Comparable> datos) {
        Comparable mayor = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            if (mayor.compareTo(datos.get(i)) < 0) {
                mayor = datos.get(i);
            }
        }
        return (T) mayor;
    }

    /**
     * Regresa el menor de los elementos de la lista datos
     *
     * @param <T> Tipo de los elementos de la lista datos
     * @param datos Lista con los elementos
     * @return El menor de los elementos de la lista datos
     */
    public static <T> T min(IList<? extends Comparable> datos) {
        Comparable menor = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            if (menor.compareTo(datos.get(i)) > 0) {
                menor = datos.get(i);
            }
        }
        return (T) menor;
    }

    /**
     * Cuenta el número de ocurrencias de un elemento dato en la lista datos. El
     * método regresa el número de veces que el elemento dato ocurre en la lista
     * datos.
     *
     * @param <T> Tipo de los elementos de la lista datos
     * @param datos Lista con los elementos
     * @param dato Dato a buscar en la lista
     * @return El numero de ocurrencias de dato en la lista datos
     */
    public static <T> int cuenta(IList<? super T> datos, T dato) {
        int acum = 0;
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).equals(dato)) {
                acum++;
            }
        }
        return acum;
    }

    /**
     * Calcula la desviación estándar de los valores de la lista datos.
     *
     * @param datos Lista con los elementos
     * @return La desviacion estandar de los elementos de la lista.
     * @throws ArithmeticException Si la lista datos esta vacia
     */
    public static double desvStd(IList<? extends Number> datos) throws ArithmeticException {
        double mean = promedio(datos);
        double standardDeviation = 0.0;
        for (int i = 0; i < datos.size(); i++) {
            standardDeviation += Math.pow(datos.get(i).doubleValue() - mean, 2);
        }
        return Math.sqrt(standardDeviation / datos.size());
    }

    /**
     * Determina si los elementos del arreglo están ordenados en forma
     * ascendente.
     *
     * @param datos Lista con los elementos
     * @return true si el arreglo esta ordenado de forma ascendente, false en
     * caso contrario.
     */
    public static boolean enOrden(IList<? extends Comparable> datos) {
        Comparable menor = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            if (menor.compareTo(datos.get(i)) <= 0) {
                menor = datos.get(i);
            } else {
                return false;
            }
        }
        return true;
    }
}
