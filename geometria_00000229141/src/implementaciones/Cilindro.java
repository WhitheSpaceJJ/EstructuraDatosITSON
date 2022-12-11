/*
* Cilindro.java
*
* Creada el 4 de septiembre de 2021, 02:08 PM
 */
package implementaciones;

import excepciones.ValueException;

/**
 * Esta clase es la representacion de cilindro.
 * Alumno; José Jesús Orozco Hernández ID:00000229141
 *
 * @author José Jesús Orozco Hernández
 */
public class Cilindro {

    /**
     * Radio del circulo del cilindro
     */
    private double radio;
    /**
     * Altura del cilindro
     */
    private double altura;

    /**
     * Constructor que inicializa los atributos de la clase con respecto a los
     * parametros
     *
     * @param radio Radio del circulo del cilindro
     * @param altura Altura del clindro
     */
    public Cilindro(double radio, double altura) {
        // Permite evaluar si el radio o la altura son negativos
        if (radio < 0.0 || altura < 0.0) {
            throw new ValueException(radio < 0.0 ? "Error: Radio negativo" : "Error: Altura negativa");
        }
        this.radio = radio;
        this.altura = altura;
    }

    /**
     * Determina el area del cilindro
     *
     * @return El area del cilindro
     */
    public double area() {
        return (2*Math.PI*radio*altura)+(2*Math.PI*(radio*radio));
    }

    /**
     * Metodo que determina el volumen de un cilindro
     *
     * @return El volumen del circulo
     */
    public double volumen() {
        return (Math.PI*(radio*radio))*altura;
    }

    /**
     * Regresa una cadena con la representacion de la clase
     *
     * @return Cadena con la representacion de la clase
     */
    @Override
    public String toString() {
        return "Radio:" + radio + ", Altura:" + altura;
    }

}
