package Oops_Interface;

public class FortisHospital extends MedicalAssociation 	implements USMedical,UKMedical,IndiaMedical {

	@Override
	public void orthoservices() {
		System.out.println("FortisHospital-orthoservices" );
	}

	@Override
	public void physioservices() {
		System.out.println("FortisHospital-physioservices" );
	}

	@Override
	public void cardioservices() {
		System.out.println("FortisHospital-cardioservices" );
	}

	@Override
	public void Pediaservices() {
		System.out.println("FortisHospital-Pediaservices" );
	}

	@Override
	public void ENTservices() {
		System.out.println("FortisHospital-ENTservices" );
	}

	@Override
	public void gyncservices() {
		System.out.println("FortisHospital-gyncservices" );
		
	}

	@Override
	public void neuroservices() {
		System.out.println("FortisHospital-neuroservices" );
		
	}

	@Override
	public void oncologyservices() {
		System.out.println("FortisHospital-oncologyservices" );
		
	}

	@Override
	public void EmergencyServices() {
		System.out.println("FortisHospital-EmergencyServices" );
	}

	public void PathologyServices() {
		System.out.println("FortisHospital-PathologyServices" );
	}
	public void MedicalInsuranceServices() {
		System.out.println("FortisHospital-MedicalInsuranceServices");
	}

	@Override
	public void services911() {
		
		System.out.println("FortisHospital-services911" );
	}
	
	public static void FortishospitalAdmin() {
	 	   System.out.println("Fortis Hospital Admin method");
	    }

	@Override
	public void totalDoctors(int Count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CovidTest() {
		System.out.println("Covid Test is mandatory");
		
	}
	
}
