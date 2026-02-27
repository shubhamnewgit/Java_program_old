package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //override
		b.stop();  //inherited
		b.refule();  //inherited
		b.autoParking();  // individual
		b.engine();  //inherited
		b.billing();  //override
		System.out.println(b.maxspeed);
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		Car.carDisplay();
		BMW.carDisplay();
		
		System.out.println("-------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		c.engine(); //inherited
		c.billing();  // Override
		System.out.println(c.maxspeed);
		
		System.out.println("-------------");
		
		Audi a = new Audi();
		a.start(); //inherited
		a.stop();  //inherited
		a.refule();  //inherited
		a.theftSaftey();  //individual
		a.engine(); // Override
		a.billing();  // inherited
		System.out.println(a.maxspeed);
		Audi.carDisplay();
		System.out.println(Audi.price);
		a.parking();
		
		System.out.println("-------------");
		
		Truck t = new Truck();
		t.hevyLoading();// individual
		t.engine();  // inherited
		t.billing(); // inherited
		
		
		

	}

}
