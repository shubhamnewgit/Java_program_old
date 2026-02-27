package besicsprograms;

public class User {
	
	String name;
	int age;
	String city;
	String telephon;
	double salary;
	boolean isactive;

	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.name = "shubham";
		u1.age = 28;
		u1.city="Amravati";
		u1.telephon = "8765546787";
		u1.salary = 13.44;
		u1.isactive = true;
		
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
		System.out.println(u1.telephon);
		System.out.println(u1.salary);
		System.out.println(u1.isactive); 

	}

}
