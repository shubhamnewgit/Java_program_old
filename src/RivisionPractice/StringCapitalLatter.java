package RivisionPractice;

public class StringCapitalLatter {

	public static void main(String[] args) {
		
		String s = "this is my java code";
//		o/p - This Is My Java Code
		String newStr = "";
		String rev = "";
		String rev1 = "";
	
		String ss[] = s.split(" ");
		for(String e : ss) {
			newStr = newStr + e.replace(e.valueOf(e.charAt(0)),e.valueOf(e.charAt(0)).toUpperCase()) + " ";
		}
		System.out.println(newStr.trim()); //  This Is My Java Code
		
		
		String ss1[] = newStr.split(" ");
		for(String e1 : ss1) {
			int len = e1.length();
			for(int i = len-1; i>=0; i--) {
				rev1 = rev1 + e1.charAt(i);
			}
			rev1 = rev1 + " ";  
		}
		System.out.println(rev1.trim()); // sihT sI yM avaJ edoC
		
		
		// calling revers str method from ReverseStringConcept class
		rev = rev + ReverseStringConcept.reverseString(newStr) + " ";
		System.out.println(rev.trim()); // edoC avaJ yM sI sihT
		
		

}
}
