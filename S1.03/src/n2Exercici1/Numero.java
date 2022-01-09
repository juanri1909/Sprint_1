package n2Exercici1;

import java.util.Random;

public class Numero {
	private int num;
	
	public Numero() {		
		Random rnd = new Random();
		this.num = rnd.nextInt(100)+0;
		
	}

	public int getNum() {
		return num;
	}

}
