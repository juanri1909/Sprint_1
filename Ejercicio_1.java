package Fichero;
import java.io.*;
import java.util.*;

public class Ejercicio_1 {
	public static void main(String[] args) {
		try {
			
			Formatter f = new Formatter("//Users//JuanRios//Desktop//mifichero.txt");
			f.format("%s %s", "1", "JUAN\r\n");
			f.format("%s %s","2", "URSULA");
			f.close();
		}
		catch(FileNotFoundException e) {
			
		}
		
		try {
	
			int c = 5/0;
			System.out.println(c);
			}
		catch(Exception e) {
			
			
		}
	}
}
