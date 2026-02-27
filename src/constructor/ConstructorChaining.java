package constructor;

public class ConstructorChaining {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	char gendar;
	
	
	public ConstructorChaining(String name, int age) {
		this("mangesh", 23, 33.33);  // calling constructor from anathor constructor
		this.name = name;
		this.age = age;	
	}
	

	public ConstructorChaining(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	public ConstructorChaining(String name, int age, double salary, boolean isActive, char gendar) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gendar = gendar;
	}


	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining("shubham",30);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		
		
		
		

	}

}
