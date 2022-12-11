/*
* ITreeIterator.java
* Creada el 21 de noviembre del 2021 5:30 PM
*/
package interfaces;
import java.util.Iterator;
/**
* Esta interfaz generica establece los métodos para recorrer
* un arbol binario
* Alumno; José Jesús Orozco Hernández ID; 00000229141
* @param <T> Parámetro de tipo para los objetos a almacenarse
* en el arbol
* @author José Jesús
*/
public interface ITreeIterator<T> {
/**
* Obtiene un iterador para recorrer el arbol en orden
*
* @return Un iterador para recorrer el arbol en orden
*/
public Iterator<T> getInorderIterator();
/**
* Obtiene un iterador para recorrer el arbol en preorden
*
* @return Un iterador para recorrer el arbol en preorden
*/
public Iterator<T> getPreorderIterator();
/**
* Obtiene un iterador para recorrer el arbol en postorden
* @return Un iterador para recorrer el arbol en postorden
*/
public Iterator<T> getPostorderIterator();
}