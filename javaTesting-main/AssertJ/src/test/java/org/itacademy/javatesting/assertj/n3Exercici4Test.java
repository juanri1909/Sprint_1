/*Exercici 4. Crea un array list contenidor de diversos tipus d'objectes (creu-los també).
 *  Escriu una asserció per a verificar l'ordre dels objectes en el ArrayList segons van ser 
 *  inserits.

    Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. 
    Deixa un dels elements sense afegir, i verifiqui no la llista no conté aquest últim. 
 * 
 */

package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class n3Exercici4Test {
	
	private static ArrayList<n3Exercici4> micoche = new ArrayList<n3Exercici4>();
	
	@Test
	public void prueba() {
		//Creamos 4 objetos
		n3Exercici4 c1 = new n3Exercici4(1, "dacia");
		n3Exercici4 c2 = new n3Exercici4(2, "dacia");
		n3Exercici4 c3 = new n3Exercici4(3, "volvo");
		n3Exercici4 c4 = new n3Exercici4(4, "seat");
		
		/*Escriu una asserció per a verificar l'ordre dels objectes en el ArrayList segons van 
		  ser inserits.*/
		assertThat(1).isEqualTo(c1.getMatricula());
		micoche.add(c1);
		assertThat(2).isEqualTo(c2.getMatricula());
		micoche.add(c2);
		assertThat(3).isEqualTo(c3.getMatricula());
		micoche.add(c3);
				
		//Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
		assertThat(micoche).extracting("matricula").contains(3,2,1);
		//Deixa un dels elements sense afegir, i verifiqui no la llista no conté aquest últim.
		assertThat(4).isEqualTo(c4.getMatricula());
		assertThat(micoche).extracting("matricula").doesNotContain(4);
				
		/*for (int i=0; i<micoche.size(); i++) {
			System.out.println(micoche.get(i).getMatricula()+ " "+ micoche.get(i).getModelo());
			
		}*/		
	}

}
