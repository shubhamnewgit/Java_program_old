package OOP_InterfaceConcept;

public class FortisHospital extends Hospital implements USMedical, UKMedical,IndianMedical {
// child class---->parent Class--->and parent interfaces(n)
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}

	@Override
	public void ononcologyServices() {
		System.out.println("FH---ononcologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");
		
	}

	//UKMedical
	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
	
	}

	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
		
	}

	//indianMedical
	@Override
	public void gynecServices() {
		System.out.println("FH---gynecServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH---radiologyServices");
		
	}
	
	
	public void optServices() {
		System.out.println("FH---optServices");
		
	}
	
	public void pathalogyservices() {
		System.out.println("FH---pathalogyservices");
		
	}

	// common method for all interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencyServices");
		
	}
	
	public static void billing() {
		System.out.println("hospital---billing");
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH----covidVaccination");
		
	}


	
	
	

}
