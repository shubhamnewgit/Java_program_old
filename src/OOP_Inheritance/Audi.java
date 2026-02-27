package OOP_Inheritance;

public class Audi extends Car {
	
	public void theftSaftey() {
		System.out.println("audi----theftSaftey");
	}
	
	
	@Override
	public void engine() {
		System.out.println("Audi---engine");
	}
	
	public void parking() {
		BMW b1 = new BMW();
		b1.autoParking();
	}

}
