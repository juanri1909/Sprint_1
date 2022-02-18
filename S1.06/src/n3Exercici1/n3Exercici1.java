/*
 *Determina qué métodos puede o no invocar para el contenedor Escuela 
 *y para la lista List. 
*/


package n3Exercici1;

import java.util.ArrayList;
import java.util.List;

public class n3Exercici1 {

	public static void main(String[] args) {
		
		List<String> miLista = new ArrayList<String>();
		miLista.add("Juan");
		miLista.add("Ana");
		miLista.add("Pedro");
		
		Escuela<List<?>> nuevo = new Escuela<List<?>>();
		nuevo.setnombre(miLista);
		
		
		Generico miGenerico = new Generico();
		miGenerico.metodoGenerico(nuevo);
		
		System.out.println("");
		
	//-------------------------------------
	    Escuela<String> a = new Escuela<String>();
	    Escuela<String> b = new Escuela<String>();
	    Escuela<String> c = new Escuela<String>();
	    a.setnombre("Pedro");
	    b.setnombre("Ana");
	    c.setnombre("Juan");
	    
	    
	    List<Escuela<?>> miLista2 = new ArrayList<Escuela<?>>();
		miLista2.add(a);
		miLista2.add(b);
		miLista2.add(c);
		Generico miGenerico2 = new Generico();
		miGenerico2.metodoGenerico2(miLista2);

	}

}
