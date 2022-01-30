/*
 * Exercici 1. Crea una classe Java que insereixi en una llista ordenada els noms dels mesos 
 * de l'any. Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en 
 * la seva posició 8 conté el nom 'Agost'.
 */
package org.itacademy.javatesting.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class n1Exercici1Test {
	
	private String[] array = {"enero","febrero","marzo","abril","mayo","junio","julio",
			                  "agosto","septiembre","octubre","noviembre","diciembre"};

	private n1Exercici1 mesesTest = new n1Exercici1(array);
	

	@Test
	public void numeroMesesTest() {
		
		//mesesTest = null;
		assertAll("FALLO...", () -> assertEquals(12,mesesTest.getMeses().length, () -> "tamaño incorrecto"),
				() -> assertNotNull("Lista vacia", mesesTest.getMeses()), 
				() ->assertEquals("agosto",mesesTest.getMeses()[7], () -> "no agosto"));
		
		
	}

}