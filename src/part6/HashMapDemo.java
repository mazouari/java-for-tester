package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// declare Hashmap
		
//		HashMap hm = new HashMap ();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		
		//Add pairs into hashmap
		
		hm.put(101,"ali");
		hm.put(103,"anis");
		hm.put(104,"mohamed");
		hm.put(105,"ismail");
		hm.put(106,"omar");
		
		System.out.println(hm);
		
		//Remove element from HashMAp
		
//		hm.remove(103);
//		System.out.println("After removing a pair : " +hm);

		//reading pairs using enhanced for element
		
		for(Map.Entry m : hm.entrySet()) {
			
		System.out.println(m.getKey() + " " +m.getValue());
		}

}
}
