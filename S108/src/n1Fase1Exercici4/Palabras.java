package n1Fase1Exercici4;

import java.util.ArrayList;

public class Palabras {
	private ArrayList<String> miLista = new ArrayList<String>();
	
	public Palabras(ArrayList<String> a) {
		this.miLista = a;
	}
	
	
	public ArrayList<String> miFuncion() {
		ArrayList<String> ml = new ArrayList<String>();
		
		this.miLista.stream().filter(s->s.contains("o")).filter(c->c.length()>5).forEach(p->ml.add(p));
		return ml;
		
		
	}
	
	

}
