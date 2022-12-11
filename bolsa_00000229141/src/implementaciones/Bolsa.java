/*
* Bolsa.java
*
* Creada el 4 de septiembre de 2021, 02:08 PM
 */
package implementaciones;

import excepciones.BolsaException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase es la representacion de una bolsa ficticia que se permite agregar
 * objetos del tipo entero. Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class Bolsa {

    /**
     * Atribuo para establecer el tamaño de la bolsa
     */
    private int tamBolsa;
    /**
     * Atributo para representar el total de objetos de la bolsa
     */
    private int numObjetos;
    /**
     * Arreglo del tipo Integer
     */
    private Integer[] objetos;

    /**
     * Constructor. Inicializa el valor del atributo tamBolsa en base al
     * parametro,luego inicializa el atributo numOBjetos. y crea el arreglo del
     * tipo Integer objetos al tamaño tamBolsa.
     *
     * @param tamBolsa Tamaño de la bolsa
     */
    public Bolsa(int tamBolsa) {
        //Verifica si el paramtero tamBolsa es negativo o 0 y lanza una excepcion del tipo BolsaException 
        if (tamBolsa <= 0) {
            throw new BolsaException("Error tamaño de bolsa invalido");
        }
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
        this.objetos = new Integer[tamBolsa];
    }

    /**
     * Metodo para obtener el numero de objetos totales de la bolsa
     *
     * @return El numero de objetos de la bolsa
     */
    public int obtenNumObjetos() {
        int regresa = 0;
        //Ciclo para  buscar la cantidad objetos de la olsa
        for (Integer objeto : objetos) {
            //Condicion que determina los objetos para incrementar el contador en uno
            if (objeto != null) {
                numObjetos++;
            }
        }
        regresa = numObjetos;
        return regresa;
    }

    /**
     * Verifica si la bolsa esta vacia o no
     *
     * @return Verdadera si esta vacia, falso en caso contrario
     */
    public boolean vacia() {
        return objetos != null;
    }

    /**
     * Metodo para agregar un objeto del tipo Integer al arreglo.
     *
     * @param objeto Objeto del tipo integer
     * @return Verdadero si el objeto fue eliminado, falso en caso contrario
     */
    public boolean agrega(Integer objeto) {
        //Me ayuda a contar los espacios disponibles junto con el ciclo
        int contador = 0;
        // Ciclo uno
        for (Integer objeto1 : objetos) {
            if (objeto1 == null) {
                contador++;
            }
        }
        //Determina si aun existen espacios disponibles para agregar mas objetos
        if (contador <= tamBolsa && contador > 0) {
            for (int i = 0; i < objetos.length; i++) {
                if (objetos[i] == null) {
                    //Condicional que determina si los objetos son iguales con el fin de agregarlo
                    objetos[i] = objeto;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
        
    }

    /**
     * Metodo por el cual se elimina un objeto del tipo Integer de la bolsa al
     * azar.
     *
     * @return El objeto del tipo Integer si este fue eliminado, null en caso
     * contrario
     */
    public Integer remueve() {
        //valor permite escoger un numero al azar del tamaño de la bolsa
        int valor = (1 + (int) (tamBolsa * Math.random())) - 1;
        Integer devolucion = objetos[valor];
        // Determina si devolucion se le ha agregado un objeto que va a eliminar,null en caso contraio
        if (devolucion != null) {
            objetos[valor] = null;
            return devolucion;
        } else {
            return null;
        }
        
    }

    /**
     * Remueve un objeto especifico del arreglo de objetos.
     *
     * @param objeto Objeto del tipo integer a eliminar
     * @return El objeto si este fue eliminado, null en caso contrario.
     */
    public Integer remueve(Integer objeto) {
        //condicion que se apoya con el metodo contiene
        if (contiene(objeto)) {
            int devolucion = objeto;
            for (int i = 0; i < objetos.length; i++) {
                Integer objeto1 = objetos[i];
                //Condicional que determina si los objetos son iguales con el fin de eliminarlo
                if (objeto1.equals(objeto)) {
                    objetos[i] = null;
                    break;
                }
            }
            
            return devolucion;
        } else {
            return null;
        }
        
    }

    /**
     * Metodo que elimina los objetos existe de la bolsa.
     */
    public void limpia() {
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = null;
        }
    }

    /**
     * Metodo para determinar la cantidad de veces que se repite determinado
     * objeto en la bolsa
     *
     * @param objeto Objeto a evaluar
     * @return La cantidad de veces que se repite el objeto en la bolsa.
     */
    public int cuenta(Integer objeto) {
        // Contador nos ayuda a determinar las veces que un objeto se repite en un arreglo
        int contador = 0;
        for (Integer objeto1 : objetos) {
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
     * Metodo que determina si un determinado objeto del tipo Integer se
     * encuentra en la bolsa.
     *
     * @param objeto Objeto del tipo Integer a encontrar
     * @return Verdadero si el objeto esta contenido en la bolsa, falso en caso
     * contrario.
     */
    public boolean contiene(Integer objeto) {
        for (Integer objeto1 : objetos) {
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
     * Metodo para obtener los objetos del arreglo que esten presentes.
     *
     * @return Los objetos del arreglo.
     */
    public Integer[] obtenObjetos() {
        int cont = 0;
//        int[] arreglo = new int[0];
        Integer[] arreglo = new Integer[0];
        //El siguiente array list nos ayuda para realizar otro arreglo que sera el que se regresara.
        ArrayList<Integer> auxiliar;
        auxiliar = new ArrayList<>();
        //Ciclo auxiliar
        for (Integer objeto : objetos) {
            if (objeto != null) {
                auxiliar.add(objeto);
                cont++;
            }
        }
        // Condicional de apoyo para agregar parametros al arreglo
        if (cont == 0) {
            return arreglo;
        } else {
            arreglo = new Integer[auxiliar.size()];
            //Ciclo del arreglo a devolcer
            for (int i = 0; i < auxiliar.size(); i++) {
                arreglo[i] = auxiliar.get(i);
            }
            return arreglo;
        }
        
    }
}
