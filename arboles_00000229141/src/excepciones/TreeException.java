/*
* TreeException.java
* Creada el 21 de noviembre del 2021 5:30 PM
*/
package excepciones;
/**
* Esta clase implementa la excepción lanzada por los metodos de la
* clase que implementa la interfaz ITree.
* Alumno; José Jesús Orozco Hernández ID; 00000229141
* @author José Jesús Orozco Hernández
*/
public class TreeException extends RuntimeException {
/**
* Constructor por omision
*/
public TreeException() {
super();
}
/**
* Constructor que establece un mensaje en la excepcion
* @param msj Mensaje para la excepcion
*/
public TreeException(String msj) {
super(msj);
}
}