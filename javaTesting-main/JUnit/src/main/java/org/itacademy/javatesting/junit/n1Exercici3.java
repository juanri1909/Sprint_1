package org.itacademy.javatesting.junit;

public class n1Exercici3 {
	
	private int[] vector = new int[3];

	
	public n1Exercici3(int vec[]) {
		this.vector = vec;
	}

	public void Posicion(int p) {
		
		try {
			System.out.println("Posicion dentro del array" + " " + this.vector[p]);
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e + " " + "Posicion fuera del array.");
		}
		
	}
	
}