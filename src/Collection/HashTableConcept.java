package Collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
		
		hs.put(101, "shubham");
		hs.put(102, "gaurav");
		hs.put(103, "amol");
		hs.put(104, "pratik");
		hs.put(105, "akash");
		
		System.out.println(hs);  //{105=akash, 104=pratik, 103=amol, 102=gaurav, 101=shubham}
		
		System.out.println(hs.get(104));  // pratik
		
		System.out.println(hs.remove(105)); //akash
		System.out.println(hs);  // {104=pratik, 103=amol, 102=gaurav, 101=shubham}
		
		boolean flag = hs.containsKey(103);
		System.out.println(flag);  // true
		
		boolean flag1 = hs.containsValue("pratik");
		System.out.println(flag1);  // true
		
		System.out.println(hs.isEmpty());  // false
		
		Set keys = hs.keySet();
		System.out.println(keys);  // [104, 103, 102, 101]
		
		Collection values = hs.values();
		System.out.println(values);  // [pratik, amol, gaurav, shubham]
		
		Set entries = hs.entrySet();
		System.out.println(entries);  // [104=pratik, 103=amol, 102=gaurav, 101=shubham]
		
		
		System.out.println("...using entryset method.......");
		for(Map.Entry<Integer, String> value: hs.entrySet()) {
			int key = value.getKey();
			String val = value.getValue();
			System.out.println(key + ": " +  val);
			
		}
		
		System.out.println("....using keySet method...");
		for(int kee :hs.keySet() ) {
			System.out.println(kee + ":"+ hs.get(kee));
		}
		
		
		System.out.println("......using iterator.....");
		Set entry = hs.entrySet();
		Iterator ir = entry.iterator();
		
		while(ir.hasNext()) {
			Map.Entry<Integer, String> value = (Entry<Integer, String>) ir.next();
			int key = value.getKey();
			String val = value.getValue();
			System.out.println(key + ":" + val);
			
		
		}
		
		

	}

}
