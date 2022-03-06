/*
 * Has de  fer la mateixa impressió del punt  anterior  
 * però fent-ho mitjançant method   reference.  
 */

package n1Fase1Exercici6;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void procesar(String info) {
		System.out.println(info);
	}

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
						
		meses.forEach(Principal::procesar);

	}

}
