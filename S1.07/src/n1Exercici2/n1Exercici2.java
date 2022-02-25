/*
 * Afegeix a les classes fills alguns mètodes deprecados, 
 * i utilitzi la anotacion corresponent. 
 * Invoqui des d'una classe externa els mètodes deprecados,
 * suprimint mitjançant l'anotació corresponent els warnings per ser 
 * deprecada la seva utilització.
 */

package n1Exercici2;

public class n1Exercici2 {
	


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Hijo1 nuevoHijo1 = new Hijo1 ("Carlota", 14);
		Hijo2 nuevoHijo2 = new Hijo2 ("Martina", 18);
		
		nuevoHijo1.metodo_obsolete_hijo1();
		nuevoHijo2.metodo_obsolete_hijo2();		

	}

}
