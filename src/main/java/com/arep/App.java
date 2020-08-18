package com.arep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.arep.array.ListaEncadenada;
import com.arep.array.Node;
import com.arep.operation.Calculator;

/**
 * Aplicación que lee n valores de un archivo y calcula la media y la desviación estándar
 * redondeado a 2 decimales.
 * 
 * @author SebastianPaez
 *
 */
public class App {
	
	
	
	
	/**
	 * Lee un archivo de números (Este se debe pasar como parametro al momento de ejecutar) y lo guarda en una lista encadenada.
	 * @param filePath Es la dirección donde se encuentra el archivo de números a leer.
	 * @return La lista en cadenada creada a partir de los datos del archivo.
	 */
	public static ListaEncadenada leerArchivo(String filePath) {		
		ListaEncadenada lista = new ListaEncadenada();
		
		try {
			File archivo = new File(filePath);
			Scanner sc = new Scanner(archivo);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				double value = Double.parseDouble(line);
				lista.addRight(new Node(value));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	/**
	 * Clase principal que invoca el metodo que leera el archivo y despues mostrará los resultados en pantalla de los valores obtenidos. 
	 * @param args Son los parametros al momento de ejecutar.
	 */
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println("Este programa calcula la media y la desviación estándar de una lista de números.");
		System.out.println("Recuerde que el archivo debe contener una lista de números a tratar.");
		System.out.println("Pare ejecutar el programa escriba java -cp target/classes com.arep.App seguido del nombre del archivo.");
		ListaEncadenada lista = leerArchivo(args[0]);
		Calculator c = new Calculator(lista);
		System.out.println("La media es: " + c.getMedia());
		System.out.println("La desviacion estandar es: " + c.getDesviacionEstandar());
	}	
}