package besicsprograms;

public class MethodOverLoadingConcept {
	
	public void search(int i) {
		System.out.println(i);
	}

    public void search(int i, String name) {
	
    }
    
    public void search(int i, String name, String color) {
    	
    }

	public static void main(String[] args) {
		
		
		MethodOverLoadingConcept obj = new MethodOverLoadingConcept();
		obj.search(10); // call by value concept
		
		

	}

}
