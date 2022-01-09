/*Exercici 1. Crea una classe Cycle, amb les seves subclasses: Unicycle, Bicycle i Tricycle. 
 * Demostra que es pot generalitzar una instància de cada tipus a Cycle mitjançant el mètode 
 * del main(): public static void ride(Cycle c).
 */

package n2Exercici1;

public class n2Exercici1 {
	
	public static void ride(Cycle c){
	    System.out.println("Estoy en ride" );
	  }

	
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Cycle u = new Unicycle();
		Cycle b = new Bicycle();
		Cycle t = new Tricycle();
		ride(c);
		ride(u);
		ride(b);
		ride(t);
		
		
	}

}
