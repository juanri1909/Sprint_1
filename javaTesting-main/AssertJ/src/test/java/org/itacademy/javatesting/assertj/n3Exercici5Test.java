//Exercici 5. Crea un map i verifica que conté una de les key que li afegeixi.

package org.itacademy.javatesting.assertj;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class n3Exercici5Test {
	
	private static Map<Integer, String> jugadores = new HashMap<Integer, String>();
	
	@Test
	public void coprobarKey() {
		jugadores.put(1, "Casillas");
		jugadores.put(2, "Puyol");
		jugadores.put(3, "Xavi Alonso");
		
		assertThat(jugadores).as("").containsKeys(3);
	}

}
