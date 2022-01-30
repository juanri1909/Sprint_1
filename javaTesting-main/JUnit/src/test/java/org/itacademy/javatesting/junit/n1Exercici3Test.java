/*Exercici 3. Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. 
 * Verifica el seu correcte funcionament amb un test jUnit.
 * 
 */
package org.itacademy.javatesting.junit;

import org.junit.jupiter.api.Test;


class n1Exercici3Test {
	
	int[] Array = {1,2,3};
	
	
	@Test
	void test() {
		n1Exercici3 Array1 = new n1Exercici3(Array);
		Array1.Posicion(3);;
	}

}
