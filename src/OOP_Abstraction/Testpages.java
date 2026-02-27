package OOP_Abstraction;

public class Testpages {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.doLogin("abcd", "abcd123");
		Page.displayLogo();
		lp.footers();
		
		//Top Casting
		//child class object can be refered by paraent class ref variable
		
		System.out.println("-------------");
		
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();
		pg.footers();

	}

}
