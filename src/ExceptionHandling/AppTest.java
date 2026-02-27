package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		
		String browser = "safari";
		
		switch (browser.toLowerCase().trim()) {
		case "edge":
			System.out.println("launching edge browser");
			break;
		case "chrome":
			System.out.println("launching chrome browser");
			break;
		case "ie":
			System.out.println("launching ie browser");
			break;

		default:
			System.out.println("enter correct browser");
			throw new MyException("wrongBrowserException");
		}
		
		System.out.println("launch the url");

	}

}
