/*
 * Añade a las clases hijos algunos métodos deprecados(obseleto), 
 * y utilice la anotacion correspondiente. 

 */

package n1Exercici2;

public class Hijo1 extends Padre {
	
	public Hijo1(String n, int e) {
		super(n,e);
	}
	@Override
	public void metodo_padre_hijo_nieto() {
		System.out.println("Meodo_Hijo_1");
	}
	
	@Deprecated
    public void metodo_obsolete_hijo1() {
        System.out.println("Metodo_Hijo_1_Obsoleto");
    }
	
	
	

}
