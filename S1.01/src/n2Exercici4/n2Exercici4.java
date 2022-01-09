/*
 * Exercici 4. Crea una jerarquia d'herència Rossegador: Ratolí, Jerbu, Hamster. 
 * A la classe base proporciona els mètodes que són comuns als rossegadors (ensumar(), rossegar(),
 *  correr()) i substitueix aquests mètodes a les classes derivades per a obtenir diferents comportaments 
 *  depenent del tipus específic de rossegador (per exemple, enviant un missatge a la consola). 
 *  Crea un array d'objectes Rossegador, emplena'l amb diferents tipus específics de rossegadors i 
 *  invoca els mètodes de la classe base demostrant què succeeix.
 * 
 * 
 */


package n2Exercici4;


public class n2Exercici4 {

	public static void main(String[] args) {
		
		Rossegador MiRossegador[]=new Rossegador[3];
		MiRossegador[0] = new Hamster(); 
		MiRossegador[1] = new Jerbu();
		MiRossegador[2] = new Ratoli();
		
		for(int i=0; i<3; i++) {
			MiRossegador[i].correr();
			MiRossegador[i].ensumar();
			MiRossegador[i].rossegar();
		}
		
		

	}

}
