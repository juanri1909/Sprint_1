package n1Exercici4;


/*Exercici 4. A la classe Vehicle afegeix un camp static final, 
un camp final i un camp static. Demostra la diferència entre els tres. 
Quins es poden inicialitzar al constructor de la classe?*/

public class Vehiculo {
	//Constante y se iniciara 1 sola vez.
	public static final int anyo1=2021;
	
	//Constante que se inciara cada vez que instanciamos la clase vehiculo.
	private final int anyo2;
	
	//Variable y se iniciara 1 sola vez
	private static int anyo3;

	
	
	public Vehiculo(){
		anyo2=2022;
		anyo3=2023;
		System.out.println("Inciamos constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Vehiculo.anyo1);
		System.out.println(Vehiculo.anyo3);
		
		Vehiculo v1 = new Vehiculo();
				
		System.out.println(v1.anyo2);
		System.out.println(Vehiculo.anyo3);

	}

}
