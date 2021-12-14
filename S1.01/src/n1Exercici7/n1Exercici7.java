/*
 Exercici 7. A l'exercici anterior crea un nou mètode saltar() a la classe Frog i crida’l des del main(), 
 desprès de fer la generalització a Amphibian. Demostra que la crida a aquest mètode saltar dona error.
 */

package n1Exercici7;

//import n1Exercici7.Frog;

public class n1Exercici7 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Frog nuevo = new Frog();
		nuevo.respirar();
		nuevo.menjar();
		nuevo.respirar();
		nuevo.Saltar();//No da error!!!.
	}

}
