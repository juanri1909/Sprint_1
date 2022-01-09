/*
Exercici 2. Asseguri's que si convertim el Contenidor utilitzat en el punt 
anterior a un Contenidor HashSet, aquest no permet duplicats. Verifica-ho.*/
//https://es.acervolima.com/2021/09/12/como-imprimir-elementos-hashset-en-java/

package n1Exercici2;

import java.util.HashSet;

import n1Exercici1.Month;

public class n1Exercici2 {

	public static void main(String[] args) {
		
		
		HashSet<String> MiHashSetMeses = new HashSet<String>();
		String[] meses =  {"Enero", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i=0; i<12; i++){
			Month mes = new Month(meses[i]);
			MiHashSetMeses.add(mes.getName());
		}

		for (String m : MiHashSetMeses) {
			System.out.println(m);
		}
		
	}

}
