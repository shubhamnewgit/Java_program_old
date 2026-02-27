package SuperKeywordConcept;

public class HomePage extends WebPage{
	public int speed = 50;
	
	
	public HomePage() {
		super();  // super keyword should be the first statement of the child class constructor. we can not use super and this keyword together.
		
		System.out.println("HP...default constructor");
	}
	
	public HomePage(int i) {
		super(i);  // ---> call super class constructor
		System.out.println("HP...constructor" + i);
	}
	
	@Override
	public void pagePanel(){
		System.out.println("home page panel..");
	}
	
	// method hiding
	public static void billing() {
		System.out.println("homepage..... billing");
	}
	
	
	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("homepage...calculateTimeOut");
		logo(); // parent class method
		System.out.println(super.speed); // call parent class speed 
		System.out.println(this.speed);  // call child class speed
		pagePanel(); // call child class overridden method
		
		super.pagePanel(); // call grand parent class method
		 billing(); // child class static method call
		 //OR 
		 //HomePage.billing();
		 
		 WebPage.billing(); // calling parent class static method
		 //or
		// super.billing();
		
	}

}
