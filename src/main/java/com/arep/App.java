package com.arep;


import static spark.Spark.*;

import com.arep.array.ListaEncadenada;
import com.arep.operation.Calculator;
import com.arep.read.ReadFile;

/**
 * Aplicaci�n que lee n valores de un archivo y calcula la media y la desviaci�n est�ndar
 * redondeado a 2 decimales, respondiendo con peticiones http usando SPARK.
 * 
 * @author SebastianPaez
 *
 */
public class App {
	
	
	/**
	 * Ejecuta la aplicaci�n para poder utilizar los servicios
	 * @param args Son los parametros al momento de ejecutar.
	 */
	public static void main(String[] args) {
		port(getPort());
		staticFiles.location("/public");
		post("/operation", (request, response) -> {
			ListaEncadenada lista = ReadFile.jsonToList(request.body());
			Calculator c = new Calculator(lista);
			return "{\"media\":" + c.getMedia() + ", \"desviacion\":" + c.getDesviacionEstandar() + "}";
		});
	}
	
	/**
	 * Funcion que retorna el n�mero del puerto por el cual se correr� el servicio.
	 * @return El n�mero de puerto del servicio.
	 */
	static int getPort() {
		 if (System.getenv("PORT") != null) {
			 return Integer.parseInt(System.getenv("PORT"));
		 }
		 	return 4567;
	}
	
}