/*
 * Escriu un mètode que retorne una cadena separada per comes basada en una llista 
 * d’Integers. Cada element  hauria d'anar precedit per la  lletra  "e" 
 * si el nombre és parell , i precedit de la lletra  "o" si el nombre és im parell. 
 * Per exemple, si la llista  d'entrada és (3,44), 
 * la  sortida hauria de ser "o3, e44".  Imprimeix el  resultat. 
 */

package n1Fase1Exercici2;

import java.util.ArrayList;

public class n1Fase1Exercici2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> n1 = new ArrayList<Integer>();
		for (int i=1; i<11; i++) n1.add(i);
		
		miVector mv1 = new miVector(n1);
		System.out.print(mv1.Metodo2(n1));
		
		

}
}
