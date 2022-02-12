/*
 * Exercici 3. Executi l'exercici anterior guardant a un fitxer txt 
 * el resultat.
 * 
 */

package n1Exercici3;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.ArrayList;


public class n1Exercici3 {
	
	public static void main(String[] args) throws IOException {
		
		String name = "";
		name = JOptionPane.showInputDialog("Escribe Ruta");
		ArrayList<String> c = new ArrayList<String>();
		File directorio = new File(name);
		Listado.ficherosRecursivos(directorio, "",c);
		
		Listado.guardar_fichero("../S1.05/src/n1Exercici3/miarchivo.txt", c);
		
	}
}



