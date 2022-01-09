/*Exercici 8. Modifica l'exercici anterior perquè l'objecte Frog substitueixi
 * les definicions de mètodes de la classe base (proporcioni noves definicions
 * utilitzant les mateixes signatures de mètodes).
 * Demostri que ocorre al mètode main(), si manté la generalització anterior o no.
 */

package n1Exercici8;
class n1Exercici8 {

	public static void main(String[] args) {
		Amphibian nuevo = new Frog();
		nuevo.respirar();
		nuevo.menjar();
		nuevo.respirar();
		nuevo.Saltar();

	}

}
