package besicsprograms;

public class methodChaining {
	
	public static void t1() {
		System.out.println("This is t1 method");
		t2();
		
	}
	
	public static void t2() {
		System.out.println("this is t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("this is t3 method");
		methodChaining obj1 = new methodChaining();
		obj1.m1();
	}
	
	
	
	
	public void m1() {
		System.out.println("this is m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("this is m2 method");
		m3();
		
	}
	
	public void m3() {
		System.out.println("this is m3 method");
		// t1();
		
	}

	
	

	public static void main(String[] args) {
		
		methodChaining.t1();
		//methodChaining obj = new methodChaining();
		//obj.m1();
		

	}

}
