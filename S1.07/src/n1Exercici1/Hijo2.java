package n1Exercici1;

public class Hijo2 extends Padre{
	public Hijo2(String n, int e) {
		super(n,e);
	}
	@Override
	public void metodo_padre_hijo_nieto()  {
		System.out.println("Meodo_Hijo_2");
	}

}
