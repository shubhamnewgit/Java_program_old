package OOP_Inheritance;

public class BMW extends Car {
	
	int maxspeed = 300;
	static int price = 1000;
	
	
	@Override
	public void start() {
		System.out.println("bmw----start");
	}
	
	
	
	public void autoParking() {
		System.out.println("BMW-----auto parking");
	}
	
	
	public void billing() {
		System.out.println("bmw----billing");
	}
	
	//this is method hiding concept...static method can not be overrriden
	public static void carDisplay() {
		System.out.println("bmw-----display");
	}
	
	
}
