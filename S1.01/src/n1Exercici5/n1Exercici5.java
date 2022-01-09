/*
 Exercici 5. Crea una classe Animal amb el mètode correr() sobrecarregat 
tres vegades. Defineix una nova classe (per exemple Gat) que hereti 
de l'anterior i afegeix una nova versió sobrecarregada del mateix mètode.
 Mostra que els quatre mètodes estan disponibles a la classe derivada 
 (per exemple enviant un missatge a la consola).
 */
package n1Exercici5;

public class n1Exercici5 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Gato g = new Gato();
		g.correr();
		g.correr("Gato");
		g.correr("Gato", 1);
		g.correr("Gato", 1, 2);
		

	}

}
