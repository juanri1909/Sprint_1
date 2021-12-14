/*Exercici 3. Crea una classe anomenada Generadora que retorni noms de 
personatges (com String) de la seva pel·lícula favorita cada que vegada 
que invoqui al mètode 'seguentPersonatge()', i que torni al principi de la
 llista de personatges una vegada que hagi acabat amb tots els noms. 
 Utilitzi aquest generador per a emplenar un ArrayList, un LinkedList,
 un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per pantalla
 cada contenidor.
 
 1º.- Creamos una lista con nombre de personajes.
 2º.- Los metemos en las distinas colecciones.
 3º.- LLamams al metodo "SeguientePersonaje" para imprimirlo
 */


package n3Exercici3;

import java.util.*;

public class n3Exercici3 {

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
		g.SiguientePersonaje(MiArrayLista);
		g.SiguientePersonaje(MiLinKedList);
		g.SiguientePersonaje(MiHashSet);
		g.SiguientePersonaje(MiLinkedHashSet);
		g.SiguientePersonaje(MiTreeSet);

	}

}
