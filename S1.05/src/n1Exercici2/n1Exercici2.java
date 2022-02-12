/*
 * Exercici 2. Afegeixi a la classe del nivell anterior la funcionalitat de
 *  llistar un arbre de directoris amb el contingut de tots els seus 
 *  nivells (recursivamente) de manera que s'imprimeixin en pantalla 
 *  en ordre alfabètic dins de cada nivell, indicant a més si és un 
 *  directori (D) o un fitxer (F), i la seva última data de modificació.
 * 
 */

package n1Exercici2;

import java.io.File;

import javax.swing.JOptionPane;


public class n1Exercici2 {
	
	public static void main(String[] args) {
		
		String name = "";
		name = JOptionPane.showInputDialog("Escribe Ruta");
		
		File directorio = new File(name);
		Listado.ficherosRecursivos(directorio, "\t");        
    }
}


