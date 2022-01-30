/*Exercici 3. Una asserció que indiqui que dues arrays d'enters són idèntics.
 * 
 */

package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class n3Exercici3Test {
	
	private int vec1[]= {1,2,3};
	private int vec2[]= {1,2,3};
	
	@Test
	public void Comprobar_Arrays() {
		assertThat(vec1).isEqualTo(vec2);
			
		}
	}


