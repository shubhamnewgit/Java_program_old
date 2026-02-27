package besicsprograms;

public class ForLoopConcept {

	public static void main(String[] args) {
		
		//eg 1 to 10 numbers
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		//eg 10 to 1 numbers
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		
		
		System.out.println("------------------------------");
		
		//even number
		for(byte b=1;b<=10;b++) {
			if(b%2==0) {
				System.out.println(b);
			}
		}
		
		
		//eg
		for(float f=1.0f;f<=5.0f;f++) {
			System.out.println(f);
		}
		
		//eg
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		
		System.out.println("------------------------------");
		
		for(char cg=97;cg<=122;cg++) {
			System.out.println(cg + ":" + (int)cg);
		}

	}

}
