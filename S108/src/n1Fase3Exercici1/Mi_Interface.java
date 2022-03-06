/*
 * Crea  una Functional Interface que conting a un mètode abstracte reverse (), 
 * que retorne un valor String; 
 * en una  altra classe,  injecta a la interfície  creada mitjançant una lambda el 
 * cos del  mètode, de manera que torne la  mateixa cadena que rep  com a paràmetre  
 * però a l'inrevés. 
 * Invo ca la instància de la  interfície passant-li una cadena i  comprovant el resultat. 
 */

package n1Fase3Exercici1;

@FunctionalInterface
public interface Mi_Interface {
	
	public abstract String reverse(String cadena);

}
