package com.arep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

import com.arep.array.ListaEncadenada;
import com.arep.array.Node;
import com.arep.operation.Calculator;

/**
 * Clase que realiza varias pruebas de los calculos estadísticos solicitados.
 * @author SebastianPaez
 *
 */
public class AppTest {
	
	public static final double MAXERROR = 0.00000000000001;
	ListaEncadenada lista = new ListaEncadenada();
	double[] caso1 = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
	double[] caso2 = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
	double[] caso3 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	double[] caso4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	double[] caso5 = {1.7, 2.1, 3.4, 4.8, 5.9, 6.2, 7.1, 8.0, 9.5, 10.15};
	double[] caso6 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.10};
	double[] caso7 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
	double[] caso8 = {1, 1.5, 3.5, 4.6, 2.5, 3.6, 4.6, 1.5, 4.6, 20};
	double[] caso9 = {17, 22, 34, 46, 58, 60, 75, 88, 93, 109};
	double[] caso10 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 101};
		
    
	
	
	/**
	 * Lee el archivo de prueba de números 1 (10 números), calcula la media y desviación estándar y compara son iguales al valor esperado.
	 */
	@Test
	public void shouldBeReadFileAndCompreListOne() {
		double resultadoEsperadoMedia = 550.6;
		double resultadoEsperadoDesviacion = 572.03;
		ListaEncadenada listFileOne = App.leerArchivo("Pruebas/Lista_Numeros_1.txt");
		Calculator c = new Calculator(listFileOne);
		assertEquals(c.getMedia(), resultadoEsperadoMedia, MAXERROR);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperadoDesviacion, MAXERROR);
	}
	
	/**
	 * Lee el archivo de prueba de números 2 (10 números), calcula la media y desviación estándar y compara son iguales al valor esperado.
	 */
	@Test
	public void shouldBeReadFileAndCompreListTwo() {
		double resultadoEsperadoMedia = 60.32;
		double resultadoEsperadoDesviacion = 62.26;
		ListaEncadenada listFileTwo = App.leerArchivo("Pruebas/Lista_Numeros_2.txt");
		Calculator c = new Calculator(listFileTwo);
		assertEquals(c.getMedia(), resultadoEsperadoMedia, MAXERROR);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperadoDesviacion, MAXERROR);
	}
	
	/**
	 * Lee el archivo de prueba de números 3 (50 números), calcula la media y desviación estándar y compara son iguales al valor esperado.
	 */
	@Test
	public void shouldBeReadFileAndCompreListThree() {
		double resultadoEsperadoMedia = 52.41;
		double resultadoEsperadoDesviacion = 27.97;
		ListaEncadenada listFileThree = App.leerArchivo("Pruebas/Lista_Numeros_3.txt");
		Calculator c = new Calculator(listFileThree);
		assertEquals(c.getMedia(), resultadoEsperadoMedia, MAXERROR);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperadoDesviacion, MAXERROR);
	}
	
	/**
	 * Lee el archivo de prueba de números 4 (100 números), calcula la media y desviación estándar y compara son iguales al valor esperado.
	 */
	@Test
	public void shouldBeReadFileAndCompreListFour() {
		double resultadoEsperadoMedia = 292.60;
		double resultadoEsperadoDesviacion = 113.35;
		ListaEncadenada listFileFour = App.leerArchivo("Pruebas/Lista_Numeros_4.txt");
		Calculator c = new Calculator(listFileFour);
		assertEquals(c.getMedia(), resultadoEsperadoMedia, MAXERROR);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperadoDesviacion, MAXERROR);
	}
	
	/**
	 * Lee el archivo de prueba de números 5 (500 números), calcula la media y desviación estándar y compara son iguales al valor esperado.
	 */
	@Test
	public void shouldBeReadFileAndCompreListFive() {
		double resultadoEsperadoMedia = 511.15;
		double resultadoEsperadoDesviacion = 285.92;
		ListaEncadenada listFileFive = App.leerArchivo("Pruebas/Lista_Numeros_5.txt");
		Calculator c = new Calculator(listFileFive);
		assertEquals(c.getMedia(), resultadoEsperadoMedia, MAXERROR);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperadoDesviacion, MAXERROR);
	}
	
	
	/**
	 * Llena la lista encadenada con los valores dados en una lista de numeros decimales. 
	 * @param listaDoubles Es la lista de valores que queremos que tenga nuestra lista encadenada.
	 */
    public void llenarLista(double[] listaDoubles) {
    	lista = new ListaEncadenada();
    	for (int i = 0; i < listaDoubles.length; i++) {
    		double value = listaDoubles[i];
    		lista.addRight(new Node(value));
    	}
    }
    
    /**
     * Prueba que la media calculada por la aplicación es 550.6 con los valores del caso 1.
     */
	@Test
	public void shouldCalculateMeanCorrectlyCase1() {
		double resultadoEsperado = 550.6;
		llenarLista(caso1);
		Calculator c = new Calculator(lista);
		assertEquals(c.getMedia(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la media calculada con los valores del caso 1 es correcta ya que falla cuando se compara con un valor aleatorio como 103586.6.
     */
	@Test
	public void shouldNotCalculateMeanCorrectlyCase1() {
		double resultadoErroneo = 103586.6;
		llenarLista(caso1);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getMedia(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada por la aplicación es 572.03 con los valores del caso 1.
     */
	@Test
	public void shouldCalculateStandardDeviationCorrectlyCase1() {
		double resultadoEsperado = 572.03;
		llenarLista(caso1);
		Calculator c = new Calculator(lista);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada con los valores del caso 1 es correcta ya que falla cuando 
     * se compara con un valor aleatorio como 5042.2.
     */
	@Test
	public void shouldNotCalculateStandardDeviationCorrectlyCase1() {
		double resultadoErroneo = 5042.2;
		llenarLista(caso1);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getDesviacionEstandar(), resultadoErroneo, MAXERROR);
	}
	
	
	/**
     * Prueba que la media calculada por la aplicación es 60.32 con los valores del caso 2.
     */
	@Test
	public void shouldCalculateMeanCorrectlyCase2() {
		double resultadoEsperado = 60.32;
		llenarLista(caso2);
		Calculator c = new Calculator(lista);
		assertEquals(c.getMedia(), resultadoEsperado, MAXERROR);
	}
	
	
	/**
     * Prueba que la media calculada con los valores del caso 2 es correcta ya que falla cuando se compara con un valor aleatorio como 2364.6.
     */
	@Test
	public void shouldNotCalculateMeanCorrectlyCase2() {
		double resultadoErroneo = 2364.6;
		llenarLista(caso2);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getMedia(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada por la aplicación es 62.26 con los valores del caso 2.
     */
	@Test
	public void shouldCalculateStandardDeviationCorrectlyCase2() {
		double resultadoEsperado = 62.26;
		llenarLista(caso2);
		Calculator c = new Calculator(lista);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada con los valores del caso 2 es correcta ya que falla cuando 
     * se compara con un valor aleatorio como 3633.2.
     */
	@Test
	public void shouldNotCalculateStandardDeviationCorrectlyCase2() {
		double resultadoErroneo = 3633.2;
		llenarLista(caso2);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getDesviacionEstandar(), resultadoErroneo, MAXERROR);
	}
	
	
	/**
     * Prueba que la media calculada por la aplicación es 1 con los valores del caso 3.
     */
	@Test
	public void shouldCalculateMeanCorrectlyCase3() {
		double resultadoEsperado = 1;
		llenarLista(caso3);
		Calculator c = new Calculator(lista);
		assertEquals(c.getMedia(), resultadoEsperado, MAXERROR);
	}
	
	
	/**
     * Prueba que la media calculada con los valores del caso 3 es correcta ya que falla cuando se compara con un valor aleatorio como 1.645634.
     */
	@Test
	public void shouldNotCalculateMeanCorrectlyCase3() {
		double resultadoErroneo = 1.645634;
		llenarLista(caso3);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getMedia(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada por la aplicación es 0.0 (ya que no hay datos diferentes) con los valores del caso 3.
     */
	@Test
	public void shouldCalculateStandardDeviationCorrectlyCase3() {
		double resultadoEsperado = 0.0;
		llenarLista(caso3);
		Calculator c = new Calculator(lista);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada con los valores del caso 3 es correcta ya que falla cuando 
     * se compara con un valor aleatorio como 0.54654658.
     */
	@Test
	public void shouldNotCalculateStandardDeviationCorrectlyCase3() {
		double resultadoErroneo = 0.54654658;
		llenarLista(caso3);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getDesviacionEstandar(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la media calculada por la aplicación es 5.5 con los valores del caso 4.
     */
	@Test
	public void shouldCalculateMeanCorrectlyCase4() {
		double resultadoEsperado = 5.5;
		llenarLista(caso4);
		Calculator c = new Calculator(lista);
		assertEquals(c.getMedia(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la media calculada con los valores del caso 4 es correcta ya que falla cuando se compara con un valor aleatorio como 2.55734.
     */
	@Test
	public void shouldNotCalculateMeanCorrectlyCase4() {
		double resultadoErroneo = 2.55734;
		llenarLista(caso4);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getMedia(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada por la aplicación es 3.03 con los valores del caso 4.
     */
	@Test
	public void shouldCalculateStandardDeviationCorrectlyCase4() {
		double resultadoEsperado = 3.03;
		llenarLista(caso4);
		Calculator c = new Calculator(lista);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada con los valores del caso 4 es correcta ya que falla cuando 
     * se compara con un valor aleatorio como 0.548.
     */
	@Test
	public void shouldNotCalculateStandardDeviationCorrectlyCase4() {
		double resultadoErroneo = 0.548;
		llenarLista(caso4);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getDesviacionEstandar(), resultadoErroneo, MAXERROR);
	}
	
	/**
     * Prueba que la media calculada por la aplicación es 5.89 con los valores del caso 5.
     */
	@Test
	public void shouldCalculateMeanCorrectlyCase5() {
		double resultadoEsperado = 5.89;
		llenarLista(caso5);
		Calculator c = new Calculator(lista);
		assertEquals(c.getMedia(), resultadoEsperado, MAXERROR);
	}
	
	
	/**
     * Prueba que la media calculada con los valores del caso 5 es correcta ya que falla cuando se compara con un valor aleatorio como 6.45.
     */
	@Test
	public void shouldNotCalculateMeanCorrectlyCase5() {
		double resultadoErroneo = 6.45;
		llenarLista(caso5);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getMedia(), resultadoErroneo, MAXERROR);
	}
	
	
	/**
     * Prueba que la desviación estándar calculada por la aplicación es 2.92 con los valores del caso 5.
     */
	@Test
	public void shouldCalculateStandardDeviationCorrectlyCase5() {
		double resultadoEsperado = 2.92;
		llenarLista(caso5);
		Calculator c = new Calculator(lista);
		assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
	}
	
	/**
     * Prueba que la desviación estándar calculada con los valores del caso 5 es correcta ya que falla cuando 
     * se compara con un valor aleatorio como 5.26.
     */
	@Test
	public void shouldNotCalculateStandardDeviationCorrectlyCase5() {
		double resultadoErroneo = 5.26;
		llenarLista(caso5);
		Calculator c = new Calculator(lista);
		assertNotEquals(c.getDesviacionEstandar(), resultadoErroneo, MAXERROR);
	}
}
