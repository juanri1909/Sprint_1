/*
 * Crea una llista amb  els nombs dels mesos de  l’any. 
 * Imprimeix tots els  elements de la llista amb  una lambda. 
 */

package n1Fase1Exercici5;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> meses = new ArrayList<String>();
		
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		meses.add("julio");
		meses.add("agosto");
		meses.add("septiembre");
		meses.add("octubre");
		meses.add("noviembre");
		meses.add("diciembre");
						
		meses.stream().forEach(c->System.out.println(c));
		
		

	}

}
