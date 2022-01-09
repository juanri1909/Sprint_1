/*Exercici 1. Crea una classe anomenada Contenidora que encapsuli un array d'objectes String. 
 * Defineix un mètode add que només permeti afegir cadenes de caràcters. 
 * Si l'array no és prou gran per a la següent inserció, el contenidor ha de redimensionar automàticament 
 * aquest array. Al main(), compara el rendiment d'aquest contenidor amb el d'un ArrayList<String>. 
 * Idea: Per a la proves de rendiment, es pot fer servir la api System.nanoTime(), que permet calcular el temps 
 * utilitzat en les operacions descrites per a l'un o l'altre contenidor. 
 */

package n3Exercici1;

import java.util.*;

public class n3Exercici1 {

	public static void main(String[] args) {
		
		long inicio, fin, resultado;
		
		inicio =System.nanoTime();

		ArrayList<String> l = new ArrayList<String>();
		l.add("j");
		l.add("u");
		l.add("a");
		l.add("n");
		
		fin = System.nanoTime();
		
		resultado= fin - inicio;
		
		System.out.println("EL TIEMPO DE ARRAYLIST ES: " + resultado);
				
		inicio = System.nanoTime();
		
		Contenidora c = new Contenidora();
		c.add("j");
		c.add("u");
		c.add("a");
		c.add("n");
		
		fin = System.nanoTime();
		
		resultado= fin - inicio;
		
		System.out.println("EL TIEMPO DE CONTENIDORA ES: " + resultado);
		
		//c.Imprimir();
		
		

	}

}
