/*
* BolsaGenNum.java
*
* Creada el 10 de septiembre de 2021, 10:41 PM
 */
package pruebas;

import excepciones.BolsaException;
import implementaciones.BolsaGenNum;

/**
 * Esta clase permite probar los metodos de la clase BolsaGenNum. Alumno; José
 * Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class PruebaBolsaGenNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
          Profe en algunos de las formas que utilice para mostrar el los objetos de la bolsa
        utilice el String y ciclos para variar un poco, pero que me recomendaria usted.
         */
        try {
            int tam = 6;
            System.out.println("Prueba 1");
            System.out.println("Se crea una instancia de BolsaGenNum, con un tamaño de 5");
            BolsaGenNum<Integer> bolsa = new BolsaGenNum<>(Integer.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes enteros a la bolsa, numeros 8,9,7,8,5,6");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 9 " + (bolsa.agrega(9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 7 " + (bolsa.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 5 " + (bolsa.agrega(5) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 6 " + (bolsa.agrega(6) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            try {
                System.out.println("Se intentara agregar otro entero aunque la bolsa este vacia");
                System.out.println("Se agregara el numero 10, y esto genero el siguiente mensaje;");
                bolsa.agrega(10);
            } catch (BolsaException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("--------------------------------------------");
            System.out.println("Suma de los elementos de la bolsa");
            System.out.println("Total; " + bolsa.suma());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
            System.out.println("Promedio de los elementos de la bolsa");
            System.out.println("Promedio; " + bolsa.promedio());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
            System.out.println("Numero de elementos mayores al promedio");
            System.out.println("Total; " + bolsa.mayores());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------------------");
        try {
            int tam = 5;
            System.out.println("Prueba 2");
            System.out.println("Se crea una instancia de BolsaGenNum, con un tamaño de 5");
            BolsaGenNum<Double> bolsa = new BolsaGenNum<>(Double.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 1.5,5.2,8.3,7.9,9.2");
            System.out.println("Numero 1.5 " + (bolsa.agrega(1.5) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 5.2 " + (bolsa.agrega(5.2) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 8.3 " + (bolsa.agrega(8.3) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 7.9 " + (bolsa.agrega(7.9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 9.2 " + (bolsa.agrega(9.2) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            try {
                System.out.println("----------------------------------------------------");
                System.out.println("Se intentara agregar otro entero aunque la bolsa este vacia");
                System.out.println("Se agregara el numero 10.5, y esto genero el siguiente mensaje;");
                bolsa.agrega(10.5);
            } catch (BolsaException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------------------");
            System.out.println("Suma de los elementos de la bolsa");
            System.out.println("Total; " + bolsa.suma());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
            System.out.println("Promedio de los elementos de la bolsa");
            System.out.println("Promedio; " + bolsa.promedio());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
            System.out.println("Numero de elementos mayores al promedio");
            System.out.println("Total; " + bolsa.mayores());
            System.out.println(bolsa.toString());
            System.out.println("------------------------------------------");
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------------------------");
        try {
            int tam = 2;
            System.out.println("Prueba 3");
            System.out.println("Se crea una instancia de BolsaGenNum, con un tamaño de 2, esta prueba");
            System.out.println("es con el fin de saber si se lanzan las excepciones esperadas");
            BolsaGenNum<Integer> bolsa = new BolsaGenNum<>(Integer.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,9,7,8,5,6");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 9 " + (bolsa.agrega(9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------------");
            try {
                System.out.println("Se intentara agregar otro entero aunque la bolsa este vacia");
                System.out.println("Se agregara el numero 10, y esto genero el siguiente mensaje;");
                bolsa.agrega(10);
            } catch (BolsaException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            // Genera error
            // BolsaGenNum<String> bolsaTres = new BolsaGenNum<>(String.class, 5);
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("En esta ocasion se genera una instancia de BolsaGenNum, con un tamaño negativo");
            System.out.println("Genera el siguiente mensaje;");
            BolsaGenNum<Integer> bolsaDos = new BolsaGenNum<>(Integer.class, -5);
            System.out.println(bolsaDos.toString());
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }

    }

}
