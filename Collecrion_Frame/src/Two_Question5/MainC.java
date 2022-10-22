package Two_Question5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainC {

	public static void main(String[] args) {
		Map<String, Integer> sam = new LinkedHashMap<String, Integer>();
		
		sam.put("Mandar", 3); 
		sam.put("Prince", 1);
		sam.put("Kaustubh", 2);
		sam.put("Gandu", 5);
		sam.put("Pandu", 7);   /* Latest Input key is overlaped*/
		
		for(Entry<String, Integer> e1: sam.entrySet()) {
			System.out.println(e1.getKey()+" "+e1.getValue()+" "+e1.getKey().hashCode());
		}
	}
}
