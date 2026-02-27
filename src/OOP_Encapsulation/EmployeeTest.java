package OOP_Encapsulation;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee e = new Employee("vipin",30,23.33);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		
		
		
//		e.setName("shubham");
//		System.out.println(e.getName());
//		
//		e.setAge(27);
//		System.out.println(e.getAge());
//		
//		e.setSalary(33.55);
//		System.out.println(e.getSalary());
		
		System.out.println(e.dob = "29/10/95");
		
		Employee e1 = new Employee("chinmay",24);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAge());
		
		
		
		
		

	}

}
