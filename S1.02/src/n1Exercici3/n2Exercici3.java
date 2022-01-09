/*
 * Exercici 3. Escriu el codi per a generar i capturar una excepció de 
 * tipus ArrayIndexOutOfBoundsException. 
 * https://www.google.com/amp/s/www.discoduroderoer.es/crear-nuestra-propia-excepcion-en-java/amp/
 */

package n1Exercici3;

public class n2Exercici3 {

	public static void main(String[] args) {
		int[] MiArrai = new int[3];
		
		try {
			MiArrai[3] = 1;
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

}
