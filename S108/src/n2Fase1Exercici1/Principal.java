/*
 * Haga una matriz que contenga algunas cadenas de texto y números. 
   Ordénelo por: 
•	longitud (de más corta a más larga) 
•	longitud inversa (de más larga a más corta) 
•	alfabéticamente por el primer carácter ( Nota: charAt (0) devuelve el código numérico 
    del primer carácter) 
•	Las cadenas que contienen "e" primero, todo lo demás en segundo lugar. 
    Por el momento , coloque el código directamente en la lambda. 
•	Modifica todos los elementos de la matriz para cambiar los caracteres “a” a “4” 
•	Muestra sólo los elementos que sean 100% numéricos. (aunque esté guardado como strings) 
  Crea una Functional Interface que contenga un método abstracto operacion (), 
  que devuelva un valor float; inyecta a la interfaz creada mediante una lambda el cuerpo 
  del método, de modo que puedas transformar la operación a una suma, resta, 
  multiplicación y división. 

 */
package n2Fase1Exercici1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Matriz>mesess = new ArrayList<Matriz>();
		mesess.add(new Matriz("Enero"));
		mesess.add(new Matriz("febrero"));
		mesess.add(new Matriz("1948"));
		mesess.add(new Matriz("201"));
		mesess.add(new Matriz("Ana"));
		
		
		Collections.sort(mesess, new Matriz());
		mesess.stream().forEach(c->System.out.print(" "+ c.getVariable()));
		
		System.out.println("");
		System.out.println("----------------------");
		
		Collections.sort(mesess, new Matriz().reversed());
		mesess.stream().forEach(c->System.out.print(" "+ c.getVariable()));
		
		System.out.println("");
		System.out.println("----------------------");
		
		Collections.sort(mesess);
		mesess.stream().forEach(c->System.out.print(" "+ c.getVariable()));
		
		System.out.println("");
		System.out.println("----------------------");
		
		mesess.stream().filter(s->s.getVariable().contains("e"))
		               .forEach(s->System.out.println(s.getVariable()));
		mesess.stream().filter(s->!s.getVariable().contains("e"))
        			   .forEach(s->System.out.println(s.getVariable()));
		              
		System.out.println("");
		System.out.println("----------------------");
		
		mesess.stream().forEach(s->System.out.println(s.getVariable().replace("a", "4")));
		
		System.out.println("");
		System.out.println("----------------------");
		
		mesess.stream().filter(s->s.getVariable().chars().allMatch(Character::isDigit))
				       .forEach(s->System.out.println(s.getVariable()));
		
	}

}
