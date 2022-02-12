package n1Exercici5;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private String nombre;
	private int edad;
	private int sueldo;
	
	public Empleado(String n, int e, int s) {
		this.nombre = n;
		this.edad = e;
		this.sueldo = s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return " Mi Nombre: " + this.nombre + " Mi Edad: " + this.edad + " Mi Sueldo: " + this.sueldo;
	}
	
	

}
