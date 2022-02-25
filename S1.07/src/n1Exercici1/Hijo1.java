package n1Exercici1;

public class Hijo1 extends Padre {
	
	public Hijo1(String n, int e) {
		super(n,e);
	}
	@Override
	public void metodo_padre_hijo_nieto() {
		System.out.println("Metodo_Hijo_1");
	}
	

}
