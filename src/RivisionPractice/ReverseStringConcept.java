package RivisionPractice;

import ExceptionHandling.MyException;

public class ReverseStringConcept {
	
	
	
	public static String reverseString(String s) {
		
		if(s == null) {
			return null;
		}
		
		if(s.isBlank() || s.isEmpty()) {
			throw new MyException("String value is blank");
		}
		
		//OR
//		if(s.isBlank() || s.isEmpty()) {
//			return s;
//		}
		
		
		int len = s.length();
		if(len == 1) {
			return s;
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i--) {
		    rev = rev + s.charAt(i);
		}
		return rev;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
     System.out.println(reverseString("y"));
     System.out.println(reverseString("shubham"));
     System.out.println(reverseString("Automation testing"));
     System.out.println(reverseString(null));
     System.out.println(reverseString(" "));

		
		

	}

}
