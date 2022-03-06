/*
 * Teniendo una lista de Strings, escribe un método que devuelva una lista 
 * de todas las cadenas que contengan la letra ‘o’ e imprime el resultado .
 */
package n1Fase1Exercici3;

import java.util.ArrayList;

public class n1Fase1Exercici3 {

	public static void main(String[] args) {
		
		ArrayList<String> miLista = new ArrayList<String>();
		miLista.add("hola");
		miLista.add("Buenas dias");
		miLista.add("Mi nombre es Juan");
		
		Palabras p1 = new Palabras(miLista);
		p1.miFuncion().stream().forEach(c->System.out.println(c));
		
		
	}

}
