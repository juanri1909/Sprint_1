package n2Exercici4;

public class MiExcepcion extends Exception {
	
	private int codigoError;
	
	public MiExcepcion(int codigoError) {
		this.codigoError = codigoError;
		
	}
	
	public String getMessage() {
		
		String mensaje="";
		switch(codigoError){
        case 0:
            mensaje="Error, Caso 0";
            break;
        case 1:
            mensaje="Error, Caso 1";
            break;
        case 2:
            mensaje="Error, Caso 2";
            break;
    }
     
    return mensaje;
     
	}

}
