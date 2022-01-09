/*
 * Exercici 8. Emplena un mapa LinkedHashMap amb claus de tipus String i objectes del tipus que prefereixi. 
 * Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) i torni a inserir-les en el mapa. I
 * dea: Fes servir un ArrayList per realitzar l'ordenació amb la classe Comparator.  
 * 
 * 1º.- Construimos un LinKedHashMap<String, Integer>
 * 2º.- Rellenamos con diferentes valores.
 * 3º.- Extraemos las parejas de clave y valor y las metemos en un ArraList.
 * 4º.- Ordenamos el ArraList sobreescribiendo el metodo "compare"
 */

package n1Exercici8;

import java.util.*;


public class n1Exercici8 {
		

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> LHM  = new LinkedHashMap<>();
		LHM.put("Juan", 54);
		LHM.put("Rios", 52);
		LHM.put("Garcia", 11);
		LHM.put("Perez", 8);

		// create the ArrayList object
        ArrayList<Shop> s = new ArrayList<Shop>();
		for (String n : LHM.keySet()) {
            int a = LHM.get(n);
            s.add(new Shop(n,a));           
       }
	    Collections.sort(s, new StockComparator());
		for (Shop shop : s) {
            System.out.println(shop.name + " " + shop.age);
        }
	}

}
