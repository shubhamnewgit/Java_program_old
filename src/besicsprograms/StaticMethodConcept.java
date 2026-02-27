package besicsprograms;

public class StaticMethodConcept {
	
	public static String name;
	
	public int age;
	
	
	public static void getInfo() {
		System.out.println("get info");
		StaticMethodConcept obj = new StaticMethodConcept(); // create object for calling non static variable
		System.out.println(obj.age); // calling non static variable in static method
		System.out.println(name);  // calling static variable in static method
		
	}
	
	public void sendMail() {
		System.out.println("send mail");
		System.out.println(age);// calling non static variable in non static method
		System.out.println(name); // calling static variable in non static method
	}

	
	public static void main(String[] args) {
		
		//static variable and methods calling
		StaticMethodConcept.name = "shubham";
		System.out.println(name);
		StaticMethodConcept.getInfo();
		
		//call non ststic methods
		StaticMethodConcept obj = new StaticMethodConcept();
		obj.age=30;
		obj.sendMail();
	   
	 
		

	}

}
