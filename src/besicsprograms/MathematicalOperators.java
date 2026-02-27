package besicsprograms;

public class MathematicalOperators {

	public static void main(String[] args) {
		
		System.out.println(10/2); //5
		System.out.println(9/2);  //4
		System.out.println(9/2.0f);  //4.5
		System.out.println(9.0/2);  //4.5
		System.out.println(9/2f);  //4.5
		System.out.println(9.0/2.0);  //4.5
		
		//System.out.println(9/0); // AE
		
		System.out.println(0/9);  //0
		//System.out.println(0/0);  //java.lang.ArithmeticException
		
		System.out.println(9.0/0);  // Infinity
		System.out.println(9/0.0);  // Infinity
		System.out.println(9.0/0.0);  //Infinity
		
		System.out.println(0.0/0.0);  // NaN - not a number
		System.out.println(0/0.0);  //NaN
		System.out.println(0.0/0);  //NaN
		
		// zero divided by any number out put is zero
		
		System.out.println('a'/'a');  //97/97=1
	//	System.out.println('a'/0);  // AE
		System.out.println(0/'a');  // 0
		

	}

}
