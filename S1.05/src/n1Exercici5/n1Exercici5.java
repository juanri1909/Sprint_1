/*
 * Exercici 5. Mostri com serialitzar un Objecte Java a un fitxer .ser i deserialícelo després.
 */

package n1Exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class n1Exercici5 {

	public static void main(String[] args) {
		Empleado[] personal = new Empleado[3];
		
		personal[0] = new Empleado("Juan", 45, 1100);
		personal[1] = new Empleado("Ana", 53, 1200);
		personal[2] = new Empleado("Pedro", 40, 1500);
		
		for (int i=0; i<personal.length; i++) System.out.println(personal[i].toString());

		try {
			//Serilizamos...
			FileOutputStream archivo = new FileOutputStream("miarchivo1.ser");
			ObjectOutputStream escribir_fichero = new ObjectOutputStream(archivo);
			escribir_fichero.writeObject(personal);
			escribir_fichero.close();
			//Deserilizamos....
			ObjectInputStream recuperar_fichero = new ObjectInputStream(new FileInputStream("miarchivo1.ser"));
			Empleado[] personal_recuperado = (Empleado[]) recuperar_fichero.readObject();
			recuperar_fichero.close();
			//Imprimimos....
			for(int i= 0; i<personal_recuperado.length; i++) System.out.println(personal_recuperado[i].getNombre() + 
					" " + personal_recuperado[i].getEdad()+ " "+ personal_recuperado[i].getSueldo());
			
		}catch(Exception e) {
			System.out.println("ERROR " + e.getMessage());
		}
	}

}
