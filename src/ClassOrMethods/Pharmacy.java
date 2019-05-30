package ClassOrMethods;

public class Pharmacy {

	String patientName;
	String patientLastName;
	int DOB;
	int patientAge;
	String drugName;
	int drugNumber;
	int drugPrice;
	boolean patientInsurance;
	char patientGender;
	boolean almondAllergy;
	
	public void checkInsurance (Boolean patientInsurance, int drugPrice) {
		if(this.patientInsurance == true) {
			System.out.println("price is "+drugPrice/2);
			
		}else {
			System.out.println("Drug price is "+drugPrice);
			
		}
	}
	public void checkAllergy (boolean drugAllergy) {
		if(drugAllergy == true) {
			System.out.println("Patient can't use the "+drugName);
		}else {
			System.out.println("Patient can use " +drugName);
		}
	}
	
}
