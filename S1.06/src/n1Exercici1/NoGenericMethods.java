/*
 * Exercici 1.
 *  Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
 *  juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor 
 *  per a inicialitzar els tres. 
 *  Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 */


package n1Exercici1;

public class NoGenericMethods<T>{
	private T t;
	private T z;
	private T y;
	
	public NoGenericMethods(T a,T b,T c) {
		
		this.t=a;
		this.z=b;
		this.y=c;
		
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public T getZ() {
		return z;
	}

	public void setZ(T z) {
		this.z = z;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
	public String toString() {
		return this.t.toString() + " " + this.z.toString() + " "+ this.y.toString();
	}
	
	
}

