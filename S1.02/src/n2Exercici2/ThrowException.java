package n2Exercici2;
import javax.swing.*;



public class ThrowException extends Exception{
	
	public ThrowException(String mensaje) {
		super(mensaje);
	}
	public ThrowException() {
		
	}
	
public void f() {
		
		int edad;
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
	    if(edad >100) {
	    	try {
	    		throw new ThrowException("error de edad");
	    	}
	    	catch(Exception e) {
	    		g();
	    	}
			
		}
		else {
			System.out.println("pasa palabra");
		}
	
	}
	//Genera un caso que produce una excepcion.
	public void g() {
		try {
			throw new RuntimeException("Esto es otra Exception diferente");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
