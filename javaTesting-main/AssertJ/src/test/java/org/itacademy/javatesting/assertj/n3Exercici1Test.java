/*Exercici 1. Una asserció que demostri que el valor de dos objectes sencers és igual, 
 * i una altra que indiqui que no ho és.
 */

package org.itacademy.javatesting.assertj;


import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class n3Exercici1Test {
	
	n3Exercici1 nuevo1 = new n3Exercici1(30,"Juan");
	n3Exercici1 nuevo2 = new n3Exercici1(20,"Pedro");
	n3Exercici1 nuevo3 = new n3Exercici1(30,"Juan");
	
	@Test
	public void comprobacion() {
		
		//Assercio que dos objetos son iguales
		assertThat(nuevo1.getEdad()).isEqualTo(nuevo3.getEdad());
		assertThat(nuevo1.getNombre()).isEqualTo(nuevo3.getNombre());
		
		//Assercio que dos objetos son diferentes
		assertThat(nuevo1.getEdad()).isNotEqualTo(nuevo2.getEdad());
		assertThat(nuevo1.getNombre()).isNotEqualTo(nuevo2.getNombre());
		
		
		
		/*extracting("edad","nombre")
		                  .contains(31,"Juan");*/
		              //.getEdad()).isEqualTo(30);
		             //.isNotEqualTo(nuevo2);
	}

}
