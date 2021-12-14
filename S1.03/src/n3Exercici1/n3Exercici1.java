/*Exercici 1. Crea una classe anomenada Month amb un atribut "name" 
(que emmagatzemarà el nom del mes de l'any). 
Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) 
en un Contenidor ArrayList Java, a excepció de l'objecte amb atribut "Agost". 
Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri 
que el Contenidor manté l'ordre correcte.
https://jarroba.com/arraylist-en-java-ejemplos/
*/


package n3Exercici1;
import java.util.ArrayList;

public class n3Exercici1 {

	public static void main(String[] args) {
		ArrayList Meses = new ArrayList();
		
		String[] meses =  {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i=0; i<11; i++){
			Meses.add(i,meses[i]);
		}
		
		Meses.add (7,"Agosto");
		
		System.out.println(Meses);
        
    }
	

}
