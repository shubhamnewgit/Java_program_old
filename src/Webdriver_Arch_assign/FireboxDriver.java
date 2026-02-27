package Webdriver_Arch_assign;

public class FireboxDriver implements WebDriver{
	
	public FireboxDriver(){
		System.out.println("Firebox is launched");
		
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("Launched the url" + " " + url);
		
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public String getURL() {
		return "https//www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on elements" + " " + eleName);
		
	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("entering value in " + " " + eleName + value);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("find element : " + eleName);
		
	}

	@Override
	public void findElements() {
		System.out.println("find elements on the page");
		
	}


}
