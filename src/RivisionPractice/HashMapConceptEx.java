package RivisionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapConceptEx {
	
	public static String getUserCreds(String role) {
		Map<String, String> userRole = new HashMap<String, String>();
		userRole.put("admin", "admin;admin");
		userRole.put("seller", "seller@gmail.com;seller@123");
		userRole.put("vendor", "vendor@gmail.com;vendor@1234");
		userRole.put("customer", "snehal@gmail.com;sneal@1234");
		userRole.put("catmanager", "cat@gmail.com;cat@12345");
		
		return userRole.get(role);
	}
	
	public static void doLogin(String username, String password) {
		System.out.println("login with : " + username + " : " + password);
	}
	
	
	

	public static void main(String[] args) {
		
		String creds = getUserCreds("customer");
		String cred[] = creds.split(";");
		
		String username = cred[0];
		String password = cred[1];
		
		doLogin(username, password);
		
		
		
		

	}

}
