package org.itacademy.javatesting.junit;

public class n1Exercici2 {
	
	public String Calculo_DNI (int numero) {
		
		int resto = numero % 23;
		String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B",
				           "N","J","Z","S","Q","V","H","L","C","K","E"};
		
		return numero + letra[resto];
	}

	public n1Exercici2() {}

}
