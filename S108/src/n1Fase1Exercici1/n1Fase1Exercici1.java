/*
 * Tenint una llista de cadenes de noms propis,  escriu un mètode que retorn en 
 * una llista de totes les cadenes que  comencen amb la lletra 'a' (mayuscula ) i  
 * tenen exactament 3  lletres. Imprimeix el resultat . 
 */
package n1Fase1Exercici1;

import java.util.ArrayList;

public class n1Fase1Exercici1 {

	public static void main(String[] args) {
		
		Alumno al = new Alumno(); 
		ArrayList<String> miLista = new ArrayList<String>();
		
		miLista.add("Ana");
		miLista.add("Juan");
		miLista.add("Andrea");
		miLista.add("Pedro");
		miLista.add("Ani");

		al.miFuncion(miLista).forEach(c->System.out.println(c));;
		
		
	
		

	}

}

