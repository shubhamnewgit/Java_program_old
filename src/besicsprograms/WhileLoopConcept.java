package besicsprograms;

public class WhileLoopConcept {

	public static void main(String[] args) {
		
		int num = 1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		
		//print 10 to 0
		int i = 10;
		while(i>=0) {
			System.out.println(i);
			i--; 
			
		}
		
		//eg
		int j = 1;
		while(j<=100) {
			System.out.println(j);
			if(j%5==0) {
				System.out.println("divisible by 5");
			}
			j++;
		}
		
		
		//eg print even numbers
		System.out.println("All the numbers which is mentioned below are even numbers");
		int k = 2;
		while(k<=20) {
			if(k%2==0) {
				System.out.println(k);
			}
			
			k++;
			
		}
		
		//eg odd numbers
		System.out.println("All the numbers which is mentioned below are odd numbers");
		int l = 0;
		while(l<=20) {
			if(l%2!=0) {
				System.out.println(l);
			}
			l++;
		}
		
		//eg 
		System.out.println("------------------------------------------------------");
		int m = 0;
		while(m<=20) {
			if(m%2!=0) {
				System.out.println(m);
				if(m==17) {
					break;
				}
			}
			m++;
		}
		

	}

}
