package n1Exercici2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Listado {
	
	public Listado() {}
		
	public static void ficherosRecursivos(File directorio, String separador) {
        File[] ficheros = directorio.listFiles();
        
        DateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
 
        if(ficheros != null){
            for (int x = 0; x < ficheros.length; x++) {
            	if (ficheros[x].isFile()) System.out.println(separador + 
            	    ficheros[x].getName()+ " -F" + " " + sdf.format(ficheros[x].lastModified()));
            	else {
            		System.out.println(separador + ficheros[x].getName() + " -D");
                    String nuevo_separador = separador + "|_ ";
                    ficherosRecursivos(ficheros[x], nuevo_separador);
                }
            }
        }
    }

}
