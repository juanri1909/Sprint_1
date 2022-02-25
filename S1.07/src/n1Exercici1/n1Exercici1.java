/*
 * Exercici 1. Crea una jerarquia d'objectes Java on els objectes fill sobreescriguin 
 * alguna funcionalitat de l'objecte pare emprant @Override. 
 * Afegeix una classe que efectuï les invocacions necessàries demostrant el punt anterior.
 */

package n1Exercici1;

public class n1Exercici1 {

	public static void main(String[] args) {
		Padre nuevoPadre = new Padre("Juan", 45);
		Hijo1 nuevoHijo1 = new Hijo1 ("Carlota", 14);
		Hijo2 nuevoHijo2 = new Hijo2 ("Martina", 18);
		Nieto1 nuevoNieto1 = new Nieto1("Rufino", 5);
	
		nuevoPadre.metodo_padre_hijo_nieto();
		
		//Llamamos al metodo padre_hijo_nieto sobreEscrito
		nuevoHijo1.metodo_padre_hijo_nieto();
		nuevoHijo2.metodo_padre_hijo_nieto();
		nuevoNieto1.metodo_padre_hijo_nieto();

	}

}
