/*
 * Has de fer el mateix que en el punt anterior,  però retornant una llista que  
 * incloga els elements amb  més de 5 lletres. Imprimeix  el  resultat. 
 */

package n1Fase1Exercici4;

import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		ArrayList<String> miLista = new ArrayList<String>();
		miLista.add("holas");
		miLista.add("Buenos dias");
		miLista.add("Mi nombre es Juan");
		
		Palabras p1 = new Palabras(miLista);
		p1.miFuncion().stream().forEach(c->System.out.println(c));
	
	}

}
