/*
 *  Exercici 3. Modifica el punt anterior de manera que un dels arguments de f() no sigui parametritzat.
 */
package n1Exercici3;

public class n1Exercici3 {

	public static void main(String[] args) {
		
		GenericMethods<Integer, Integer> obj1 = new GenericMethods<Integer, Integer>();
		GenericMethods<String, String> obj2 = new GenericMethods<String, String>();
		GenericMethods<String, Integer> obj3 = new GenericMethods<String, Integer>();
		GenericMethods<Integer, String> obj4 = new GenericMethods<Integer, String>();
		
		obj1.f(1, 2, 3);
		obj2.f(1, "buenos", "dias");
		obj3.f(20, "Pedro", 100);
		obj4.f(1, 24, "Rios");

		
		System.out.println(obj1.getT()+" "+obj1.getV()+" "+obj1.getZ());
		System.out.println(obj2.getT()+" "+obj2.getV()+" "+obj2.getZ());
		System.out.println(obj3.getT()+" "+obj3.getV()+" "+obj3.getZ());
		System.out.println(obj4.getT()+" "+obj4.getV()+" "+obj4.getZ());
		
		

	}

}
