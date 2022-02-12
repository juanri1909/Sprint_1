package n2Exercici1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Leer_Archivo_Propiedades {
	
	private String origen;
	private String destino;
	
	public Leer_Archivo_Propiedades(String ubicacion) {
		try {
			  
			/**Creamos un Objeto de tipo Properties*/
			   Properties propiedades = new Properties();
			   
			   /**Cargamos el archivo desde la ruta especificada*/
			   propiedades.load(new FileInputStream(ubicacion));

			   /**Obtenemos los parametros definidos en el archivo*/
			   this.origen = propiedades.getProperty("Origen");
			   this.destino = propiedades.getProperty("Destino");
			      		   
			  } catch (FileNotFoundException e) {
			   System.out.println("Error, El archivo no exite");
			  } catch (IOException e) {
			   System.out.println("Error, No se puede leer el archivo");
			  }
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	

}
