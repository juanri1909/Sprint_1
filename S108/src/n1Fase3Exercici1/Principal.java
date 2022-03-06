/*
 * Crea  una Functional Interface que conting a un mètode abstracte reverse (), 
 * que retorne un valor String; 
 * en una  altra classe,  injecta a la interfície  creada mitjançant una lambda el 
 * cos del  mètode, de manera que torne la  mateixa cadena que rep  com a paràmetre  
 * però a l'inrevés. 
 * Invo ca la instància de la  interfície passant-li una cadena i  comprovant el resultat. 
 */

package n1Fase3Exercici1;

public class Principal {

	public static void main(String[] args) {
		Mi_Interface uno;
		
		uno = (MiCadena)->{
			String resultado = "";
			
			for (int i=MiCadena.length()-1;i>=0;i--) {
				resultado=resultado+MiCadena.charAt(i);
			}
			return resultado;
			
		};
		
		System.out.println(uno.reverse("Interface"));
		
	}

}
