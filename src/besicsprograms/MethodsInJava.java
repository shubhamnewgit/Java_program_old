package besicsprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
	
	
	// method with no return and no inputs
	public void test() {
		System.out.println("test method");
	}
	
	
	//method with no return and some input
	public void getBilling(int days) {
		System.out.println("getting billing information");
		int bill = days*100;
		System.out.println(bill);
	}
	
	
	//method with some inputs and return
	public int sum(int a, int b) {
		System.out.println("adding two numbers");
		int s = a+b;
		return s;
	}
	
	
	//method with no input but some return
	public String getInfo() {
		System.out.println("getting some info");
		String s = "Hello info";
		return s;
				
	}
	
	//boolean return type
	public boolean isAppExit() {
		return true;
	}
	
	//eg
	public int calculateMarks(int tmarks, int extmarks, int dmarks) {
		System.out.println("calculating students marks");
		int finalMarks = tmarks + extmarks - dmarks;
		return finalMarks;
	}
	
	//eg aaray
	public String[] getDevices() {
		System.out.println("getting devices");
		String devices[] = {"lenovi","HP","Assus"};
		return devices;
	}
	
	
	//eg
	public ArrayList<String> getUsersList(){
		System.out.println("getting user list here");
		ArrayList<String> users = new ArrayList<String>();
		users.add("Shubham");
		users.add("mangesh");
		users.add("chinmay");
		users.add("vipin");
		return users;
		
	}

	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		obj.getBilling(10);
		
		int total=obj.sum(10, 20);
		System.out.println(total);
		int total1 = obj.sum(30, 40);
		System.out.println(total1);
		
		String msg = obj.getInfo();
		System.out.println(msg);
		
		if(obj.isAppExit()==true) {
		System.out.println("login app");
		}
		
		
		int fmarks = obj.calculateMarks(90, 10, 15);
		System.out.println(fmarks);
		
		
		String myDevices[] = obj.getDevices();
		System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices.length);
		
		System.out.println("------ArraList concept----");
		
		ArrayList<String> myUsers = obj.getUsersList();
		System.out.println(myUsers);
		System.out.println(myUsers.size());
		
		myUsers.add("pragati");
		System.out.println(myUsers);
		System.out.println(myUsers.size());
		
		for(int i=0; i<=myUsers.size()-1; i++) {
			System.out.println(myUsers.get(i));
			if(myUsers.get(i).equals("pragati")) {
				System.out.println("fmale candidate");
			}
			
			
		

	}

}
}
