/*
* PruebaBolsaGen.java
*
* Creada el 10 de septiembre de 2021, 10:41 PM
 */
package pruebas;

import excepciones.BolsaException;
import implementaciones.BolsaGen;
import java.util.Arrays;

/**
 * Esta clase permite probar los metodos de la clase BolsaGen. Alumno; José
 * Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class PruebaBolsaGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Profe en algunos de las formas que utilice para mostrar el los objetos de la bolsa
        utilice el String y ciclos para variar un poco, pero que me recomendaria usted.
         */
        System.out.println("--------------------------------------------------------");
        try {
            int tam = 5;
            System.out.println("Prueba 1");
            System.out.println("Se crea una instancia de BolsaGen, con un tamaño de 5");
            BolsaGen<Integer> bolsa = new BolsaGen<>(Integer.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,9,7");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 9 " + (bolsa.agrega(9) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 7 " + (bolsa.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,5,6");
            System.out.println("Numero 8 " + (bolsa.agrega(8) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Numero 5 " + (bolsa.agrega(5) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            try {
                System.out.println("Numero 6 " + (bolsa.agrega(7) ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            } catch (BolsaException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------");
            System.out.println("Numero de objetos;" + bolsa.obtenNumObjetos());
            System.out.println("Objetos");
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("El entero 8 existe en la bolsa");
            System.out.println(bolsa.contiene(8) ? "Si" : "No");
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            System.out.println("El entero 3 existe en la bolsa");
            System.out.println(bolsa.contiene(3) ? "Si" : "No");
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            System.out.println("Se va a remover el entero 7");
            System.out.println("¿Se ha removido?");
            Integer j = bolsa.remueve(7);
            System.out.println(j != null ? "Si" : "No");
            System.out.println("Objetos");
            System.out.println(bolsa.toString());
            System.out.println("-------------------------------------------------");
            System.out.println("Se va a remover el entero 12");
            System.out.println("¿Se ha removido?");
            Integer d = bolsa.remueve(12);
            System.out.println(d != null ? ("Si " + d) : ("No " + d));
            System.out.println("Objetos");
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            System.out.println("Cuantas veces se repite el entero 8");
            System.out.println("Total; " + bolsa.cuenta(8));
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            System.out.println("Cuantas veces se repite el entero 1");
            System.out.println("Total; " + bolsa.cuenta(1));
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Integer a = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (a != null ? a : "Ninguno"));
            System.out.println("Objetos actuales");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
//        System.out.println(Arrays.toString(bolsa.obtenObjetos()));
            System.out.println("-----------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Integer b = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (b != null ? b : "Ninguno"));
            System.out.println("Objetos actuales");
            for (Integer obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
//        System.out.println(Arrays.toString(bolsa.obtenObjetos()));
            System.out.println("-----------------------------------");
            System.out.println("Se va a vaciar la bolsa");
            bolsa.limpia();
            System.out.println(bolsa.toString());
            System.out.println("-----------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println(bolsa.toString());
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------");
        try {
            System.out.println("Prueba 2");
            int tam = 3;
            System.out.println("Se crea una instancia de bolsa, con un tamaño de 5");
            BolsaGen<String> bolsa = new BolsaGen<>(String.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se determina si la bolsa esta vacia");
            System.out.println("¿La bolsa esta vacia? " + (bolsa.vacia() == true ? "Si" : "No tiene objetos"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Se agregaran las cadenas Sol,Luna,Sol,Mar");
            System.out.println("Sol " + (bolsa.agrega("Sol") ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Luna" + (bolsa.agrega("Luna") ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            System.out.println("Sol " + (bolsa.agrega("Sol") ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            System.out.println(bolsa.toString());
            try {
                System.out.println("Mar " + (bolsa.agrega("Mar") ? " se ha agregado a la bolsa" : " no se ha agregado a la bolsa"));
            } catch (BolsaException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Cuantas veces se repite la cadena Sol");
            System.out.println("Total; " + bolsa.cuenta("Sol"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Cuantas veces se repite la cadena Lago");
            System.out.println("Total; " + bolsa.cuenta("Lago"));
            System.out.println(bolsa.toString());
            System.out.println("--------------------------------");
            System.out.println("Ahora se eliminara Luna de la bolsa, se verficara que si se elimino  y se volvera a agregar");
            bolsa.remueve("Luna");
            System.out.println("objetos de la bolsa");
            bolsa.toString1();
            System.out.println("Se agregara nuevamente Luna");
            bolsa.agrega("Luna");
            System.out.println("Objetos de la bolsa");
            bolsa.toString1();
            System.out.println("--------------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Object b = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (b != null ? b : "Ninguno"));
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Object c = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (c != null ? c : "Ninguno"));
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Object d = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (d != null ? d : "Ninguno"));
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Se va a remover un objeto al azar de la bolsa");
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            Object f = bolsa.remueve();
            System.out.println();
            System.out.println("Objeto removido " + (f != null ? f : "Ninguno"));
            System.out.println("Objetos actuales");
            for (String obtenObjeto : bolsa.obtenObjetos()) {
                if (obtenObjeto != null) {
                    System.out.print(obtenObjeto + ",");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------------------");
        try {
            int tam = 6;
            System.out.println("Prueba 3");
            System.out.println("Se crea una instancia de BolsaGen, con un tamaño de 6, esta prueba");
            System.out.println("es con el fin de saber si se lanzan las excepciones esperadas");
            BolsaGen<Integer> bolsa = new BolsaGen<>(Integer.class, tam);
            System.out.println(bolsa.toString());
            System.out.println("---------------------------------------");
            System.out.println("Se agregan los siguientes numeros 8,9,7,8,5,6");
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
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("En esta ocasion se genera una instancia de BolsaGenNum, con un tamaño negativo");
            System.out.println("Genera el siguiente mensaje;");
            BolsaGen<Integer> bolsaDos = new BolsaGen<>(Integer.class, -5);
            System.out.println(bolsaDos.toString());
        } catch (BolsaException e) {
            System.out.println(e.getMessage());
        }
    }

}
