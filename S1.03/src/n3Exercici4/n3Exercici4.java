/*Exercici 4. Escriu un ḿetode que utilitzi un iterador per a recórrer 
 una col·lecció genèrica passada per argument i imprimeixi tots els 
 seus objectes (fent servir el mètode toString()). 
 Empleni tots els diferents tipus de Java Collections (ArrayList, 
 LinkedList, HashSet, LinkedHashSet i TreeSet), amb una sèrie d'objectes 
 i apliqui el mètode dissenyat a cada Contenidor.
 1º.- Creamos un array de nombres.
 2º.- Añadimos el array a cada una de las colecciones.
 3º.- Creamos un metodo "toString(Coleccion)" que los imprima utilizando iterador.
 */

package n3Exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class n3Exercici4 {

	public static void main(String[] args) {
		String [] personajes = {"Juan", "Ursula", "Martina", "Carlota"};
		ArrayList MiArrayLista = new ArrayList();
		LinkedList MiLinKedList = new LinkedList();
		HashSet MiHashSet = new HashSet();
		LinkedHashSet MiLinkedHashSet = new LinkedHashSet();
		TreeSet MiTreeSet = new TreeSet();
		
		for (int i=0; i<personajes.length; i++) {
			MiArrayLista.add(i, personajes[i]);
			MiLinKedList.add(i, personajes[i]);
			MiHashSet.add(personajes[i]);
			MiLinkedHashSet.add(personajes[i]);
			MiTreeSet.add(personajes[i]);
		}
		
		Generadora g = new Generadora();
		g.toString(MiArrayLista);
		g.toString(MiTreeSet);
		g.toString(MiHashSet);
		g.toString(MiLinkedHashSet);
		g.toString(MiLinKedList);

	}

}
