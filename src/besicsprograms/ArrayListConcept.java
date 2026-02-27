package besicsprograms;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.remove(4);
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.remove(0);
		System.out.println(ar);
		
		// marklist - student data
		ArrayList<Integer> markshit = new ArrayList<Integer>();
		markshit.add(45);
		markshit.add(50);
		markshit.add(89);
		markshit.add(90);
		System.out.println(markshit.size());
		System.out.println(markshit);
		
		//EmployeList - 
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("shubham");
		emplist.add("Mangesh");
		emplist.add("chinmay");
		System.out.println(emplist.size());
		System.out.println(emplist);
		
		System.out.println("---------------------------------------");
		
		//emp info
		ArrayList<Object> empinfo = new ArrayList<Object>();
		empinfo.add("Shubham");
		empinfo.add(28);
		empinfo.add(23.33);
		empinfo.add("male");
		empinfo.add(true);
		System.out.println(empinfo.size());
		System.out.println(empinfo);
		
	}

}
