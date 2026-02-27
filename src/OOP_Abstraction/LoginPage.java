package OOP_Abstraction;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("loginpage constructor");
	}

	@Override
	public void title() {
		System.out.println("login page title...");
		
	}

	@Override
	public void url() {
		System.out.println("login page url...");
		
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Page...loading time out..5 sec");
	}
	
	
	// loginPage class method
	public void doLogin(String un, String pw) {
		System.out.println("login with" + un + " " + pw);
	}

}
