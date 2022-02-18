/*
 * Crea la clase llamada ClaseGenerica con dos métodos genéricos, metode1() 
 * que tenga un parámetro limitado por la primera interfaz y metode2() 
 * que tenga otro parámetro que esté limitado por la segunda interfaz. 
 * con un tipo de argumento que esté limitado por la interfaz MiInterfaz. 
*/

package n2Exercici2;

public class ClaseGenerica  {
	public <T extends Interface1> void metodo1(T t) {
		t.metodo1();		
	}
	
	public <T extends Interface2> void metodo2(T t) {
		t.metodo2();		
	}

}
