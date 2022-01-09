package n1Exercici1;
/*Exercici 1. Crea una classe amb un main() que generi un objecte de la 
classe Exception dins d'un bloc try-catch. 
Proporciona al constructor de l'excepció un missatge especific. 
Captura l'excepció dins d'una clàusula catch i imprimeix el seu missatge. 
Afegeix una clàusula finally i imprimeix un missatge per a demostrar 
que va passar per allí.
https://jarroba.com/excepciones-exception-en-java-con-ejemplos/
*/
public class n2Exercici1 {

	public static void main(String[] args) {
		
		int numerador = 10;
		int denominador = 0;
		float cociente=0;
		try {
			cociente=numerador/denominador;
		}
		catch (ArithmeticException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
		finally {
			System.out.println("EL RESULTADO ES: " + cociente);
	    }
	}
	

}
