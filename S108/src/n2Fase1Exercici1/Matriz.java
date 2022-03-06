package n2Fase1Exercici1;

import java.util.*;

public class Matriz implements Comparator<Matriz>,  Comparable<Matriz>{
	private String variable;
	
	public Matriz(){}
	
	public Matriz(String x) {
		this.variable = x;
	}
	
	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public int compare(Matriz p, Matriz p1)
    {
            return p.variable.length()-p1.variable.length();
    }
	
	public int compareTo(Matriz p)
    {
            return (this.variable).compareTo(p.variable);
    }
}
