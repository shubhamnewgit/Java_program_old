package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage("shubham","shubham@123");  // create obj and initilaized constructor variable value
		lp.doLogin(lp.getUserName());  // methode calling and passing variable value
		
		lp.setPassword("Shubham@111"); // passing new password 
		lp.doLogin(lp.getUserName());  //calling method and passing variable value
		
		
		
		

	}

}
