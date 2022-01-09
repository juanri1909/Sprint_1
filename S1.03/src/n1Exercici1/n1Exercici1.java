/*Exercici 1. Crea una classe anomenada Month amb un atribut "name" 
(que emmagatzemarà el nom del mes de l'any). 
Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) 
en un Contenidor ArrayList Java, a excepció de l'objecte amb atribut "Agost". 
Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri 
que el Contenidor manté l'ordre correcte.
https://jarroba.com/arraylist-en-java-ejemplos/
*/


package n1Exercici1;
import java.util.ArrayList;

public class n1Exercici1 {

	public static void main(String[] args) {
		
		ArrayList<Month> MiArrayListMeses = new ArrayList<Month>();
		String[] meses =  {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i=0; i<11; i++){
			Month mes = new Month(meses[i]);
			MiArrayListMeses.add(i, mes);
		}
		
		Month mes = new Month("Agosto");
		MiArrayListMeses.add(7, mes);
		
		for (int i=0; i<12; i++) {
			System.out.println(MiArrayListMeses.get(i).getName());
		}
		
        
    }
	

}
