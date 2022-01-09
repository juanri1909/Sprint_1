/*Exercici 3. Crea una classe anomenada Generadora que retorni noms de 
personatges (com String) de la seva pel·lícula favorita cada que vegada 
que invoqui al mètode 'seguentPersonatge()', i que torni al principi de la
 llista de personatges una vegada que hagi acabat amb tots els noms. 
 Utilitzi aquest generador per a emplenar un ArrayList, un LinkedList,
 un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per pantalla
 cada contenidor.
 
 */


package n1Exercici3;

import java.util.*;

public class n3Exercici3 {

	public static void main(String[] args) {
		String [] personajes = {"A. Schwarzenegger", "Linda Hamilton", "Michael Biel", "Carlota"};
		String peliculaFavorita = "TERMINATOR";
		
		Generadora g = new Generadora(personajes, peliculaFavorita);
		ArrayList <String> MiArrayLista = new ArrayList<String>();
		
		for (int i=0; i<g.SiguientePersonaje(peliculaFavorita).length; i++) {
			MiArrayLista.add(i, g.SiguientePersonaje(peliculaFavorita)[i]);
		}
		
		LinkedList <String> MiLinKedList = new LinkedList<String>();
		for (int i=0; i<g.SiguientePersonaje(peliculaFavorita).length; i++) {
			MiLinKedList.add(g.SiguientePersonaje(peliculaFavorita)[i]);
		}
		
		HashSet <String> MiHashSet = new HashSet<String>();
		for (int i=0; i<g.SiguientePersonaje(peliculaFavorita).length; i++) {
			MiHashSet.add(g.SiguientePersonaje(peliculaFavorita)[i]);
		}
		
		LinkedHashSet <String> MiLinkedHashSet = new LinkedHashSet<String>();
		for (int i=0; i<g.SiguientePersonaje(peliculaFavorita).length; i++) {
			MiLinkedHashSet.add(g.SiguientePersonaje(peliculaFavorita)[i]);
		}
		
		TreeSet <String>MiTreeSet = new TreeSet<String>();
		for (int i=0; i<g.SiguientePersonaje(peliculaFavorita).length; i++) {
			MiTreeSet.add(g.SiguientePersonaje(peliculaFavorita)[i]);
		}
		
		System.out.println(MiArrayLista);
		System.out.println(MiLinKedList);
		System.out.println(MiHashSet);
		System.out.println(MiLinkedHashSet);
		System.out.println(MiTreeSet);
	}

}
