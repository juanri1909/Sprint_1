/*
 * Exercici 7. Emplena un HashMap amb parelles clau-valor. Ordeni les parelles segons el codi hash i imprimeixi el resultat 
 * (Idea: fer servir un TreeMap). Extregui les parelles ordenades i introdueixi-les en un mapa LinkedHashMap 
 * (Idea: fer servir el seu constructor). Demostri que es manté l'ordre d'inserció. Extregui només les claus ordenades i 
 * introdueixi-les primer en un HashSet i després en un LinkedHashSet. Es manté l'ordre?
 * 1º.- Creamos y rellenamos un HashMap.
 * 2º.- Para ordenarlos utilizamos un TreeMap, que los ordena automaticamnte.
 * 3º.- Imprimimos y la introducimos en un LinkedHashMap
 * https://pharos.sh/hashmap-y-treemap-en-java-diferencias-y-similitudes/
 */

package n3Exercici7;
import java.util.*;
public class n3Exercici7 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap ();
		map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        
        TreeMap<String, Integer> tmap = 
                new TreeMap<String, Integer>();
        
        for (String clave : map.keySet()) {
            int valor = map.get(clave);
            tmap.put(clave, valor);
        }
        System.out.println(tmap);
        
        LinkedHashMap<String, Integer> LHM = new LinkedHashMap<>();
        for (String d : tmap.keySet()) {
            int v = tmap.get(d);
            LHM.put(d,v);
       }
       System.out.println(LHM);
       
       HashSet MiHashSet = new HashSet();
       for(String d : LHM.keySet()) {
    	   MiHashSet.add(d);   	   
       }
       LinkedHashSet MiLinkedHashSet = new LinkedHashSet();
       Iterator<String> it = MiHashSet.iterator();
       while(it.hasNext()){
          MiLinkedHashSet.add(it.next());
       }
       System.out.println(MiLinkedHashSet);
          
        
        
        

	}

}
