package n1Exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Listado {
	public Listado() {}
	
	public static void guardar_fichero(String destino, ArrayList<String> c) throws IOException {
		FileWriter flwriter = new FileWriter(destino,true);//("../S1.05/src/n1Exercici3/miarchivo.txt", true);
		
		for (int i =0; i<c.size();i++) {
			flwriter.write(c.get(i));
		}
		flwriter.close();		
	}
	
		
	public static void ficherosRecursivos(File directorio, String separador,ArrayList<String> c) {
		//FileWriter flwriter = new FileWriter("../S1.05/src/n1Exercici3/miarchivo.txt", true);
		File[] ficheros = directorio.listFiles();
		
        DateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
 
        if(ficheros != null){
            for (int x = 0; x < ficheros.length; x++) {
            	if (ficheros[x].isFile()){
            		//System.out.println(separador + ficheros[x].getName()+ " -F" + " " + sdf.format(ficheros[x].lastModified()));
            		c.add(separador + ficheros[x].getName()+ " -F" + " " + sdf.format(ficheros[x].lastModified())+"\n");
            	}            	    
            	else{
            		//System.out.println(separador + ficheros[x].getName() + " -D");
                    String nuevo_separador = separador + "|_";
                    c.add(nuevo_separador + ficheros[x].getName()+"-D"+"\n");
                    ficherosRecursivos(ficheros[x], nuevo_separador,c);                                
                }            	
            }            
        }       
        
    }
}
