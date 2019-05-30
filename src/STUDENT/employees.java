package STUDENT;

public class employees {
	public static void main(String[] args) {
		
	
	
	employee e1 = new employee();
	
	e1.setName("gucci ");
	e1.setDateOfBirth("21.05.1990");
	e1.setLastName("Armani");
	e1.setGender("Female");
	e1.setSSN(1112212123);
	
	System.out.println(e1.getName()+" is studying.");
	System.out.println(e1.getLastName()+" born in "+ e1.gettDateOfBirth());
	System.out.println(e1.getName()+ "gender is "+e1.getGender());
	
	}
}
