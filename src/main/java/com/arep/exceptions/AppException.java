package com.arep.exceptions;

/**
 * Excepción propia de la aplicación para controlar algunas operaciones 
 * @author SebastianPaez
 */
public class AppException extends RuntimeException {
	
	public static final String IMPORTAR_ERROR = "Error al importar";
	public static final String LISTA_VACIA = "Error, la lista está vacia!";
	public static final String FUERA_RANGO = "Error, el índice que se busca excede los límites de la lista.";
	public static final String POP_VACIO = "Error, no se puede eliminar ya que la lista esta vacia.";
	
	public AppException(String message){
		super(message);
    }
	
	
	
}
