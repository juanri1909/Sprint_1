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
	
	/*public Escuela(T id, K nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public K getNombre() {
		return nombre;
	}

	public void setNombre(K nombre) {
		this.nombre = nombre;
	}
	*/
	

}
