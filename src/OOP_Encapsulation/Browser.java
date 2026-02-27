package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launch browser");
		
		cjeckBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdateAvailable();
		
	}
	
	private void cjeckBrowserVersion() {
		System.out.println("Checking browser version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
	}
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}
	private void checkUpdateAvailable() {
		System.out.println("checkUpdateAvailable");
	}

}
