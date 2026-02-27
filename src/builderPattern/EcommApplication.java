package builderPattern;

public class EcommApplication {
	
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with: " + un + pwd);
		return this;
	}
	
	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with: " + un + pwd + role);
		return this;
	}
	
	public EcommApplication search(String productName) {
		System.out.println("Search : " + productName);
		return this;
	}
	
	public EcommApplication search(String productName, String color) {
		System.out.println("Search : " + " "+productName +" "+color);
		return this;
	}
	
	public EcommApplication search(String productName, String color, int price) {
		System.out.println("Search : " + " " + productName + " " + " " + color + " " + price);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart " + productName);
		return this;
		
	}
	
	public EcommApplication doPayment(String upi) {
		System.out.println("make payment via :" + upi);
		return this;
	}
	
	public EcommApplication doPayment(String cc, int cvv) {
		System.out.println("make payment via :" + cc + " " + cvv);
		return this;
	}
	
	public EcommApplication getOrderId() {
		System.out.println("order is done...order id is :" + 123345);
		return this;
	}
	
	public EcommApplication logOut() {
		System.out.println("loggedOut");
		return this;
	}
	
}

