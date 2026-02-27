package OOP_Abstraction;

public abstract class Page {
	
	
	public Page() {
		System.out.println("page...constructor");
	}
	
	//We can not create object of abstract class
	//we can have abstract method and non abstract method also
	// no default method allow in abstract class
	//in abstract class can have only non abstract method also
	// no abstract method---0% abstraction
	// only abstract method ---100% abstraction
	// abs + non Abs -- partial abstraction
	// 0 to 100 % abstraction is possible with abstract class
	// can we create constructor of abstract class ??--- yes we can create
	// if we have child class constructor and parent class constructor then which constructor execute first? what will be the sequence?---> seq is always first parent and then child
	// 
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadingTime() {
		System.out.println("Page...loading time out..20 sec");
	}
	
	public static void displayLogo() {
		System.out.println("page ...display logo");
	}
	
	public final void footers() {
		System.out.println("page...footer");
	}

}
