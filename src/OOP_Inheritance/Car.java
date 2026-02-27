package OOP_Inheritance;

public class Car extends Vehical{
	
	int maxspeed = 100;
	
	static int price = 1000;
	
	public void start() {
		System.out.println("car---start ");
	}
	
	public void stop() {
		System.out.println("car---stop");
	}
	
	public void refule() {
		System.out.println("car--refule");
	}
	
	
	@Override
	public void billing() {
		System.out.println("car---billing");
	}
	
	
	public static void carDisplay() {
		System.out.println("Car-----display");
	}
	

}
