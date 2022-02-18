/*
 *  Exercici 2. Crea una classe anomenada GenericMethods amb un mètode genèric anomenat f() 
 * que accepti tres arguments de tipus genèric. Realitza al main() diferents crides  
 * d'aquest mètode amb diferents tipus de parametres. Comprova que es poden posar qualsevol 
 * tipus de variable.
 */
package n1Exercici2;

public class n1Exercici2 {

	public static void main(String[] args) {
		
		GenericMethods<Integer, Integer, Integer> obj1 = new GenericMethods<Integer, Integer, Integer>();
		GenericMethods<String, String, String> obj2 = new GenericMethods<String, String, String>();
		GenericMethods<Integer, String, Integer> obj3 = new GenericMethods<Integer, String, Integer>();
		GenericMethods<String, Integer, String> obj4 = new GenericMethods<String, Integer, String>();
		
		obj1.f(1, 2, 3);
		obj2.f("hola", "buenos", "dias");
		obj3.f(20, "Pedro", 100);
		obj4.f("juan", 24, "Rios");
		
		System.out.println(obj1.getT()+" "+obj1.getV()+" "+obj1.getZ());
		System.out.println(obj2.getT()+" "+obj2.getV()+" "+obj2.getZ());
		System.out.println(obj3.getT()+" "+obj3.getV()+" "+obj3.getZ());
		System.out.println(obj4.getT()+" "+obj4.getV()+" "+obj4.getZ());
		
		

	}

}
