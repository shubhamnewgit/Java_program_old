package Webdriver_Arch_assign;

public class TestAllDrivers {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FireboxDriver driver = new FireboxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		case "firebox":
			driver = new FireboxDriver();
			break;

		default:
			System.out.println("please pass the correct browser");
			break;
		}
		
		
		driver.get("https//www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println("title :" +title);
		if(title.equals("amazon")) {
			System.out.println("title is passed");
		}
		else {
			System.out.println("title is failed");
		}
		
		String url = driver.getURL();
		System.out.println(url);
		
		driver.findElement("logo");
		
		driver.sendKeys("Username","shubham@gmail.com");
		driver.sendKeys("password","shubham@12345");
		driver.click("login button");
		
		driver.close();
		
	

	}

}
