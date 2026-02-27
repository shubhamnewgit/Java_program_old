package RivisionPractice;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee(String name) {
		this.name = name;
		
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("shubham");
		System.out.println(e1.name);
		
		Employee e2 = new Employee("akshay", 35);
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3 = new Employee("pratik", 30, 20.99);
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.salary);
		

	}

}
