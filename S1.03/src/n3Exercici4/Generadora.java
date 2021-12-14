package n3Exercici4;
import java.util.*;
public class Generadora {
	
	public void toString(Collection c) {
		// Get the iterator
	    Iterator<String> it = c.iterator();
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}	
	}

}
