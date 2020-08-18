package com.arep.operation;

import com.arep.array.ListaEncadenada;

/**
 * Clase Calculator la cual realiza las operaciones estadísticas correspondientes
 * @author SebastianPaez
 *
 */
public class Calculator {
	
	private ListaEncadenada lista;
	private double media = 0;
	
	
	/**
	 * Contructor Calculator 
	 * @param lista Es la lista encadenada propia para realizar las operaciones correspondientes
	 */
	public Calculator (ListaEncadenada lista) {
		this.lista = lista;
		
	}
	
	
	/**
	 * Retorna la media o promedio de los datos contenidos en la lista encadena.
	 * @return resF Que es la media o promedio de los datos.
	 */
	public double getMedia() {
		double res = 0;
		if (media != 0) res = media;  
		else {
			double sum = 0;
			for (int i = 0; i < lista.size(); i++) {
				sum += lista.get(i).getValue();
			}		
			res = sum / lista.size();
		}
		
		double resF = Math.round(res * 100.0) / 100.0;
		return resF;
	}
	
	/**
	 * Retorna la desviación estándar de los datos contenidos en la lista encadena.
	 * @return resF Que es la desviación estándar de los datos.
	 */
	public double getDesviacionEstandar() {
		double promedio = getMedia();
		double sum = 0;
		for (int i = 0; i < lista.size(); i++) {
			sum += Math.pow((lista.get(i).getValue() - promedio), 2);
		}
		double res = Math.pow((sum / (lista.size() - 1)), 0.5);
		double resF = Math.round(res * 100.0) / 100.0;
		return resF;
	}
	
}
