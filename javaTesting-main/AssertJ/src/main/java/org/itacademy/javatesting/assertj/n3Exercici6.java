/*Exercici 6. Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. 
 * Creu una asserció que validi que l'excepció és llançada quan correspon. 
 */

package org.itacademy.javatesting.assertj;

public class n3Exercici6 {
	private int[] vector = new int[3];
	
	public n3Exercici6(int[] m) {
		this.vector = m;
	}
	
	public void imprimir(int posicion) {
		try {
			System.out.println(this.vector[posicion]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ERROR: " + ex.getMessage());

		}
	}
	

}
