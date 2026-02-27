package constructor;

public class CallingMethodsFromconstructor {
	String name;
	int age;
	double salary;
	
	public CallingMethodsFromconstructor(String name, int age, double salary) { //constructor
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		getInfo(); // non static method calling
		CallingMethodsFromconstructor.setInfo(); // static method calling or
		//setInfo(); // we can call by using name also but its not agood practice
	}
	
	
	public void getInfo() {  // non static method
		System.out.println("gatting info");
	}
	
	public static void setInfo() {   // static method
		System.out.println("setting info");
	}

	
	
	
	public static void main(String[] args) {
		
		CallingMethodsFromconstructor obj = new CallingMethodsFromconstructor("shubham",39,33.33);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		

	}

}
