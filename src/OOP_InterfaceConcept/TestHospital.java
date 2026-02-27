package OOP_InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.physioServices();
		fh.dentalServices();
		fh.pathalogyservices();
		fh.optServices();
		fh.emergencyServices();
		System.out.println(USMedical.min_fee);  // variable decelred in USMedical interface
		USMedical.billing(); // static method declared in USMedical interface
		FortisHospital.billing();  // static method declared in FortisHospital class
		
		fh.covidVaccination();
		
		System.out.println("--------------------");
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.ononcologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		System.out.println("--------------------");
		
		UKMedical uk = new FortisHospital();
		uk.cardioServices();
		uk.dentalServices();
		uk.emergencyServices();
		
		System.out.println("--------------------");
		
		IndianMedical ind = new FortisHospital();
		ind.gynecServices();
		ind.radiologyServices();
		ind.emergencyServices();
		
		System.out.println("--------------------");
		
		//interface to interface ---explicit casting
		UKMedical uk1 = (UKMedical)us;
		uk1.cardioServices();
		uk1.dentalServices();
		uk1.emergencyServices();
		

	}

}
