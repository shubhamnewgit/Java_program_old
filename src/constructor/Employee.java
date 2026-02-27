package constructor;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	char gendar;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public Employee(String name, int age, char gendar) {
		this.name = name;
		this.age = age;
		this.gendar = gendar;
		
	}
	
	
	public Employee(String name, int age, double salary, boolean isActive, char gendar) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gendar = gendar;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Employee E1 = new Employee("shubham",28);
		System.out.println(E1.name);
		System.out.println(E1.age);
		
		
		Employee E2 = new Employee("Mangesh",25,54.55);
		System.out.println(E2.name);
		System.out.println(E2.age);
		System.out.println(E2.salary);
		
		Employee E3 = new Employee("Chinmay",24,'M');
		System.out.println(E3.name);
		System.out.println(E3.age);
		System.out.println(E3.gendar);
		
		Employee E4 = new Employee("vipin", 30, 33.44, true, 'm');
		System.out.println(E3.name);
		System.out.println(E3.age);
		System.out.println(E3.salary);
		System.out.println(E3.isActive);
		System.out.println(E3.gendar);
		
		
		

	}

}
