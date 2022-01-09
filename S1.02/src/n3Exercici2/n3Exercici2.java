/*Exercici 2. Crea una classe denominada FailingConstructor amb un constructor que falli a la meitat 
 * del procés de construcció i generi una excepció. En main() escriu el codi que permeti protegir-se apropiadament
 *  enfront d'aquesta fallada. 
 * 
 */

package n3Exercici2;
import java.io.*;

public class n3Exercici2 {
	
	public static void main(String[] args) {
		
		String correctPath = "./src/n3Exercici2/archivo1.rtf";
		String IncorrectPath = "./src/n3Exercici2/archivoo1.rtf";
		
        FailingConstructor fc;
        int i=0;
        
        try {
            fc= new FailingConstructor(IncorrectPath);
            
        } catch (FileNotFoundException e) {
        	System.out.println("Vamos a corregir el nombre del fichero para que se pueda abrir");
        	try {
        		fc= new FailingConstructor(correctPath);
        		System.out.println("Archivo abierto correctamente");
        		i=1;
        		
        	}catch(FileNotFoundException e1){
        		 e1.printStackTrace();
        	}
            if (i==0) e.printStackTrace();
        }
    }
}
