package SuperKeywordConcept;

public class Hospital implements Medical{
	
	int min_fees = 50;
	
	public void treatment() {
		System.out.println(Medical.min_fees); // interface variable
		System.out.println(min_fees); // this class variable
	}

	@Override
	public void covid() {
		System.out.println("hospital covid");
		
	}

	

}
