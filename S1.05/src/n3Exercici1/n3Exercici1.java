/*
 * Exercici 1. Crea una utilitat que encripti i desencripti els fitxers 
 * resultants dels nivells anteriors. Utilitza l'algorisme AES en manera 
 * de treball ECB o CBC amb mètode d'ompliment PKCS5Padding. 
 * Es pot emprar javax.crypto o bé org.apache.commons.crypto.
 */

package n3Exercici1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class n3Exercici1 {
	
	private static String texto;
    private static final String ALGORITHM = "AES";
    private static final String ALGORITHM_STR = "AES/ECB/PKCS5Padding";
    private SecretKeySpec key;
    
    public n3Exercici1(String hexKey) {
            key = new SecretKeySpec(hexKey.getBytes(), ALGORITHM);
        }
    
    public String encryptData(String data) throws Exception {
        	Cipher cipher = Cipher.getInstance (ALGORITHM_STR); // crea un cifrado
        	cipher.init (Cipher.ENCRYPT_MODE, key); // Inicializar
        	return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
        }
    
    public String decryptData(String base64Data) throws Exception{
            Cipher cipher = Cipher.getInstance(ALGORITHM_STR);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(base64Data)));
    }
    
    public static void leer_fichero() {
    	
    	try {
            FileReader entrada=new FileReader("../S1.05/src/n3Exercici1/miarchivo.txt");
            int c;
            c=entrada.read();

            while(c!=-1) {
            	char letra=(char)c;
                c=entrada.read();
                texto+=letra;
            }
            entrada.close();
         }catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
    
    public static void main(String[] args)throws Exception {
		
		leer_fichero();
		String texto_encriptado;
		String texto_desencriptado;
		
		n3Exercici1 util = new n3Exercici1 ("abcdefghijklmnop"); // clave 16 caracteres

		texto_encriptado = util.encryptData (texto);
		texto_desencriptado = util.decryptData(texto_encriptado);
		System.out.println(texto_desencriptado);
	}

}
