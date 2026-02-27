package SuperKeywordConcept;

public class WebPage extends Page{
	
	//public int speed = 10;
	
	public WebPage() {
		System.out.println("WP...default constructor");
	}
	
	public WebPage(int i) {
		System.out.println("WP...constructor" + i);
	}
	
	public void calculateTimeOut() {
		System.out.println("webpage......calculateTimeOut");
	}
	
	
	public final void logo() {
		System.out.println("webpage....logo");
	}
	
	
	public static void billing() {
		System.out.println("webpage..... billing");
	}

}
