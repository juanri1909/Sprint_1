package n1Exercici1;

public class Padre {
	private String nombre;
	private int	edad;
	
	public Padre(String n, int e) {
		this.nombre = n;
		this.edad = e;
	}
	
	public void metodo_padre_hijo_nieto() {
		System.out.println("Metodo_padre");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
