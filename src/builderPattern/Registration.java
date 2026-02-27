package builderPattern;

public class Registration {
	String name;
	String phone;
	String pwd;
	
	public void userReg(String name, String phone, String pwd) {
		System.out.println("Enter username :" + name);
		System.out.println("Enter phone numer :" + phone);
		System.out.println("Enter pwd :" + pwd);
		
		this.name = name;
		this.phone = phone;
		this.pwd = pwd;
	}
	
	public void getUserInfo() {
		System.out.println(name+ " "+ phone+ " "+pwd);
	}
	
	
	
	
	public static void main(String[] args) {
		Registration reg = new Registration();
		reg.userReg("shubham", "1234567", "shubham@123");
		reg.getUserInfo();
		
		

	}

}
