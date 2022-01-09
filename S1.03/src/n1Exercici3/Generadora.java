package n1Exercici3;
public class Generadora {

	
	/*public void SiguientePersonaje(Collection a) {
		System.out.println(a);
	}*/
	
	private String[] Personajes;
	private String Pelicula;
	
	public Generadora(String[] Actores, String Penicula) {
		this.Personajes = Actores;
		this.Pelicula = Penicula;
	}
	
	public String[] SiguientePersonaje(String Penicula) {
		return this.Personajes;
	}

	public String[] getPersonajes() {
		return Personajes;
	}

	public void setPersonajes(String[] personajes) {
		Personajes = personajes;
	}

	public String getPelicula() {
		return Pelicula;
	}

	public void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}
	
}
