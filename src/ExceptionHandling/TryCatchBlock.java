package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		try {
			
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "shubham";
			
			int i = 9/0;
		}
		catch(ArithmeticException e){
			System.out.println("arithmatic exception is comming..");
			e.printStackTrace();
			
		}
		catch(NullPointerException e) {
			System.out.println("NPE exception is comming...");
			e.printStackTrace();
			
		}
		
		System.out.println("bye");
		
		

	}

}
