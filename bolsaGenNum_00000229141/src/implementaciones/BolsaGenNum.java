/*
* BolsaGenNum.java
*
* Creada el 10 de septiembre de 2021, 10:41 PM
 */
package implementaciones;

import excepciones.BolsaException;
import java.util.Arrays;

/**
 * Esta clase es la representacion de una bolsa ficticia generica numerica con
 * parametro acotado a la clase Number. Alumno; José Jesús Orozco Hernández
 * ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 * @param <T> Parametro de tipo de la BolsaGenNum acotado a la clase number
 *
 */
public class BolsaGenNum<T extends Number> {

    /**
     * Atribuo para establecer el tamaño de la bolsa
     */
    private int tamBolsa;
    /**
     * Atributo para representar el total de objetos de la bolsa
     */
    private int numObjetos;
    /**
     * Arreglo generico
     */
    private T[] objetos;

    /**
     * Constructor. Inicializa el valor del atributo tamBolsa en base al
     * parametro,luego inicializa el atributo numOBjetos a cero y crea el
     * arreglo generico de tamaño correspondiente con el atributo bolsa.
     *
     * @param tipoArreglo EL tipo de clase o paramtero de tipo
     * @param tamBolsa Tamaño de la bolsa
     */
    public BolsaGenNum(Class<T> tipoArreglo, int tamBolsa) {
        //Verifica si el paramtero tamBolsa es negativo o 0 y lanza una excepcion del tipo BolsaException 
        if (tamBolsa <= 0) {
            throw new BolsaException("Error tamaño de bolsa invalido");
        }
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
        this.objetos = (T[]) java.lang.reflect.Array
                .newInstance(tipoArreglo, tamBolsa);
    }

    /**
     * Metodo para obtener el numero de objetos totales de la bolsa
     *
     * @return El numero de objetos de la bolsa
     */
    public int obtenNumObjetos() {
        return numObjetos;
    }

    /**
     * Verifica si la bolsa generica esta vacia o no
     *
     * @return Verdadera si esta vacia, falso en caso contrario
     */
    public boolean vacia() {
        return objetos != null;
    }

    /**
     * Metodo para agregar un parametro generico al arreglo generico
     *
     * @param objeto Dato generico a agregar al arreglo
     * @return Verdadero si el objeto fue agregado, falso en caso contrario
     */
    public boolean agrega(T objeto) {
        //Variable aixiliar nos apoya en devolver verdadero o false, deacuerdo a la condicion
        boolean auxiliar = true;
        //Verifica si la bolsa esta vacia
        if (numObjetos >= tamBolsa) {
            auxiliar = false;
            throw new BolsaException("La bolsa se encuentra llena");
        }

        objetos[numObjetos] = objeto;
        numObjetos++;
        return auxiliar;
    }

    /**
     * Metodo por el cual se elimina un dato de la bolsa al azar
     *
     * @return El objeto del tipo Integer si este fue eliminado, null en caso
     * contrario
     */
    public T remueve() {
        //valor permite escoger un numero al azar del tamaño de la bolsa
        int valor = (1 + (int) (tamBolsa * Math.random())) - 1;
        T devolucion = objetos[valor];
        // Determina si devolucion se le ha agregado un objeto que va a eliminar,null en caso contraio
        if (devolucion != null) {
            objetos[valor] = null;
            numObjetos = numObjetos - 1;
            // Ciclo que recorre los elementos del arreglo un espacio cuando un elemento es eliminado
            for (int i = 0; i < objetos.length; i++) {
                int d = i;
                if (d < objetos.length - 1) {
                    if (objetos[d] == null) {
                        objetos[d] = objetos[d + 1];
                        objetos[d + 1] = null;
                    }
                }

            }
            return devolucion;
        } else {
            return null;
        }

    }

    /**
     * Remueve un objeto especifico de dentro de la bolsa generica
     *
     * @param objeto Elemento a eliminar
     * @return El objeto si este fue eliminado, null en caso contrario.
     */
    public T remueve(T objeto) {
        //condicion que se apoya con el metodo contiene
        if (contiene(objeto)) {
            T devolucion = objeto;
            for (int i = 0; i < objetos.length; i++) {
                T objeto1 = objetos[i];
                //Condicional que determina si los objetos son iguales con el fin de eliminarlo
                if (objeto1.equals(objeto)) {
                    objetos[i] = null;
                    numObjetos = numObjetos - 1;
                    break;
                }
            }
            // Ciclo que recorre los elementos del arreglo un espacio cuando un elemento es eliminado
            for (int i = 0; i < objetos.length; i++) {
                int d = i;
                if (d < objetos.length - 1) {
                    if (objetos[d] == null) {
                        objetos[d] = objetos[d + 1];
                        objetos[d + 1] = null;
                    }
                }

            }
            return devolucion;
        } else {
            return null;
        }

    }

    /**
     * Metodo que elimina los objetos existentes de la bolsa.
     */
    public void limpia() {
        numObjetos = 0;
        //Ciclo de eliminacion
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = null;
        }
    }

    /**
     * Metodo para determinar la cantidad de veces que se repite determinado
     * elemento en la bolsa generica
     *
     * @param objeto Elemento a evaluar
     * @return La cantidad de veces que se repite el objeto en la bolsa.
     */
    public int cuenta(T objeto) {
        // Contador nos ayuda a determinar las veces que un objeto se repite en un arreglo
        int contador = 0;
        for (T objeto1 : objetos) {
            if (objeto1 != null) {
                //Condicional que determina si los objetos son iguales
                if (objeto1.equals(objeto)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Metodo que determina si un determinado elmento existe en la bolsa
     *
     * @param objeto Elemento a encontrar
     * @return Verdadero si el objeto esta contenido en la bolsa generica, falso
     * en caso contrario.
     */
    public boolean contiene(T objeto) {
        for (T objeto1 : objetos) {
            if (objeto1 != null) {
                //Condicional que determina si los objetos son iguales
                if (objeto1.equals(objeto)) {
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * Metodo para obtener el arreglo generico
     *
     * @return El arreglo generico.
     */
    public T[] obtenObjetos() {
        return objetos;
    }

    /**
     * Metodo que devuelve el total de numeros del arreglo que sean mayores a su
     * promedio
     *
     * @return EL numero de elementos del arreglo mayores al promedio de este
     */
    public int mayores() {
        int contador = 0;
        for (T objeto : objetos) {
            if (objeto != null) {
                if (objeto.doubleValue() > promedio()) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Metodo por el cual se calcular el promedio de los elementos del arreglo
     * generico
     *
     * @return El promedio de los elementos del arreglo
     */
    public double promedio() {
        return suma() / objetos.length;
    }

    /**
     * Regresa la suma de los elementos del arreglo datos
     *
     * @return La suma de los elementos del arreglo datos
     */
    public double suma() {

        double acum = 0.0;
        //Ciclo que realiza la suma de los datos del arreglo
        for (T dato : objetos) {
            if (dato != null) {
                acum += dato.doubleValue();
            }
        }
        return acum;
    }

    /**
     * Metodo para mostrar todos los elmentos del arreglo generico, que sean
     * diferentes de nulo
     */
    public void toString1() {
        //Ciclo que nos muestra los elementos de la bolsa
        for (T obtenObjeto : objetos) {
            if (obtenObjeto != null) {
                System.out.print(obtenObjeto + ",");
            } else {
                System.out.print("");
            }
        }
    }

    /**
     * Regresa una cadena con los valores del arreglo datos
     *
     * @return Una cadena con los valores del arreglo datos
     */
    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }
}
