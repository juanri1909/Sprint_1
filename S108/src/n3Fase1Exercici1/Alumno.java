package n3Fase1Exercici1;

public class Alumno {
	
	private String nombre;
	private int edad;
	private String curso;
	private float nota;
	
	public Alumno(String n, int e, String c, float p) {
		this.nombre =n;
		this.edad = e;
		this.curso = c;
		this.nota = p;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	

}
