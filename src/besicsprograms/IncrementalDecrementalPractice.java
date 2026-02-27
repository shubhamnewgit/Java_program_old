package besicsprograms;

public class IncrementalDecrementalPractice {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a); //a = 13
		System.out.println("b=" + b); //b = 24 
		System.out.println("c=" + c); //c = 11+22+11+22+13+24 = 103
		
		int i = 10;
		int j = i++ - --i + ++i - i--;
		System.out.println(i); // 10
		System.out.println(j); //j = 10-10+11-11 = 0
		
		
		int i1 = 19, j1 = 29, k = 0;
		int m = i1-- - j1-- - k--;
		System.out.println("i1=" +i1); //18
		System.out.println("j1=" +j1); //28
		System.out.println("k=" +k); //-1
		System.out.println("m=" +m); //19-29-0 = -10
		
		float f1 = 1.1f;
		float f2 = f1++;
		System.out.println(f1); //2.1
		System.out.println(f2); //1.1
		
		char ch = 'a'; //97 - asky value
		System.out.println(++ch); //b
		System.out.println((byte)++ch); //99
		
		
		
		
		
		
		

	}

}
