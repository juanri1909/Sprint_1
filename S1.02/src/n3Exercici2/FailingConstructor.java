package n3Exercici2;


import java.io.*;

public class FailingConstructor  {
	
	private BufferedReader br;
   
    
    public FailingConstructor(String path1) throws FileNotFoundException {
    	br = new BufferedReader(new FileReader(new File(path1)));
    	System.out.println(path1 + " opened!");
                	
    }
    
}
	

