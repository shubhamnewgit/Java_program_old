package besicsprograms;

public class MaxNumber {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 400;
		
		if(a>b && a>c && a>d) {
			System.out.println(" a is the gretest number");
		}
		else if(b>c && b>d) {
			System.out.println("b is the gretest number");
		}
		else if(c>d){
			System.out.println("c is the gretest number");
		}
		else {
			System.out.println("d is gretest number");
		}

	}

}
