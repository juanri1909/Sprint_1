/*
 * Exercici 5. Crea y rellena un objeto List<Integer>. Crea y rellena un segundo objeto List<Integer> 
 * del mismo tamaño que el primero. Utiliza sendos objetos ListIterator para leer los elementos de 
 * la primera lista e insertarlos en la segunda en orden inverso (pruebe a explorar diversas formas 
 * diferentes de resolver este problema).
 * 1º.- Creamos dos listas de numeros del mismo tamaño.
 * 2º.- Leer los elementos de la 1º lista y los insertamos al final en orden inverso.
 */
package n1Exercici5;
import java.util.*;
public class n1Exercici5 {
	
	public static ArrayList<Integer> metodo1(ArrayList<Integer>a, ArrayList<Integer>b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		Collections.reverse(a);
		b.addAll(a);
		c=b;
		return c;
	}
	
	public static ArrayList<Integer> metodo2(ArrayList<Integer>a, ArrayList<Integer>b) {
		/*1º Metemos el arrayList en una lista.
		 * 2º Recorremos la lista por el final y vamos anadiendolo en un Arraylist_A
		 * 3º Vamos al ArrayList_B y lo concatemanos con el ArrayList_A
		 */
		ArrayList<Integer> c = new ArrayList<Integer>();
		int contenedor[]= new int[a.size()];
		int i=0;
		// Get the iterator
	    Iterator<Integer> it = a.iterator();
	    while(it.hasNext()) {//Punto 1º
	    	contenedor[i]=it.next();
	    	i++;
	   	}
	    i=0;
	    for (int j=contenedor.length-1; j>=0; j--) {//Punto 2º
	    	c.add(i,contenedor[j]);
	    	i++;
	    }
	    //3º Punto.
	    i=0;
	    int tamano= b.size();
	    int maximo= b.size();
	  
	    for (int j = tamano; j<maximo; j++) {
	    	b.add(j, c.get(i));
	    	i++;
	    }
		
		return b;
	}

	public static void main(String[] args) {
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		ArrayList<Integer> L2 = new ArrayList<Integer>();
	
		int a[]= {10,9,8,7,6};
		int b[]= {1,2,3,4,5};
		
		for (int i=0; i<a.length; i++) {
			L1.add(i, a[i]);
			L2.add(i, b[i]);
		}
		System.out.println(L1 +" " + L2);
				
		System.out.println(metodo1(L1,L2));
		System.out.println(metodo2(L1,L2));
		

	}

}
