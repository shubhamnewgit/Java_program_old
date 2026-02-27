package besicsprograms;

public class SwitcheCaseConcept {

	public static void main(String[] args) {
		
		String browser = " chrome ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
    		break;
		case "safari":
			System.out.println("launch safari browser");
			break;
		case "firebox":
			System.out.println("launch firebox browser");
			break;
			

		default:
			System.out.println("please pass correct browser");
			break;
		}
		
		
		char c = 'a';
		
		switch (c) {
		case 'a':
			System.out.println((int)c);
			
			break;
		case 'e':
			System.out.println((int)c);
			
			break;
		case 'i':
			System.out.println((int)c);
			
			break;
		case 'o':
			System.out.println((int)c);
			
			break;
		case 'u':
			System.out.println((int)c);
			
			break;
		case 'z':
			System.out.println((int)c);
			
			break;
			

		default:
			System.out.println("please enter correct inputs");
			break;
		}
		
		
		
		int num = 98;
		
		switch (num) {
		case 97:
			System.out.println((char)num);
			
			break;
		case 98:
			System.out.println((char)num);
			
			break;
		case 99:
			System.out.println((char)num);
			
			break;
		case 100:
			System.out.println((char)num);
			
			break;
		case 101:
			System.out.println((char)num);
			
			break;
		case 102:
			System.out.println((char)num);
			
			break;

		default:
			System.out.println("please provide correct inputes");
			break;
		}

	}

}
