/*
 *     Exercici 1. Crea una annotation personalitzada que permeti serialitzar 
 *     un objecte wrapper Java en un fitxer JSON. 
 *     La annotation ha de rebre el directori on es col·locarà el fitxer resultant.
 */

package n2Exercici1;

import java.io.IOException;
import java.lang.reflect.Field;


public class n2Exercici1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] tf= {"España", "654456324"};
		Wrapper wp = new Wrapper("Juan", 54, 'H',tf);
		
		Class<? extends Wrapper> c = wp.getClass();
		Field[] campos= c.getDeclaredFields();
		miAnotacion anotacion = (miAnotacion) campos[0].getAnnotation(miAnotacion.class);
		System.out.println("Directorio: " + anotacion.directorio());
		
		wp.Serializar(anotacion.directorio(), wp);
		
	}

}
