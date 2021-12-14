/*Exercici 5. Defineix un comportament "erroni" utilitzant un bucle 'while'
que es repeteixi fins que es deixi de generar una excepció.
*/

package n2Exercici5;

public class n2Exercici5 {

	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;
		float cociente=0;
		int[] miLista = {0,0,0,0,0,1};
		int i = 0;
		while (i < miLista.length) {
			try {
				cociente=numerador/miLista[i];
			}
			catch (ArithmeticException ex){
				System.out.println("ERROR: " + ex.getMessage());
			}
			
			i++;
		}
		System.out.println("RESULTADO: "+ cociente);
	}
}

