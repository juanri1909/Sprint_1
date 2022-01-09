/*Exercici 3. Afegeix un mètode balance() a Unicycle i a Bicycle amb una implementació diferent
 *  a cada un, però no a Tricycle. Crea instàncies de tres tipus i generalitza-les per a 
 *  formar un array d'objectes Cycle. Tracta d'invocar balance() a cada element de l'array. 
 *  Realitza una especialització fent servir instanceof i invoca balance demostrant el que ocorre.
 *  
 */

package n2Exercici3;

public class n2Exercici3 {

	public static void main(String[] args) {
		Cycle ArrayCycle[]=new Cycle[3];
		ArrayCycle[0] = new Unicycle(); 
		ArrayCycle[1] = new Bicycle();
		ArrayCycle[2] = new Tricycle();
		
		for(int i=0; i<3; i++){
			if(ArrayCycle[i] instanceof Cycle) {
				ArrayCycle[i].balance();
			}
		}
	}

}
