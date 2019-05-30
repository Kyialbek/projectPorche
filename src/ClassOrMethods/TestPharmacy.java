package ClassOrMethods;

public class TestPharmacy {
	public static void main(String[] args) {
		Pharmacy patient = new Pharmacy();
		
		patient.patientName = "Carlos";
		patient.patientLastName = "Condit";
		patient.DOB = 1990;
		patient.patientAge = 28;
		patient.patientGender = 'M';
		patient.patientInsurance = false;
		patient.drugPrice =20;
		patient.drugName = "Amoxicillin";
		patient.drugNumber = 4;
		patient.almondAllergy = true;
		
		
		patient.checkInsurance(patient.patientInsurance, patient.drugPrice);
		patient.checkAllergy(patient.almondAllergy);
	}

}
