package builderPattern;

// caller class
public class AppTest {
	

	public static void main(String[] args) {
		
		EcommApplication app = new EcommApplication();
		
		app.login("shubham", "1234")
		       .search("Apple macbook pro")
		           .addToCart("Apple macbook pro")
		                .doPayment("3343 4568 6543", 123)
		                    .getOrderId()
		                        .logOut();
		
		
		System.out.println("---next day----");
		app.login("shubham", "shubham123")
		        .search("tshirts","black")
		            .logOut();
		
		
		System.out.println("---next day----");
		app.login("vendar","vendar123")
		      .search("samsung", "white", 12345)
		         .addToCart("samsung")
		            .doPayment("132y3y3gfjt")
		               .logOut();
		
		
		System.out.println("---next day----");
		app.login("shubham", "shubham123")
		   .logOut();
		
		
		System.out.println("---next day----");
		app.login("shubham", "shubham123445")
		      .search("lenovo laptop")
		         .search("oneplus ,obile")
		            .search("mobile covor")
		               .logOut();
		                    
		      
		
		            
		

	}

}
