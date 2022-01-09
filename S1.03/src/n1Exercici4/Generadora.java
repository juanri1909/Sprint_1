package n1Exercici4;
import java.util.*;
public class Generadora {
	
	public void toString(Collection <String> c) {
		// Get the iterator
	    Iterator<String> it = c.iterator();
	    while(it.hasNext()) {
	    	  System.out.print(it.next()+ " ");
	    	
	    	}	
	    
	}

}
