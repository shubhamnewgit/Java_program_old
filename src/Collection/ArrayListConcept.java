package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add("Shubham");
		ar.add(15.5);
		ar.add('A');
		ar.add(true);
		System.out.println(ar);
		
		//Size
		System.out.println(ar.size());
		
		//remove
		ar.remove(2);  // using index
		ar.remove("Shubham"); // using object
		
		System.out.println("after removing value" + ar);
		
		
		//insert new value
		ar.add(2, "adsod");
		System.out.println("After adding value" + ar);
		
		//Retrieve specific element
		System.out.println(ar.get(2));
		
		// change the exist value or replace value
		
		ar.set(2, "amravati");
		System.out.println("After replacing value" + ar);
		
		//i want to search value in arraylist
		
		System.out.println(ar.contains("amravati"));
		
		//isempty - check arralist empty or not
		
		System.out.println(ar.isEmpty());
		
		//how can we read the data from arraylist
		// by using for loop
		// by using for each loop
		//by using iterator method 
		
		//using for loop
		System.out.println("reading data using for loop");
		for(int i=0; i<=ar.size()-1; i++) {
			System.out.println(ar.get(i));
		}
		
		//Using for each loop
		System.out.println("reading data by using for each loop");
		for(Object e: ar) {
			System.out.println(e);
		}
		
		
		//by using iterator method
		
		System.out.println("by using iterator method");
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//reading data by using tostring method
		System.out.println("reading data by usuing to string method");
		System.out.println(ar.toString());
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("a");
		ar1.add("z");
		ar1.add("b");
		ar1.add("x");
		ar1.add("c");
		ar1.add("y");
		
		System.out.println(ar1);
		
		ArrayList<String> ar1_dup = new ArrayList<String>();
		
		//add one collection in to anathor collection
		ar1_dup.addAll(ar1);
		System.out.println(ar1_dup);
		
		//Remove one collection from anathor
		ar1_dup.removeAll(ar1);
		System.out.println(ar1_dup);
		System.out.println(ar1);
		
		//sorting element is asending order 
		System.out.println("element in the arraylist" + ar1);
		Collections.sort(ar1);
		System.out.println("element in arraylist after sorting" + ar1);
		
		//sorting element in reverse order
		Collections.sort(ar1, Collections.reverseOrder());
		System.out.println("elements in arraylist after sorting reverse order" + ar1);
		
		//Shuffling collections
		
		Collections.shuffle(ar1);
		System.out.println("elements of arraylist after shuffel" + ar1);
		
		//swap element 
		Collections.swap(ar1, 1, 0);
		System.out.println("elements after swaping" + ar1);
		
		
		
		
		
		
		
		

	}

}

