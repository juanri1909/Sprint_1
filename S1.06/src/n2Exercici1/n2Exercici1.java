/*
 * Demuestre que los métodos de la interfaz son invocables dentro de este método 
 * genérico. 
 * En main(), pasa una instancia de la clase Implementadora en el 
 * método genérico metodeGeneric().
 *

 */
package n2Exercici1;

public class n2Exercici1 {

	public static void main(String[] args) {
		
		Implementadora i = new Implementadora();
		Generica nuevo = new Generica();
		
		nuevo.metodeGeneric(i);
		i.metodo3();
		

	}

}
