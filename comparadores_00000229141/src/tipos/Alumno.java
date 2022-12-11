/*
 * Alumno.java
 * Creada el 4 de noviembre del 2021 a las 10:41 AM
 */
package tipos;

import java.util.Objects;

/**
 * Esta clase representa un alumno.
 * ALumno; Josè Jesùs Orozco Hernàndez ID; 00000229141
 * @author Josè Jesùs 
 */
public class Alumno {

    private Integer id;
    private String nombre;

    /**
     * Inicializa los atributos de la clase al valor de sus parametros
     *
     * @param id Id del alumno
     * @param nombre Nombre del alumno
     */
    public Alumno(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Regresa el Id del alumno
     *
     * @return El Id del alumno
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el Id del alumno
     *
     * @param id l Id del alumno
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Regresa el nombre del alumno
     *
     * @return El nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno
     *
     * @param nombre El nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el codigo hash para una instancia de la clase
     *
     * @return El codigo hash para una instancia de la clase
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara por igualdad una instancia de esta clase con el objeto de su
     * parametro
     *
     * @param obj Objeto con el que se compara una instancia de esta clase
     * @return true si una instancia de esta clase tiene el mismo id que el
     * objeto de su parametro, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Regresa una cadena con una representacion de una instancia de la clase
     *
     * @return Una cadena con una representacion de una instancia de la clase
     */
    @Override
    public String toString() {
        return "(" + id + ", " + nombre + ")";
    }
}
