package n1Exercici3;

public class Bloque {
	int a=5;
	int b=10;
	int c;
  
  public Bloque(){
        System.out.println("Constructor del Bloque");
  }
  
  static{
        System.out.println("bloque static");
  }
  
  {
	  System.out.println("bloque no static");
  }
 	
}
