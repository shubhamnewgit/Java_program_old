package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap<String, Integer> h = new HashMap<String, Integer>();
		//HashMap h = new HashMap();
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(101, "shubham");
		h.put(102, "mangesh");
		h.put(103, "chinmay");
		h.put(104, "vipin");
		h.put(105, "prasad");
		
		System.out.println(h);  //{101=shubham, 102=mangesh, 103=chinmay, 104=vipin, 105=prasad}
		
		// get the value besis on key
		System.out.println(h.get(101)); // shubham
		
		// remove entry
		h.remove(105);
		System.out.println(h); //{101=shubham, 102=mangesh, 103=chinmay, 104=vipin}
		
		//verify key 
		System.out.println(h.containsKey(102)); // true
		System.out.println(h.containsKey(107)); // false
		
		// verify value
		System.out.println(h.containsValue("mangesh")); // true
		System.out.println(h.containsValue("akshay")); // false
		
		// return all keys in set format
		System.out.println(h.keySet());  // [101, 102, 103, 104]
	
		for(int i: h.keySet()) {
			System.out.println(i);
			
		}
		
		
		// return all values as a collection
		System.out.println(h.values());  // [shubham, mangesh, chinmay, vipin]
		
		for(String i: h.values()) {
			System.out.println(i);
		}
		
		
		// return all entries as a set
		System.out.println("using entryset method");
		//System.out.println(h.entrySet());  // [101=shubham, 102=mangesh, 103=chinmay, 104=vipin]
		
		for(Object i:h.entrySet()) {
			System.out.println(i);
		}
		
		
		//print key along with values 
		for(int i:h.keySet() ) {
			System.out.println(i  +" " + " = " + h.get(i)  );
		}
		
		System.out.println("by using entry interface method");
		//entry methods
//		for(Object entry:h.entrySet()){
//		    Object i = entry.getKey();
//		    Object j = entry.getValue();
//		    System.out.println(i + " = "+ j);
//		
//	    } 
		//Or
		for(Map.Entry<Integer, String> entry:h.entrySet()) {
			int keys = entry.getKey();
			String values = entry.getValue();
			System.out.println(keys + " = "+ values);
			
		}
		
		//using iterator method
		System.out.println("By using iterator method");
		
		Set entries = h.entrySet();
		Iterator itr = entries.iterator();
		while(itr.hasNext()) {
			//Map.Entry entry = (Entry) itr.next();
			//or
			Object entry = itr.next();
			System.out.println(entry);
		}
		

	}

}
