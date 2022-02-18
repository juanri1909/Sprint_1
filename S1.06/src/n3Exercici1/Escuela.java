package n3Exercici1;

public class Escuela<T> {
	
	private T nombre;
	
	public Escuela() {
		
	}
	
	public void setnombre(T nombre) {
		this.nombre = nombre;
	}
	
	public T getnombre() {
		return this.nombre;
	}
	
	public void metodo1(){
		System.out.println("Escuela. Metodo1");
	}
	

}
