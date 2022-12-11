/*
  * Ordenamiento.java
 * Creada el 4 de noviembre del 2021 a las 10:41 AM
 */
package implementaciones;

import interfaces.ICompara;

/**
 * Esta clase implementa diferentes algoritmos genéricos de ordenamiento.
 * Alumno; Josè Jesùs Orozco Hernàndez ID; 00000229141
 *
 * @author Jose Jesus Orozco Hernandez
 */
public class Ordenamiento {

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de la
     * burbuja. Los elementos del arreglo implementan la interfaz Comparable
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     */
    public static <T extends Comparable<T>> void bubbleSort(T datos[]) {
        boolean huboIntercambios = true;
        while (huboIntercambios) {
            huboIntercambios = false;
            for (int i = 0; i < datos.length - 1; i++) {
// si(datos[i] > datos[i+1])
                if (datos[i].compareTo(datos[i + 1]) > 0) {
// intercambia(datos[i], datos[i + 1])
                    T t = datos[i];
                    datos[i] = datos[i + 1];
                    datos[i + 1] = t;
                    huboIntercambios = true;
                }
            }
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de la
     * burbuja. El objeto compara contiene el metodo compara() para comparar los
     * elementos del arreglo
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     */
    public static <T> void bubbleSort(T datos[], ICompara<? super T> compara) {
        boolean huboIntercambios = true;
        while (huboIntercambios) {
            huboIntercambios = false;
            for (int i = 0; i < datos.length - 1; i++) {
// si(datos[i] > datos[i+1])
                if (compara.compara(datos[i], datos[i + 1]) > 0) {
// intercambia(datos[i], datos[i + 1])
                    T t = datos[i];
                    datos[i] = datos[i + 1];
                    datos[i + 1] = t;
                    huboIntercambios = true;
                }
            }
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Ordenamiento QuickSort. Los elementos del arreglo implementan la interfaz
     * Comparable
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     */
    public static <T extends Comparable<T>> void quickSort(T datos[]) {
        quickSort(datos, 0, datos.length - 1);
    }

    /**
     * Este metodo es llamado por el metodo quickSort() y ordena recursivamente
     * el arreglo datos en orden creciente usando el Algoritmo de Ordenamiento
     * QuickSort. Los elementos del arreglo implementan la interfaz Comparable
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     */
    public static <T extends Comparable<T>> void quickSort(T datos[], int inicio, int fin) {
        if (inicio < fin) {
            int p = particiona(datos, inicio, fin);
            quickSort(datos, inicio, p - 1);
            quickSort(datos, p + 1, fin);
        }
    }

    /**
     * Este metodo es llamado por el metodo quickSort() y particiona el arreglo
     * a ordenar en dos subarreglos. Uno con los elementos menores a un valor
     * pivote y el otro con los elementos mayores al pivote. Los elementos del
     * arreglo implementan la interfaz * Comparable
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     * @return La posición del valor pivote
     */
    private static <T extends Comparable<T>> int particiona(T datos[], int inicio, int fin) {
        T pivote = datos[fin];
        int i = inicio;
        for (int j = inicio; j < fin; j++) {
// Si el dato es menor que el pivote
            if (datos[j].compareTo(pivote) < 0) {
// muevelo al lado izquierdo del arreglo
                T t = datos[i];
                datos[i] = datos[j];
                datos[j] = t;
                i++;
            }
        }
// coloca el pivote a la derecha de los elementos menores a el
        T t = datos[i];
        datos[i] = datos[fin];
        datos[fin] = t;
        return i;
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Ordenamiento QuickSort. El objeto compara contiene el metodo compara()
     * para comparar los elementos del arreglo
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     */
    public static <T> void quickSort(T datos[], ICompara<? super T> compara) {
        quickSort(datos, compara, 0, datos.length - 1);
    }

    /**
     * Este metodo es llamado por el metodo quickSort() y ordena recursivamente
     * el arreglo datos en orden creciente usando el Algoritmo de Ordenamiento
     * QuickSort. El objeto compara contiene el método compara() para comparar
     * los elementos del arreglo
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     */
    public static <T> void quickSort(T datos[], ICompara<? super T> compara, int inicio, int fin) {
        if (inicio < fin) {
            int p = particiona(datos, compara, inicio, fin);
            quickSort(datos, compara, inicio, p - 1);
            quickSort(datos, compara, p + 1, fin);
        }
    }

    /**
     * Este metodo es llamado por el metodo quickSort() y particiona el arreglo
     * a ordenar en dos subarreglos. Uno con los elementos menores a un valor
     * pivote y el otro con los elementos mayores al pivote. El objeto compara
     * contiene el método compara() para comparar los elementos del arreglo
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     * @return La posición del valor pivote
     */
    private static <T> int particiona(T datos[], ICompara<? super T> compara, int inicio, int fin) {
        T pivote = datos[fin];
        int i = inicio;
        for (int j = inicio; j < fin; j++) {
// Si el dato es menor que el pivote
            if (compara.compara(datos[j], pivote) < 0) {
// muevelo al lado izquierdo del arreglo
                T t = datos[i];
                datos[i] = datos[j];
                datos[j] = t;
                i++;
            }
        }
// coloca el pivote a la derecha de los elementos menores a el
        T t = datos[i];
        datos[i] = datos[fin];
        datos[fin] = t;
        return i;
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Selección. Los elementos del arreglo implementan la interfaz Comparable.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     */
    public static <T extends Comparable<T>> void selectionSort(T datos[]) {
        int i = 0;
        while (i < datos.length - 1) {
            int menor = i;
            int j = i + 1;
            while (j < datos.length) {
                if (datos[j].compareTo(datos[menor]) < 0) {
                    menor = j;
                }
                j = j + 1;
            }
            if (menor != i) {
                T t = datos[i];
                datos[i] = datos[menor];
                datos[menor] = t;
            }
            i = i + 1;
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Selección. El objeto compara contiene el método compara() para comparar
     * los elementos del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     */
    public static <T> void selectionSort(T datos[], ICompara<? super T> compara) {
        int i = 0, j, menor;
        while (i < datos.length) {
            menor = i;
            j = i + 1;
            while (j < datos.length) {
                if (compara.compara(datos[j], datos[menor]) < 0) {
                    menor = j;
                }
                j = j + 1;
            }
            if (menor != i) {
                T t = datos[i];
                datos[i] = datos[menor];
                datos[menor] = t;
            }
            i = i + 1;
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Inserción. Los elementos del arreglo implementan la interfaz Comparable.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     *
     */
    public static <T extends Comparable<T>> void insertionSort(Object datos[]) {
        for (int i = 1; i < datos.length; i++) {
            T x = (T) datos[i];
            int j = i - 1;
            while (j >= 0 && ((T) datos[j]).compareTo(x) > 0) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = x;
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo de
     * Inserción. El objeto compara contiene el método compara() para comparar
     * los elementos del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     */
    public static <T> void insertionSort(Object datos[], ICompara<? super T> compara) {
        for (int i = 1; i < datos.length; i++) {
            T x = (T) datos[i];
            int j = i - 1;
            while (j >= 0 && compara.compara(((T) datos[j]), x) > 0) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = x;
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo Merge
     * Sort. Los elementos del arreglo implementan la interfaz Comparable.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     *
     */
    public static <T extends Comparable<T>> void mergeSort(Object datos[]) {
        mergeSort(datos, 0, (datos.length - 1));
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo Merge
     * Sort. Los elementos del arreglo implementan la interfaz Comparable,
     * inicio y fin son los índices del primer y último elemento del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     */
    public static <T extends Comparable<T>> void mergeSort(Object datos[], int inicio, int fin) {
        if (inicio < fin) {
            int m = (inicio + fin) / 2;
            mergeSort(datos, inicio, m);
            mergeSort(datos, (m + 1), fin);
            merge(datos, inicio, m, fin);
        }
    }

    /**
     * Método llamado por el método mergeSort() y une las mitades ordenadas del
     * arreglo datos. Los elementos del arreglo implementan la interfaz
     * Comparable, inicio, medio y fin son los índices del primer, medio y
     * último elemento del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param inicio Indice del primer elemento del arreglo
     * @param medio Mitad de la lista(Indice)
     * @param fin Indice del último elemento del arreglo
     */
    private static <T extends Comparable<T>> void merge(Object datos[], int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;
        Object izq[] = new Object[n1];
        Object der[] = new Object[n2];
        for (int i = 0; i < n1; ++i) {
            izq[i] = datos[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            der[j] = datos[medio + 1 + j];
        }
        int j = 0;
        int i = 0;
        int k = inicio;
        while (i < medio - inicio + 1 && j < fin - medio) {
            if (((T) izq[i]).compareTo((T) der[j]) < 0) {
                datos[k] = izq[i];
                i = i + 1;
            } else {
                datos[k] = der[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < n1) {
            datos[k] = izq[i];
            i++;
            k++;
        }
        while (j < n2) {
            datos[k] = der[j];
            j++;
            k++;
        }
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo Merge
     * Sort. El objeto compara contiene el método compara() para comparar los
     * elementos del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     */
    public static <T> void mergeSort(Object datos[], ICompara<? super T> compara) {
        mergeSort(datos, compara, 0, datos.length - 1);
    }

    /**
     * Ordena el arreglo datos en orden creciente usando el Algoritmo Merge
     * Sort. El objeto compara contiene el método compara() para comparar los
     * elementos del arreglo, inicio y fin son los índices del primer y último
     * elemento del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @param inicio Indice del primer elemento del arreglo
     * @param fin Indice del último elemento del arreglo
     */
    public static <T> void mergeSort(Object datos[], ICompara<? super T> compara, int inicio, int fin) {
        if (inicio < fin) {
            int m = (inicio + fin) / 2;
            mergeSort(datos, compara, inicio, m);
            mergeSort(datos, compara, (m + 1), fin);
            merge(datos, compara, inicio, m, fin);
        }
    }

    /**
     * Método llamado por el método mergeSort() y une las mitades ordenadas del
     * arreglo datos. El objeto compara contiene el método compara() para
     * comparar los elementos del arreglo, inicio, medio y fin son los índices
     * del primer, medio y último elemento del arreglo.
     *
     * @param <T> Tipo de los elementos del arreglo datos
     * @param datos Arreglo de elementos a ordenar
     * @param compara Objeto con el metodo compara() para comparar los elementos
     * del arreglo
     * @param inicio Indice del primer elemento del arreglo
     * @param medio Mitad de la lista(Indice)
     * @param fin Indice del último elemento del arreglo
     *
     */
    private static <T> void merge(Object datos[], ICompara<? super T> compara, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;
        Object izq[] = new Object[n1];
        Object der[] = new Object[n2];
        for (int i = 0; i < n1; ++i) {
            izq[i] = datos[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            der[j] = datos[medio + 1 + j];
        }
        int j = 0;
        int i = 0;
        int k = inicio;
        while (i < medio - inicio + 1 && j < fin - medio) {
            if (compara.compara(((T) izq[i]), ((T) der[j])) < 0) {
                datos[k] = izq[i];
                i = i + 1;
            } else {
                datos[k] = der[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < n1) {
            datos[k] = izq[i];
            i++;
            k++;
        }
        while (j < n2) {
            datos[k] = der[j];
            j++;
            k++;
        }
    }
}
