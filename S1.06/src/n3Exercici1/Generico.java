/*
 *Crea un método genérico que tome como argumento un contenedor Escuela<List<?>>. 
 */

package n3Exercici1;

import java.util.List;

public class Generico {
	
	public  void metodoGenerico(Escuela<List<?>> t) {
		for(int i=0; i<t.getnombre().size();i++)
			System.out.println(t.getnombre().get(i));		
		
	}
	
	public void metodoGenerico2(List<Escuela<?>> t) {
		for (int i=0; i<t.size(); i++)
		System.out.println(t.get(i).getnombre());
	}
}
