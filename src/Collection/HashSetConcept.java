package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("shubham");
		hs.add(100);
		hs.add(15.5);
		hs.add('A');
		hs.add(null);
		
		System.out.println(hs);
		
		//remove 
		hs.remove('A');
		System.out.println("after removing value in hashset" + hs);
		
		//contains
		System.out.println(hs.contains("shubham"));
		
		//add value
		hs.add('B');
		System.out.println("after adding B value is hashset " + hs);
		
		//isempty
		System.out.println(hs.isEmpty());
		
		//read all elements ih hashset
		
		//by uing tostring method
		System.out.println("by using toString method" + hs.toString());
		
		
		System.out.println("by using foreach loop me read data");
		for(Object value : hs) {
			System.out.println(value);
		}
		
		System.out.println("read data by using iterator class");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Object> dup = new HashSet<Object>();
		
		//addAll
		dup.addAll(hs);
		System.out.println(dup);
		
		dup.removeAll(hs);
		System.out.println(dup);
		System.out.println(hs);

	}
	

	

}
