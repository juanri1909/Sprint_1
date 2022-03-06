/*
 * Crear una clase Alumno que tenga como propiedades: Nombre, edad, curso y nota. 
 * Llena la lista con 10 alumnos. 
1.	Muestra por pantalla el nombre y la edad de cada alumno. 
2.	Filtra la lista por todos los alumnos que el nombre comience por “a”, 
    asígnalo a otra lista y muestra por pantalla la nueva lista (todo con lambdas) 
3.	Filtra y muestra por pantalla a los alumnos que tengan un 5 o más de nota. 
4.	Filtra y muestra por pantalla a los alumnos que tengan un 5 o más de nota 
    y que no sean de PHP. 
5.	Muestra a todos los alumnos que hagan JAVA y sean mayores de edad. 

 */

package n3Fase1Exercici1;

import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Alumno> miLista = new ArrayList<Alumno>();
		miLista.add(new Alumno("Juan",35,"JAVA",6));
		miLista.add(new Alumno("Pedro",24,"PHP",7));
		miLista.add(new Alumno("Ana",25,"C++",9));
		miLista.add(new Alumno("Carlota",28,"JAVA",4));
		miLista.add(new Alumno("Ursula",30,"PYTON",7));
		miLista.add(new Alumno("Imanol",45,"JAVA",10));
		miLista.add(new Alumno("Mari Cruz",45,"PHP",6));
		miLista.add(new Alumno("Andres",25,"C++",6));
		miLista.add(new Alumno("Javi",46,"JAVA",4));
		miLista.add(new Alumno("Isabel",38,"PYTON",6));
		
		miLista.stream().forEach(c->System.out.println(c.getNombre()+ " "+ c.getEdad()));
		
		System.out.println("");
		System.out.println("------------------------------");
		
		ArrayList<Alumno> miLista2 = new ArrayList<Alumno>();
		miLista.stream().filter(c->c.getNombre().startsWith("A")).forEach(c->miLista2.add(c));
		miLista2.forEach(c->System.out.println(c.getNombre()));
		
		System.out.println("");
		System.out.println("------------------------------");
		
		miLista.stream().filter(c->c.getNota()>=5)
		                .forEach(s->System.out.println(s.getNombre() + " "+ s.getNota()));
		
		System.out.println("");
		System.out.println("-------------------------------");
		
		miLista.stream().filter(c->c.getNota()>=5)
		                .filter(s->s.getCurso()!="PHP")
		                .forEach(p->System.out.println(p.getNombre()+" "+ p.getCurso()+ " "+ p.getNota()));;
		
		System.out.println("");
		System.out.println("-------------------------------");
		
		miLista.stream().filter(c->c.getCurso()=="JAVA")
		                .filter(s->s.getEdad()>=18)
		                .forEach(p->System.out.println(p.getNombre()+" "+ p.getEdad()+ " "+ p.getCurso()));;
		
	}
	
	

}
