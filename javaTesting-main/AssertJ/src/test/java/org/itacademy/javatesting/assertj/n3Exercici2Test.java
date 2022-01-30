/*Exercici 2. Una asserció que demostri que la referència a un objecte és la mateixa 
 * que una altra, i una altra que indiqui que és diferent.
 * 
 * 
 */

package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class n3Exercici2Test {
	
	n3Exercici2 nuevo1 = new n3Exercici2(30,"Juan");
	n3Exercici2 nuevo2 = new n3Exercici2(30,"Juan");
	n3Exercici2 nuevo3 = new n3Exercici2(30,"Juan");
	
	@Test
	public void comprobacion() {
		
		nuevo1 = nuevo2;//Asisgnamos la misma direccion de memoria
		assertThat(nuevo1).isEqualTo(nuevo2);
		
		assertThat(nuevo1).isNotEqualTo(nuevo3);
		
	}
}
		
