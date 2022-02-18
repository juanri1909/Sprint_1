/*Exercici 3. Modifica el punt anterior de manera que un dels arguments de f() 
no sigui parametritzat.
 */


package n1Exercici3;

public class GenericMethods<V,Z> {
	
	private int t;
	private V v;
	private Z z;

	public GenericMethods() {}
	
	public void f(int a, V b, Z c) {
		this.t = a;
		this.v = b;
		this.z = c;
	}
	public void f() {
		System.out.println("hoal mundo");
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
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