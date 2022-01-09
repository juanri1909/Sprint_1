/*Exercici 1. Crea una classe anomenada Numero que contingui un objecte Integer que s'inicialitzi amb un valor 
 * comprès entre 0 i 100 utilitzant java.util.Random. Emplena una cua de tipus PriorityQueue amb objectes 
 * d'aquesta classe i extreu els valors utilitzant poll() per a demostrar que s'obté l'ordre desitjat.
 */
package n2Exercici1;

import java.util.*;

public class n2Exercici1 {

	public static void main(String[] args) {
	
		PriorityQueue <Integer> MiCola = new PriorityQueue<Integer>();
		for (int i=0; i<5; i++) {
			Numero valor = new Numero();
			MiCola.add(valor.getNum());
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(MiCola.poll());
		}

	}

}
