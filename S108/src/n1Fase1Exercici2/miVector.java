/*
 * Escriu un mètode que retorne una cadena separada per comes basada en una llista 
 * d’Integers. Cada element  hauria d'anar precedit per la  lletra  "e" 
 * si el nombre és parell , i precedit de la lletra  "o" si el nombre és im parell. 
 * Per exemple, si la llista  d'entrada és (3,44), 
 * la  sortida hauria de ser "o3, e44".  Imprimeix el  resultat. 
 */
package n1Fase1Exercici2;

import java.util.ArrayList;

public class miVector {
	
	private ArrayList<Integer> mv;
	
	public miVector(ArrayList<Integer> a) {
		this.mv = a;
	}
	
	public ArrayList<String> Metodo2(ArrayList<Integer> mv) {
		
		ArrayList<String> miArray = new ArrayList<String>();
		
		mv.stream().forEach(i->{if(i % 2==0) {
			miArray.add("e"+Integer.toString(i));
			}
		else {
			miArray.add("o"+Integer.toString(i));
		}
		});
		
		return miArray;
		
	}
}
