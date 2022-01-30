/*Exercici 1. Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher
 *  de longitud per a un String. Volem usar la classe FeatureMatcher. 
 *  Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte 
 *  donat baix prova ha de coincidir i proporcionar un missatge d'error agradable. 
 *  El constructor de FeatureMatcher presa els següents arguments en aquest ordre:
		El matcher que volem embolicar
    	Una descripció de la funció que provem
    	Una descripció del possible mismatch (desajustament)
    L'únic mètode que hem de sobreescriure és featureValueOf (T actual), que retorna el 
    valor que es passarà al mètode match () / matchesSafely (). 
    Utilitzi el seu comparador personalitzat en una prova per a comprovar 
    si la cadena "Mordor" té una longitud de 8. Ajust la prova si és necessari.
 
 */

package org.itacademy.javatesting.hamcrest;


import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;


public class n2Exercici1Test {
	
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "Una cadena de longitud", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}

	@Test
	public void fellowShipOfTheRingShouldContainer7() {
	    assertThat("Mordor", length(is(8)));
	}
	
}

