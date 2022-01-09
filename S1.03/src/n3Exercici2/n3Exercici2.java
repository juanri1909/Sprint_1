/*Exercici 2. Repeteix l'exercici anterior per a un contenidor que encapsuli un array 
 * d'enters (per exemple anomenat Numeros) amb un mètode add(). 
 * Compara el seu rendiment amb el d'un ArrayList<Integer>. 
 * En la comparació de rendiment, inclou el procés d'incrementar cada objecte al contenidor. 
 */

package n3Exercici2;

import java.util.ArrayList;

public class n3Exercici2 {

	public static void main(String[] args) {
		
		long inicio=0, fin=0, resultado=0;
		
		inicio =System.nanoTime();

		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<10000; i++) {
			l.add(i);
		}
		
		fin = System.nanoTime();
		
		resultado= fin - inicio;
		
		System.out.println("EL TIEMPO DE ARRAYLIST ES: " + resultado);
				
		inicio = System.nanoTime();
		
		Contenidora c = new Contenidora();
		for(int i=0; i<10000; i++) {
			c.add(i);
		}
		
		fin = System.nanoTime();
		
		resultado= fin - inicio;
		
		System.out.println("EL TIEMPO DE CONTENIDORA ES: " + resultado);
		
	}

}
