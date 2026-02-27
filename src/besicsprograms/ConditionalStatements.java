package besicsprograms;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x>y);
		
		if(x>y) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		if(true) {
			System.out.println("passed");
		}
		else {  // dead code
			System.out.println("Failed");
		}
		
		
		boolean flag = true;
		if(flag) {
			System.out.println("hello");
		}
		else {
			System.out.println("World");
		}
		
		int t1 = 100;
		int t2 = 200;
		if(t1>=t2) {
			System.out.println("t1 and t2 are greater than or equal");
		}
		else {
			System.out.println("condition false");
		}
		
		
		String browser = " CHROME ";
		if(browser.toLowerCase().trim().equals("chrome")) {
			System.out.println("launch chrome browser");
		}
		else if(browser.toLowerCase().trim().equals("edge")) {
			System.out.println("launch edge browser");
		}
		else if(browser.toLowerCase().trim().equals("safari")) {
			System.out.println("Launch safari browser");
		}
		else if(browser.toLowerCase().trim().equals("firebox")) {
			System.out.println("launch firebox browser");
		}
		else {
			System.out.println("please pass correct browser");
		}
		
		

	}

}
