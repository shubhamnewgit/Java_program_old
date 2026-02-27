package besicsprograms;

public class Customer {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name="mangesh";
		c1.age=23;
		c1.city="amravati";
		
		Customer c2 = new Customer();
		c2.name="vipin";
		c2.age=29;
		c2.city="akola";
		
		Customer c3 = new Customer();
		c3.name="chinmay";
		c3.age=26;
		c3.city="pune";
		
		System.out.println(c1.name +" " + c1.age +" "+ c1.city ); //mangesh 23 amravati
		System.out.println(c2.name +" " + c2.age +" "+ c2.city ); //vipin 29 akola
		System.out.println(c3.name +" " + c3.age +" "+ c3.city ); //chinmay 26 pune
		
		System.out.println("-----------------------------");
		c1=c2;
		System.out.println(c1.name +" " + c1.age +" "+ c1.city );  //vipin 29 akola
		System.out.println(c2.name +" " + c2.age +" "+ c2.city );  //vipin 29 akola
		System.out.println(c3.name +" " + c3.age +" "+ c3.city );  //chinmay 26 pune
		
		System.out.println("-----------------------------");
		c2=c3;
		System.out.println(c1.name +" " + c1.age +" "+ c1.city );  //vipin 29 akola
		System.out.println(c2.name +" " + c2.age +" "+ c2.city );  //chinmay 26 pune
		System.out.println(c3.name +" " + c3.age +" "+ c3.city );  //chinmay 26 pune
		
		System.out.println("-----------------------------");
		c3=c1;
		System.out.println(c1.name +" " + c1.age +" "+ c1.city );  //vipin 29 akola
		System.out.println(c2.name +" " + c2.age +" "+ c2.city );  //chinmay 26 pune
		System.out.println(c3.name +" " + c3.age +" "+ c3.city );  //vipin 29 akola
		

	}

}
