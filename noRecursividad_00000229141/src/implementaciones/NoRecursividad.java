/**
 * NoRecursividad.java
 * Creada el 26 de octubre del 2021 16:25 PM
 */
package implementaciones;

/**
 * Esta clase implementa una serie de funciones no recursivas. Alumno; Jose
 * Jesus Orozco Hernandez ID; 00000229141
 *
 * @author Jose Jesus Orozco Hernandez
 */
public class NoRecursividad {

    /**
     * Calcula el factorial de un numero entero positivo
     *
     * @param n Entero del que se va a obtener el factorial
     * @return Factorial de un numero entero positivo
     */
    public long factorial(long n) {
        long fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    /**
     * Eleva x a la potencia n
     *
     * @param x Numero a elevar a la potencia n
     * @param n Potencia a elevar x
     * @return x a la potencia n
     */
    public double potencia(double x, int n) {
        double pot = 1.0;
        while (n > 0) {
            pot *= x;
            n--;
        }
        return pot;
    }

    /**
     * Obiene el residuo de la division entera de a entre b
     *
     * @param a Dividendo de la division entera
     * @param b Divisor de la division entera
     * @return El residuo de la division entera de a entre b
     */
    public int modulo(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    /**
     * Obtiene la suma de los elementos de un arreglo
     *
     * @param datos Arreglo a sumar sus elementos
     * @param n Numero de elementos del arreglo a sumar
     * @return La suma de los elementos de un arreglo
     */
    public int suma(int datos[], int n) {
        int sum = datos[0];
        int i = 1;
        while (i < n) {
            sum += datos[i];
            i++;
        }
        return sum;
    }

    /**
     * Metodo que encuentra recursivamente el n-ésimo número Fibonacci.
     *
     * @param n Numero a obtener su fibonacci
     * @return EL fibonacci del numero
     */
    public long fibonacci(int n) {
        long siguiente = 1, actual = 0, temporal = 0;
        for (long x = 1; x <= n; x++) {
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        return actual;
    }

    /**
     * Metodo que que encuentra recursivamente el máximo común divisor de los
     * números enteros a y b.
     *
     * @param a Numero a
     * @param b Numero b
     * @return El maximo comun entre los dos numeros numeros
     */
    public int mcd(int a, int b) {
        int auxiliar;
        while (b != 0) {
            auxiliar = b;
            b = a % b;
            a = auxiliar;
        }
        return a;
    }

    /**
     * Metodo que obtiene recursivamente el número de veces que o ocurre en el
     * arreglo datos. n es el tamaño del arreglo.
     *
     * @param datos Aregglo de datos
     * @param n tamaño del arreglo
     * @param o Objeto a buscar
     * @return El numero de veces que se repite un objeto dentro del arreglo
     */
    public int count(Object datos[], int n, Object o) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (datos[i] == o) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodo que invierte recursivamente los elementos del arreglo datos.
     * inicio es el primer elemento de arreglo y fin es el último elemento del
     * arreglo.
     *
     * @param datos El arreglo
     * @param inicio Inicio del arreglo (indice)
     * @param fin Fin del arreglo (indice)
     */
    public void reverse(Object datos[], int inicio, int fin) {
        while (inicio < fin) {
            Object auxiliar = datos[inicio];
            datos[inicio] = datos[fin];
            datos[fin] = auxiliar;
            inicio++;
            fin--;
        }
    }
}
