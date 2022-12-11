/*
* PruebaBolsa.java
*
* Creada el 4 de septiembre de 2021, 02:08 PM
 */
package pruebas;

import excepciones.BolsaException;
import implementaciones.Bolsa;
//import java.util.Arrays;

/**
 * Esta clase permite probar los metodos de la clase bolsa. Alumno; José Jesús
 * Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class PruebaBolsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Pruebas de bolsa
        try {
            System.out.println("Prueba 1");
            System.out.println("Se crea una instancia de bolsa, con un tamaño de -5");
            Bolsa bolsaU = new Bolsa(-5);
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsaU.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,9,7");
            System.out.println("Numero 8 " + (bolsaU.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 9 " + (bolsaU.agrega(9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 7 " + (bolsaU.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsaU.obtenNumObjetos());
            System.out.println("Objetos");
            for (int obtenObjeto : bolsaU.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------------------------------------");
        try {
            System.out.println("Prueba 2");
            System.out.println("Se crea una instancia de bolsa, con un tamaño de 5");
            Bolsa bolsa = new Bolsa(5);
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,9,7");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 9 " + (bolsa.agrega(9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 7 " + (bolsa.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
//      System.out.println(Arrays.toString(bolsa.obtenObjetos()));
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,5,6");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 5 " + (bolsa.agrega(5) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("Numero 6 " + (bolsa.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("El entero 8 existe en la bolsa");
            System.out.println(bolsa.contiene(8) ? "Si" : "No");
            System.out.println("---------------------------------");
            System.out.println("El entero 3 existe en la bolsa");
            System.out.println(bolsa.contiene(3) ? "Si" : "No");
            System.out.println("---------------------------------");
            System.out.println("Se va a remover el entero 7");
            System.out.println("¿Se ha removido?");
            Integer j = bolsa.remueve(7);
            System.out.println(j != null ? "Si" : "No");
            System.out.println("---------------------------------");
            System.out.println("Se va a remover el entero 12");
            System.out.println("¿Se ha removido?");
            Integer d = bolsa.remueve(12);
            System.out.println(d != null ? ("Si " + d) : ("No " + d));
            System.out.println("---------------------------------");
            System.out.println("Cuantas veces se repite el entero 8");
            System.out.println("Total; " + bolsa.cuenta(8));
            System.out.println("---------------------------------");
            System.out.println("Cuantas veces se repite el entero 1");
            System.out.println("Total; " + bolsa.cuenta(1));
            System.out.println("---------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
            Integer a = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (a != null ? a : "Ninguno"));
            System.out.println("Objetos actuales");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
            System.out.println();
//        System.out.println(Arrays.toString(bolsa.obtenObjetos()));
            System.out.println("-----------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
            Integer b = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (b != null ? b : "Ninguno"));
            System.out.println("Objetos actuales");
            for (int obtenObjeto : bolsa.obtenObjetos()) {
                System.out.print(obtenObjeto + ",");
            }
            System.out.println();
//        System.out.println(Arrays.toString(bolsa.obtenObjetos()));
            System.out.println("-----------------------------------");
            System.out.println("Se va a vaciar la bolsa");
            bolsa.limpia();
            System.out.println("-----------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }

    }

}
