/*
Exercici 6. Crea una classe denominada Amphibian i inclou una sèrie de mètodes: 
moure(), respirar() i menjar(). Defineix una nova classe denominada Frog que hereti d
e l'anterior. Al main() crea un objecte Frog i realitza una generalització a Amphibian, 
demostrant que tots els mètodes continuen funcionant.
*/

package n1Exercici6;

public class n1Ejercici6 {

	public static void main(String[] args) {

		Amphibian nuevo = new Frog();
		nuevo.respirar();
		nuevo.menjar();
		nuevo.respirar();
		

	}

}
