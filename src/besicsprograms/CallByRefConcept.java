package besicsprograms;

public class CallByRefConcept {
	
	String name;
	int age;
	
	public static void getInfo(CallByRefConcept t1) {
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
//		t1.name = "mangesh";
//		t1.age = 35;
//		
//		System.out.println(t1.name);
//		System.out.println(t1.age);
	}
	

	public static void main(String[] args) {
		
		CallByRefConcept obj = new CallByRefConcept();
		obj.name = "Shubham";
		obj.age = 30;
		
		getInfo(obj);  // call by referance concept
		 
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}

	