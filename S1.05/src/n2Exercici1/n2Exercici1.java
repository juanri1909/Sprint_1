/*
 * Exercici 1. Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un file 
 * de configuració. Pot utilitzar un file Java Properties, o bé la llibreria 
 * Apache Commons Configuration si ho desitja. De l'exercici anterior, parametritzi el següent:
	Directori a llegir
    Nom i directori del fitxer txt resultant
 */

package n2Exercici1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class n2Exercici1 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> Lista_ficheros = new ArrayList<String>();
		
		//Cargamos el archivo de propiedades
		Leer_Archivo_Propiedades nuevo = new Leer_Archivo_Propiedades("../S1.05/src/n2Exercici1/archivo.propierties");
		
		File Directorio_Origen = new File(nuevo.getOrigen());
		String Fichero_Destino = nuevo.getDestino();
	
		Listado.ficherosRecursivos(Directorio_Origen, "", Lista_ficheros); 
		Listado.guardar_fichero(Fichero_Destino, Lista_ficheros);
		

	}

}
