package RivisionPractice;

public class FunctionInJava {
	
	// function with no return and no input
	public void test() {
		System.out.println("This is test function");
	}
	
	// func with no input but some return
	
	public int getBillAmmount() {
		System.out.println("getBillAmmount");
		int footbill = 100;
		int taxbill = 200;
		int finalbill = footbill + taxbill;
		
		return finalbill;
			
	}
	
	public String getTrainerName() {
		System.out.println("getTrainerName");
		String name = "naveen";
		return name;
	}
	
	//passing some input and return
	public int add(int a, int b) {
		System.out.println("adding two numbers");
		int sum = a+b;
		return sum;
	}
	
	

	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		int amount = obj.getBillAmmount();
		System.out.println(amount);
		String tname = obj.getTrainerName();
		System.out.println(tname);
		
		int s = obj.add(10, 20);
		System.out.println(s);
	
		

	}

}
