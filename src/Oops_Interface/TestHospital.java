package Oops_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital FH = new FortisHospital();

       FH.cardioservices();
       FH.EmergencyServices();
       FH.ENTservices();
       FH.MedicalInsuranceServices();
       FH.PathologyServices();
       FH.neuroservices();
       FH.orthoservices();
       FH.gyncservices();
       //Top Casting
       USMedical US=new FortisHospital ();//child class object can be referred by parent interface ref variable
       US.orthoservices();
       US.physioservices();
       US.cardioservices();
       US.services911();
       FH.totalDoctors(1000);
       System.out.println(USMedical.minfee);
       USMedical.UShospitalAdmin();
       FH.billing();
       FH.MedicalTraining();
       FH.CovidTest();
       FH.MedicalResearch();
       
       FH.UNmethod();
       
	}

}
