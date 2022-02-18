/*Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep f() sigui 
 * una llista d'arguments de variable indefinida.
 */
package n1Exercici4;

import java.util.Arrays;
import java.util.List;

public class n1Exercici4 {

	public static void main(String[] args) {
		
		GenericMethods nuevo = new GenericMethods();
		
		//List<Integer> li = Arrays.asList(1,2,3);
		//nuevo.f(li);
		List<?> ls = Arrays.asList(123, "Juan",14,"Hola");
		nuevo.f(ls);

	}

}
