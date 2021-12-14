/*
Exercici 2. Asseguri's que si convertim el Contenidor utilitzat en el punt 
anterior a un Contenidor HashSet, aquest no permet duplicats. Verifica-ho.*/
//https://es.acervolima.com/2021/09/12/como-imprimir-elementos-hashset-en-java/

package n3Exercici2;

import java.util.HashSet;

public class n3Exercici2 {

	public static void main(String[] args) {
		HashSet Meses = new HashSet();
		
		String[] meses =  {"Enero", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		
		for (int i=0; i<meses.length; i++){
			Meses.add(meses[i]);
		}
		
		System.out.println(Meses);
		
	}

}
