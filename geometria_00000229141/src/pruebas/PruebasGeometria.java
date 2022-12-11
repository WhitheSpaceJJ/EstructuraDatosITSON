/*
* PruebaGeometria.java
*
* Creada el 4 de septiembre de 2021, 02:08 PM
 */
package pruebas;

import excepciones.ValueException;
import implementaciones.Cilindro;

/**
 * Esta clase permite probar los metodos de la clase Cilindro. 
 * Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class PruebasGeometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Se crea cilindro de radio 1.0 y altura 2.0");
            Cilindro c1 = new Cilindro(1.0, 2.0);
            System.out.println("Datos del circulo: " + c1.toString());
            System.out.format("%s %.2f %n", "Area: ", c1.area());
            System.out.format("%s %.2f %n", "Volumen: ", c1.volumen());
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------");
        try {
            System.out.println("Se crea cilindro de radio -2.5 y altura 1.5");
            Cilindro c1 = new Cilindro(-2.5, 2);
            System.out.println("Datos del circulo: " + c1.toString());
            System.out.format("%s %.2f %n", "Area: ", c1.area());
            System.out.format("%s %.2f %n", "Volumen: ", c1.volumen());
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------");

        try {
            System.out.println("Se crea cilindro de radio 3.0 y altura 2.0");
            Cilindro c1 = new Cilindro(3.0, 2.0);
            System.out.println("Datos del circulo: " + c1.toString());
            System.out.format("%s %.2f %n", "Area: ", c1.area());
            System.out.format("%s %.2f %n", "Volumen: ", c1.volumen());
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------");
        try {
            System.out.println("Se crea cilindro de radio 3.0 y altura -2.0");
            Cilindro c1 = new Cilindro(3.0, -2.0);
            System.out.println("Datos del circulo: " + c1.toString());
            System.out.format("%s %.2f %n", "Area: ", c1.area());
            System.out.format("%s %.2f %n", "Volumen: ", c1.volumen());
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        }
    }

}
