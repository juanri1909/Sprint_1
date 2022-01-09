package n1Exercici8;

import java.util.*;

public class StockComparator implements Comparator<Shop> {  
	// override the compare() method
	public int compare(Shop s1, Shop s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

