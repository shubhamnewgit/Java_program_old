package besicsprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTraveling {

	public static void main(String[] args) {
		
		ArrayList<String> footerLinkList = new ArrayList<String>();
		footerLinkList.add("login");
		footerLinkList.add("register");
		footerLinkList.add("forgot psw");
		footerLinkList.add("wishlist");
		
		System.out.println(footerLinkList.size());
		System.out.println(footerLinkList.get(0));
		
		System.out.println("--------------arraylist eliments-------------------");
		System.out.println(footerLinkList);
		
		System.out.println("------------enhanced for loop with index number-------------------");
		
		//enhanced for loop
		int count =0;
		for(String list : footerLinkList) {
			System.out.println(count + "=" + list);
			count++;
		}
		
		
		System.out.println("------------enhanced for loop revers order -------------------");
		//print reverse value using enhanced for loop
		int counter = footerLinkList.size()-1;
		for(String list1 : footerLinkList ) {
			System.out.println(footerLinkList.get(counter));
			counter --;
			
		}
		
		System.out.println("---------------Index for loop------------------");
		//index for loop
		for(int i=0; i<=footerLinkList.size()-1; i++) {
			System.out.println(footerLinkList.get(i));
		}
		
		System.out.println("---------------------------------");
		
		ArrayList<String> pagelist = new ArrayList<String>();
		pagelist.add("register"); //0
		pagelist.add("login");  //1
		pagelist.add("wishlist");  //2
		pagelist.add("forgot psw");  //3
		
		pagelist.add(0, "new register"); // add new value at 0 index and existing value is  shift next index position
		System.out.println(pagelist);
		
		//set method
		pagelist.set(1, "update register"); // replace the value
		pagelist.set(2,"new login");
		System.out.println(pagelist);
		
		pagelist.remove(0);
		System.out.println(pagelist);
		
		
		ArrayList<String> browserlist = new ArrayList<String>(Arrays.asList("chrome","edge","firebox","safari"));
		System.out.println(browserlist.size());
		System.out.println(browserlist.get(0));
		
		browserlist.add(0,"IE");
		System.out.println(browserlist.size());
		System.out.println(browserlist.get(0));
		
		// indexoff
		int indnum = browserlist.indexOf("chrome");  // indexOf method will give us index number of elements which we want
		System.out.println(indnum); //1
		
		if(browserlist.indexOf("Shubham")==-1) {
			System.out.println("please pass the right browser name ");
		}
		
		
		// removeAll
		System.out.println(browserlist);
		//browserlist.removeAll(browserlist);
		//System.out.println(browserlist);
		
		//addAll - combine two arralist
		ArrayList<String> oslist = new ArrayList<String>(Arrays.asList("window","Macbook","HP","lenovo","Assue"));
		browserlist.addAll(oslist);
		System.out.println(browserlist);
		System.out.println(oslist);
		
		//removeAll - remove one arralist from anathor arraylist
		
		browserlist.removeAll(oslist);
		System.out.println(browserlist);
		
		//set - replaced value
		
		oslist.set(2, "Hp pavilion");
		System.out.println(oslist);
		
		//add - add  values in arralist
		oslist.add("HP");
		System.out.println(oslist);
		
		//contains - if we check elements available or not in list
		
		if(oslist.contains("HP")) {
			System.out.println("yes produst is available");
		}
		else {
			System.out.println("product not available");
		}
		
		//containesall
		ArrayList<String> ossublist = new ArrayList<String>(Arrays.asList("HP","Macbook","lenovo"));
		boolean result = oslist.containsAll(ossublist);
		System.out.println(result);
		
		
		//sort - it is collection class method it will short the values an ulphabetical order
		System.out.println("--------short method ------");
		System.out.println(oslist);
		Collections.sort(oslist);
		System.out.println(oslist);
		
		// swap - interchange the two values, swap is the collection calss method
		
		System.out.println("--------swap method ------");
		System.out.println(ossublist);
		Collections.swap(ossublist, 0, 1);
		System.out.println(ossublist);
		
		System.out.println("--------empty list method ------");
		List<Object> testlist = Collections.emptyList(); // create empty list but it is immutable list we can not add data in to this list.
		System.out.println(testlist.size());
		testlist.add("shubham");//unable to add it is immutable
		//System.out.println(testlist); //UnsupportedOperationException
		
		
		
		
		

	}

}
