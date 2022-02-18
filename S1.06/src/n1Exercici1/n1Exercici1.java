/*
 * Exercici 1.
 *  Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
 *  juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor 
 *  per a inicialitzar els tres. 
 *  Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 */

package n1Exercici1;

public class n1Exercici1 {

	public static void main(String[] args) {
		
		NoGenericMethods<Integer> nuevo1 = new NoGenericMethods<Integer>(1, 2, 3);
		NoGenericMethods<Integer> nuevo2 = new NoGenericMethods<Integer>(3, 1, 3);
		
		System.out.println(nuevo1.toString());
		System.out.println(nuevo2.toString());
	}

}
