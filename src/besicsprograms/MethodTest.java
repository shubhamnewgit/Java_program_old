package besicsprograms;

import java.util.ArrayList;

public class MethodTest {
	
	//eg
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);
		
		if(studentName.trim().equalsIgnoreCase("pragati")) {
			return 90;
		}
		else if(studentName.trim().equalsIgnoreCase("pallavi")) {
			return 85;
		}
		else if(studentName.trim().equalsIgnoreCase("snehal")) {
			return 95;
		}
		else {
			return -1;
		}
		
	}
	
	
	
	//eg
	public int getMarks(String stuName) {
		System.out.println("getting marks of student " + stuName);
		
		switch (stuName.trim().toLowerCase()) {
		case "pragati":
			return 85;
		case "pallavi":
			return 75;
		case "snehal":
			return 95;
		case "pooja":
			return 90;
		case "madhuri":
			return 65;

		default:
			return -1;
		}
		
	}
	
	
	//eg
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name " +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome browser is launched");
			return true;
		case "firebox":
			System.out.println("firebox browser is launched");
			return true;
		case "edge":
			System.out.println("edge browser is launched");
			return true;
		case "safari":
			System.out.println("safari browser is launched");
			return true;
		
		
		default:
			System.out.println("please pass correct browser " + browserName);
			return false;
		}
	}
	
	
	//eg
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("geting devices from employee " + empName);
		ArrayList<String> deviceList = new ArrayList<String>();
		
		switch (empName.toLowerCase().trim()) {
		
		case "shubham":
			deviceList.add("macbook");
			deviceList.add("airburds headphons");
			deviceList.add("samsung phone");
			break;
		case "pallavi":
			deviceList.add("macbook pro");
			deviceList.add("apple airburds");
			deviceList.add("iphone");
			break;
		case "mangesh":
			deviceList.add("lenovo windows");
			deviceList.add("airburds ");
			deviceList.add("samsung galaxy phone");
			break;

		default:
			System.out.println("please pass the correct name...emp name not found here " + empName );
			break;
		}
		return deviceList;
	}
	
	
	

	public static void main(String[] args) { 
		MethodTest obj = new MethodTest();
		int result = obj.getStudentMarks("snehal");
		System.out.println(result);
		
		if(result==-1) {
			System.out.println("no need to print marksheet");
		}
		else {
			System.out.println("print marksheet");
		}
		
		
		
		int result1 = obj.getMarks("snehal");
		System.out.println(result1);
		
		if(result1==-1) {
			System.out.println("no need to creat marksheet");
		}
		else {
			System.out.println("print marksheet");
		}
		
		
		
		boolean isLaunched = obj.launchBrowser("chrome");
		System.out.println(isLaunched);
		if(isLaunched) {
			System.out.println("enter url ");
		}
		else {
			System.out.println("do not enter url because browser is not correct");
		}
		
		
		ArrayList<String> mydevices = obj.getDevicesList("pallavi");
		System.out.println(mydevices);
		System.out.println(mydevices.size());
		
	}

}
