package OOP_Encapsulation;

public class LoginPage {
	private String userName;
	private String password;
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		System.out.println("setting username");
		this.userName = userName;
	}
	public void setPassword(String password) {
		System.out.println("seting password ");
		this.password = password;
	}
	
	
	public void doLogin(String userName) {
		if(isvalidUserName(userName)==true) {
			System.out.println("Enter username : " + userName);
			System.out.println("Enter password : " + password);
			System.out.println("user is logged in");
			
		}
		else {
			System.out.println("we can not login");
		}
		
	}
	
	
	private boolean isvalidUserName(String userName) {
		System.out.println("checking user is valid or not");
		if(userName.length()>=3) {
			System.out.println("user name is valid");
			return true;
		}
		else {
			System.out.println("user name is not valid ");
			return false;
		}
		
		
	}

}



