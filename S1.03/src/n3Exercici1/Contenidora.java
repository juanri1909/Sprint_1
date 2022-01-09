/*Crea una classe anomenada Contenidora que encapsuli un array d'objectes String. 
Defineix un mètode add que només permeti afegir cadenes de caràcters. 
Si l'array no és prou gran per a la següent inserció, el contenidor ha de redimensionar automàticament 
aquest array. Al main(), compara el rendiment d'aquest contenidor amb el d'un ArrayList<String>. 
Idea: Per a la proves de rendiment, es pot fer servir la api System.nanoTime(), 
que permet calcular el temps  utilitzat en les operacions descrites per a l'un o l'altre contenidor. */

package n3Exercici1;

public class Contenidora {
	
	
	private int tamano_inicial;
	private String[] MiArray = new String[tamano_inicial];
	
	
	public Contenidora(){
		this.tamano_inicial=0;
	}
	
	public void add(String cadena) {
		
		
		if(this.MiArray.length <= tamano_inicial) {
			
			this.tamano_inicial = this.MiArray.length + 1;
			String[] aux = new String[this.tamano_inicial];
			
			for (int i=0; i<this.tamano_inicial-1;i++) {
				aux[i] = this.MiArray[i];
			}
			
			aux[this.tamano_inicial-1] = cadena;
			
			this.MiArray = new String[this.tamano_inicial];
			
			
			for (int i=0 ; i<this.tamano_inicial; i++) {
				this.MiArray[i] = aux[i];
			}
						
		}
	}

	
	public void Imprimir() {
		for (int i =0 ; i< this.MiArray.length; i++) {
			System.out.println(this.MiArray[i]);
		}
	}
	
}
	
	