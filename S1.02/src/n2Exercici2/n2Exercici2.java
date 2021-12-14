/*Exercici 2. Defineix una referència a un objecte i inicialitza-la amb null. 
Tracta d'invocar un mètode a través d'aquesta referència. 
Ara envolta el codi amb una clàusula try-catch per a capturar l'excepció. 
Mostra el missatge i el tipus d'excepció.
*/


package n2Exercici2;

public class n2Exercici2 {

	public static void main(String[] args) {
		String s = new String();
		s= null;
		
		
		try {
			s.compareTo("hola");
		}
		catch (NullPointerException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
		
	}

}
