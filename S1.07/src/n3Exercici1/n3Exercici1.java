/*
 * Exercici 1. Afegeix la possibilitat que l'anotació creada en el nivell anterior 
 * sigui registrada per la Virtual Machine en temps d'execució. 
 * Demostra que s'executa la lectura de la annotation utilitzant Java Reflection.
 */

package n3Exercici1;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class n3Exercici1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] tf= {"España", "654456324"};
		Wrapper wp = new Wrapper("Juan", 54, 'H',tf);
		
		Class<? extends Wrapper> c = wp.getClass();
		
		Field[] campos= c.getDeclaredFields();//Recupera todos lo campos de la clase.
		System.out.println("CAMPOS DE LA CLASE");
		for(int i=0; i<campos.length; i++) System.out.println(campos[i]);
		
		System.out.println("METODOS DE LA CLASE");
		Method[] metodos = c.getDeclaredMethods();//Recupera todos los metodos de la clase.
		for(int i=0; i<metodos.length; i++) System.out.println(metodos[i]);
		
		System.out.println("CAMPO Y VALOR DE LA ANOTACION");
		miAnotacion anotacion = (miAnotacion) campos[0].getAnnotation(miAnotacion.class);//Recupera el valor de la Anotacion
		System.out.println(anotacion);
		
		
		//wp.Serializar(anotacion.directorio(), wp);
		
	}

}
