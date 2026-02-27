package besicsprograms;

public class Car {
	
	String name;
	String licenseNumber;
	double price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		Car c1= new Car();
		
		c1.name ="BMW";
		c1.licenseNumber="17244";
		c1.price = 736454;
		c1.color = "Red";
		
		
		Car c2 = new Car();
		c2.name ="Audi";
		c2.licenseNumber="17256";
		c2.price = 7368794;
		c2.color = "Black";
	
		
		Car c3 = new Car();
		c3.name ="Honda";
		c3.licenseNumber="17904";
		c3.price = 736499;
		c3.color = "White";
		
		System.out.println(c1.name + " "+ c1.licenseNumber+ " "+ c1.price + " "+ c1.color+ " "+ Car.wheels);
		System.out.println(c2.name + " "+ c2.licenseNumber+ " "+ c2.price + " "+ c2.color+ " "+ Car.wheels);
		System.out.println(c3.name + " "+ c3.licenseNumber+ " "+ c3.price + " "+ c3.color+ " "+ Car.wheels);
		

		
				
		

	}

}
