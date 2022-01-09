/*Exercici 2. Afegeix un mètode wheels() a Cycle, que retorni el nombre de rodes. 
Modifica ride() per a invocar wheels() i verifica que funciona el polimorfisme.
*/

package n2Exercici2;


public class n2Exercici2 {

	public static void ride(Cycle c){
	    c.wells();
	  }

	
	public static void main(String[] args) {
		Cycle c = new Cycle();
		ride(c);
		Cycle u = new Unicycle();
		ride(u);
		Cycle b = new Bicycle();
		ride(b);
		Cycle t = new Tricycle();
		ride(t);		
	}

}
