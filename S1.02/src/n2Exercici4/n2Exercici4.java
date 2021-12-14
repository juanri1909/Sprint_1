/*Exercici 4. Crea la teva pròpia classe d'excepcions,
heretant de la classe Exception. 
Utilitza el constructor d'aquesta classe per emmagatzemar dins Exception,
 el missatge personalitzat que farà servir aquesta excepció. 
 Crea una clàusula try-catch per a provar la nova excepció. 
 Captura i mostra el missatge emmagatzemat. 
 Mostra també la classe de l'excepció.
*/

package n2Exercici4;

public class n2Exercici4 {

	public static void main(String[] args) {
		
		try {
			int i = 2;
			if (i == 0) throw new MiExcepcion(0);
			else if (i == 1)throw new MiExcepcion(1);
			else if (i == 2)throw new MiExcepcion(2);
			
		}
		catch (MiExcepcion ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
		
	}

}
