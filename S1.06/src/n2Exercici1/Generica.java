/*
 * En otra clase llamada Generica, crea el método genérico llamado metodeGeneric() 
 * con un tipo de argumento que esté limitado por la interfaz MiInterfaz. 

 */

package n2Exercici1;

public class Generica  {
	public <T extends MiInterface> void metodeGeneric(T t) {
		t.metodo1();
		t.metodo2();
		
	}

}
