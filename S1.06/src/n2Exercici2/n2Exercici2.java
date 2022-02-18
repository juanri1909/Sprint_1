/*
 * Demuestre que los métodos de la interfaz son invocables dentro de este método 
 * genérico. 
 * En main(), pasa una instancia de la clase Implementadora en el 
 * método genérico metodeGeneric().
 *

 */
package n2Exercici2;

public class n2Exercici2 {

	public static void main(String[] args) {
		
		ImplementadoraDoble i = new ImplementadoraDoble();
		ClaseGenerica nuevo = new ClaseGenerica();
		
		nuevo.metodo1(i);
		nuevo.metodo2(i);
	}

}
