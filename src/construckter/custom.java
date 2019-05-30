package construckter;

public class custom {
	int age, DOB, height, weight;
	String name, lastName, middleName,  favouriteSong, gender, nationality, birthPlace, hairStyle;
	 public custom(String name) {
		this.name = name;
	}
	 public custom(String lastName, int age) {
		 this.lastName = lastName;
		 this.age = age;
	 }
	 public custom( int DOB) {
		 this.DOB = DOB;
		 
	 }
	 public custom (String middleName, String favouriteSong) {
		 this.middleName = middleName;
		 this.favouriteSong = favouriteSong;
	 }
	 public custom(String gender, String nationality, String birthPlace) {
		 this.gender = gender;
		 this.nationality = nationality;
		 this.birthPlace = birthPlace;
	 }
	 public custom(int height, String hairStyle, int weigt) {
		 this.height = height;
		 this.hairStyle = hairStyle;
		 this.weight = weigt;
	 }
	 public String toString() {
			
			return new String( );

}
}