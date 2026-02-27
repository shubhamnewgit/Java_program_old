package builderPattern;

public class LoginPage {
	String name;
    String password;
    
    public LoginPage(String name, String password) {
    	this.name = name;
    	this.password = password;
    }
    
    public void doLogin() {
    	System.out.println("enter name :" + name);
    	System.out.println("enter password :" + password);
    	System.out.println("Click on login button");
    	System.out.println("login successfuly");
    }
    

}
