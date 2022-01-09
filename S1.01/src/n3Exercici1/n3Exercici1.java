/*
 * Exercici 1. Crea una classe anomenada Base amb dos mètodes: metode1() i metode2(). 
 * En el primer mètode, invoca el segon. Defineix una classe anomenada Derivada que hereti de l'anterior 
 * i substitueix el segon mètode. Crea un objecte de la classe Derivada, realitza una generalització 
 * (upcasting) al tipus Base i crida al primer mètode. Demostra el que succeeix
 */

package n3Exercici1;

public class n3Exercici1 {

	public static void main(String[] args) {
		
		Base miDerivada = new Derivada(); //Generalizacion upcasting
		
		miDerivada.Metodo1(); //Metodo1 de la clase padre.

	}

}
