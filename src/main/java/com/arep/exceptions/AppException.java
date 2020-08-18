package com.arep.exceptions;

/**
 * Excepci�n propia de la aplicaci�n para controlar algunas operaciones 
 * @author SebastianPaez
 */
public class AppException extends RuntimeException {
	
	public static final String IMPORTAR_ERROR = "Error al importar";
	public static final String LISTA_VACIA = "Error, la lista est� vacia!";
	public static final String FUERA_RANGO = "Error, el �ndice que se busca excede los l�mites de la lista.";
	public static final String POP_VACIO = "Error, no se puede eliminar ya que la lista esta vacia.";
	
	public AppException(String message){
		super(message);
    }
	
	
	
}
