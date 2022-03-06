/*
 * Crea una Functional Interface que contenga un método abstracto operacion (), 
 * que devuelva un valor float; inyecta a la interfaz creada mediante una lambda 
 * el cuerpo del método, de modo que puedas transformar la operación a una 
 * suma, resta, multiplicación y división. 

 */

package n2Fase1Exercici2;

public class Principal {

	public static void main(String[] args) {
		Functional suma;
		suma = ()->{
			float resultado = 5+5;
			return resultado;			
		};
		System.out.println(suma.operacion());
		
		Functional resta;
		resta = ()->{
			float resultado = 5-2;
			return resultado;			
		};
		System.out.println(resta.operacion());
		
		Functional multiplicacion;
		multiplicacion = ()->{
			float resultado = 5*5;
			return resultado;			
		};
		System.out.println(multiplicacion.operacion());
		
		Functional division;
		division = ()->{
			float resultado = 5/5;
			return resultado;			
		};
		System.out.println(division.operacion());
		
		
		
		

	}

}
