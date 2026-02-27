package OOP_InterfaceConcept;

public interface USMedical extends WHO {
	
	int min_fee = 100;
	
	//no method body is allow
	// only method deceleration
	
	public void physioServices();
	
	public void ononcologyServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	public static void billing() {
		System.out.println("USM---billing");
	}
	
	

}
