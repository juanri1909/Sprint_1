package n1Fase1Exercici1;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	
	public Alumno() {	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> miFuncion(ArrayList<String> miLista) {
		ArrayList<String> ml = new ArrayList<String>();
		
		miLista.stream().filter(s->s.startsWith("A")).filter(s->s.length()==3).forEach(c->ml.add(c));
		
		return ml;
		
		
	}
	
	

}
