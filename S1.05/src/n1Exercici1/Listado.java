/*
 *Exercici 1. Creu una classe Java que llisti el contingut d'un directori
 * rebut per paràmetre ordenat alfabèticament.
 */


package n1Exercici1;

import java.io.File;

public class Listado {
	
	
	private String ruta;
	
	public Listado(String ruta) {
		this.ruta = ruta;
	}
	
	public String[] imprimir() {
		
		File carpeta = new File(this.ruta);
		
		String[] ficheros = carpeta.list();
		return ficheros;
		
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
	

}
