/*
 * Crea una Functional Interface que continga  un mètode abstracte getPiValue (), 
 * que retorn a un valor double; en una  altra classe, instancie la  interfície 
 * i assigneu-li  mitjançant una lambda el valor 3.1415. Invoca  el  mètode getPiValue
 *  de la  instància d'interfície i  imprimeix el resultat . 
 */

package n1Fase2Exercici1;



public class Principal {

	public static void main(String[] args) {
		miMetodo uno = ()->{
			return 3.1415;
		};		

		System.out.println(uno.getPiValue());

	}

}
