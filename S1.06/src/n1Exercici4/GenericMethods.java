/*Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep f() sigui 
 * una llista d'arguments de variable indefinida.
 */


package n1Exercici4;


import java.util.List;

public class GenericMethods{
	
	public GenericMethods() {}
	
	public void f(List<?> ls) {
		
		for (int i=0; i<ls.size(); i++) {
			System.out.println(ls.get(i));
			
		}	       
	    System.out.println();
		
		
	}
	
	

}