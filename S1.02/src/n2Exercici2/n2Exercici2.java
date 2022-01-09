/*Exercici 2. Repeteix l'exercici anterior, però ara dins de la clàusula catch,  
 * embolica l'excepció g() dins d'una RuntimeException.
 */

package n2Exercici2;


public class n2Exercici2 {

	public static void main(String[] args) {
		ThrowException t = new ThrowException();
		t.f();
		
		System.out.println("he pasado de la expecpeion");
	}

}
