/*
 * Exercici 6. Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. 
 * Creu una asserció que validi que l'excepció és llançada quan correspon.
 */

package org.itacademy.javatesting.assertj;


import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class n3Exercici6Test {
	
	private int[] intArray = new int[] {1,2,3};
	
	@Test

	public void testException() {
		
		n3Exercici6 array1 = new n3Exercici6(intArray);
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {array1.imprimir(2);});
				
	}

}
