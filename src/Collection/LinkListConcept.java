package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		
		
		LinkedList<Object> l = new LinkedList<Object>();
		
		l.add(100);
		l.add("shubham");
		l.add(15.5);
		l.add(true);
		l.add('A');
		System.out.println(l);
		
		System.out.println("size of link list is : " + l.size());
		
		//remove data
		l.remove(4);
		System.out.println("after removing data " + l);
		
		// adding data 
		l.add(4,'B');
		System.out.println("After adding data :" + l);
		
		//retreving data 
		System.out.println(l.get(1));
		
		//replace data 
		l.set(4, 'C');
		System.out.println("after replacing data " + l);
		
		//containe
		System.out.println(l.contains("shubham"));
		
		//isempty
		System.out.println(l.isEmpty());
		
		// read all data
		System.out.println(l.toString());
		
		//by suing for loop
		
		System.out.println("by using for loop reading data");
		for(int i=0; i<=l.size()-1; i++) {
			System.out.println(l.get(i));
		}
		
		//using for each loop
		
		System.out.println("by using for each loop we read data");
		for (Object data:l) {
			System.out.println(data);
		}
		
		//by using iterator
		System.out.println("by using iterator class we read data");
		Iterator id = l.iterator();
		
		while(id.hasNext()) {
			System.out.println(id.next());
		}
		
		
		

	}

}
