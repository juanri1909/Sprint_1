/*
 * Exercici 4. Afegeixi la funcionalitat de llegir qualsevol fitxer txt
 *  i mostrar per consola el seu contingut.
 */

package n1Exercici4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class n1Exercici4 {
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException { 
	    	String cadena; 
	    	try {
	    		FileReader f = new FileReader(archivo); 
		        BufferedReader b = new BufferedReader(f); 
		        while((cadena = b.readLine())!=null) { 
		        	System.out.println(cadena); 
		        } 
		        b.close(); 
	    	}catch(Exception e) {
	    		System.out.println("ERROR " + e.getMessage());
	    	}
		} 
	    
	    public static void main(String[] args) throws IOException {
	    	muestraContenido("../S1.05/src/n1Exercici3/miarchivo.txt"); 
	    }
	

}
