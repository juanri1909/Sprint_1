/*
 *Exercici 1. Creu una classe Java que llisti el contingut d'un directori
 * rebut per paràmetre ordenat alfabèticament.
 */


package n1Exercici1;



import javax.swing.JOptionPane;

public class n1Exercici1 {

	public static void main(String[] args) {
		String name = "";
		name = JOptionPane.showInputDialog("Escribe Ruta");
		
		Listado nuevo = new Listado(name);
		
		for (int i=0; i<nuevo.imprimir().length; i++) {
			System.out.println(nuevo.imprimir()[i]);
		}

	}

}
