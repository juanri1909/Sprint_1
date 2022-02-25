package n2Exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Wrapper implements Serializable{
	
	@miAnotacion(directorio="../")
	private Integer edad;
	
	private Character sexo;
	private String nombre;
	private String[] Telefono = new String[2];
	
	
	public Wrapper(String n,Integer e,Character s, String[] tf) {
		this.nombre = n;
		this.edad = e;
		this.sexo = s;
		this.Telefono[0]=tf[0];
		this.Telefono[1]=tf[1];
	}
	
	public String Imprimir() {
		return this.nombre +" "+ this.edad + " "+ this.sexo+ " "+ 
	           this.Telefono[0] +" "+ this.Telefono[1];
	}
	
	public void Serializar(String directorio, Wrapper wp) throws IOException, ClassNotFoundException {
		//Serializamos...	
		FileOutputStream archivo = new FileOutputStream(directorio+"miArchivo.json");
		ObjectOutputStream escribir_fichero = new ObjectOutputStream(archivo);
		escribir_fichero.writeObject(wp);
		escribir_fichero.close();
		
		//Deserializamos....
		ObjectInputStream recuperar_fichero = new ObjectInputStream(new FileInputStream(directorio+"miArchivo.json"));
		Wrapper wp_recuperado = (Wrapper) recuperar_fichero.readObject();
		recuperar_fichero.close();
		
		//Imprimimos.
		System.out.println(wp_recuperado.Imprimir());
	}

}
