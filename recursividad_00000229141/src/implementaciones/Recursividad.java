/*
 *Recursividad.java
 *Creada el 21 de octubre del 2021 14:56 PM 
 */
package implementaciones;

/**
 * Esta clase implementa una serie de funciones recursivas. Alumno; Josè Jesùs
 * Orozco Hernàndez ID;00000229141
 *
 * @author Josè Jesus Orozco Hernandez
 */
public class Recursividad {

    /**
     * Calcula el factorial de un numero entero positivo
     *
     * @param n Entero del que se va a obtener el factorial
     * @return Factorial de un numero entero positivo
     */
    public long factorial(long n) {
        // Caso base
        if (n == 0) {
            return 1;
        }
        // Caso recursivo
        return factorial(n - 1) * n;
    }

    /**
     * Eleva x a la potencia n
     *
     * @param x Numero a elevar a la potencia n
     * @param n Potencia a elevar x
     * @return x a la potencia n
     */
    public double potencia(double x, int n) {
        // Caso base
        if (n == 0) {
            return 1;
        }
        // Caso recursivo
        return x * potencia(x, n - 1);
    }

    /**
     * Eleva x a la potencia n. Una versión más eficiente
     *
     * @param x Numero a elevar a la potencia n
     * @param n Potencia a elevar x
     * @return x a la potencia n
     */
    public double potencia2(double x, int n) {
        // Caso base
        if (n == 0) {
            return 1;
        }
        // Caso recursivo
        double pot = potencia2(x, n / 2);
        if (n % 2 == 0) {
            return pot * pot;
        }
        return x * pot * pot;
    }

    /**
     * Obiene el residuo de la division entera de a entre b
     *
     * @param a Dividendo de la division entera
     * @param b Divisor de la division entera
     * @return El residuo de la division entera de a entre b
     */
    public int modulo(int a, int b) {
        // Caso base
        if (a < b) {
            return a;
        }
        // Caso recursivo
        return modulo(a - b, b);
    }

    /**
     * Obtiene la suma de los elementos de un arreglo
     *
     * @param datos Arreglo a sumar sus elementos
     * @param n Numero de elementos del arreglo a sumar
     * @return La suma de los elementos de un arreglo
     */
    public int suma(int datos[], int n) {
        int pos = n - 1;
        // Caso base
        if (pos == 0) {
            return datos[0];
        }
        // Caso recursivo
        return datos[pos] + suma(datos, n - 1);
    }

    /**
     * Metodo que encuentra recursivamente el n-ésimo número Fibonacci.
     *
     * @param n Numero a obtener su fibonacci
     * @return EL fibonacci del numero
     */
    public long fibonacci(int n) {
        //Caso base
        if (n == 0) {
            return 0;
        //Caso base
        } else if (n == 1) {
            return 1;
        } else {
            //Recursion
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
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
        //Caso base
        if (b == 0) {
            return a;
        } else {
            //Recursion
            return mcd(b, a % b);
        }
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
        //Contador
        int contador = 0;
        //Se verifica el tamño del arreglo
        if (n != 0) {
             //Se compara si el objeto es igual a 0
            if (datos[n - 1] == o) {
                contador++;
            }
            //Recursion caso
            contador+=count(datos, n-1, o);
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
        //Comparacion
        if (inicio < fin) {
            //Cambios
            Object auxiliar = datos[inicio];
            datos[inicio] = datos[fin];
            datos[fin] = auxiliar;
            //Recursion
            reverse(datos, inicio + 1, fin - 1);
        }
    }
}
