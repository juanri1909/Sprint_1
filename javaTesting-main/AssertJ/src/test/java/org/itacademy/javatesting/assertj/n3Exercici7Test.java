/*
 * Exercici 7. Crea un objecte Optional buit. 
 * Escriu l'asserció correcta per a verificar que efectivament està buit.
 */

package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class n3Exercici7Test {
	
	n3Exercici7 Optional = new n3Exercici7();
	
	@Test
	public void prueba() {
		Optional = null;
		assertThat(Optional).isNull();
	}

}
