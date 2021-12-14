/*
 * Exercici 6. Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator, 
 * afegeixi valors sencers a la llista inserint-los sempre a la meitat d'aquesta.
 * 1º.- Creamos una LinkedList vacia.
 * 2º.- Y vamos añadiendo elementos apartir de forma normal, hasta que la lista tenga 2 elmentos.	
 * 3º.- Si la lista tiene 2 elementos/2 y el cociente nos indica en que posicion vamos a meter el elmento.
 */
package n3Exercici6;
import java.util.*;
public class n3Exercici6 {

	public static void main(String[] args) {
		LinkedList<Integer> MiLinkedList = new LinkedList<Integer>();
		ArrayList al = new ArrayList();
		
		int posicion=0;
		int a[] = {1,2,3,4,5,6,8,9,10};
		for (int i=0; i<a.length ;i++) {
			al.add(i, a[i]);
		}
		
		ListIterator<Integer> it = al.listIterator();
		while(it.hasNext()) {
			if(posicion<2) {
				MiLinkedList.add(posicion, it.next());
			}
			else {
				MiLinkedList.add(posicion/2, it.next());
			}
			posicion++;
		}
		
	System.out.println(MiLinkedList);			
	}
}


