package RivisionPractice;

public class StringReverseWord {

	public static void main(String[] args) {
	
		String s = "This is my java code";
		String ss[] = s.split(" ");
		String rev = "";
		
//		for(String e : ss) {
//			int len = e.length();
//			for(int i = len-1; i>=0; i--) {
//				rev = rev + e.charAt(i);
//			}
//			rev = rev + " ";
//		}
//		System.out.println(rev.trim());
		
		
		
//		OR
		for(String e : ss) {
			rev = rev + ReverseStringConcept.reverseString(e) + " ";
		}
		
		System.out.println(rev.trim());

	}

}
