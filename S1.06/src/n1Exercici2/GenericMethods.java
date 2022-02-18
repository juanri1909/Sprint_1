/*
 * Exercici 2. Crea una classe anomenada GenericMethods amb un mètode genèric anomenat f() 
 * que accepti tres arguments de tipus genèric. Realitza al main() diferents crides  
 * d'aquest mètode amb diferents tipus de parametres. Comprova que es poden posar qualsevol 
 * tipus de variable.
 */


package n1Exercici2;

public class GenericMethods<T,V,Z> {
	
	private T t;
	private V v;
	private Z z;

	public GenericMethods() {}
	
	public void f(T a, V b, Z c) {
		this.t = a;
		this.v = b;
		this.z = c;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public Z getZ() {
		return z;
	}

	public void setZ(Z z) {
		this.z = z;
	}
	
	


}