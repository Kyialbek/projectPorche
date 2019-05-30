package construckter;

public class Jordan {
	int age, year;
	String carName, color, hobby, favFood, favColor, favBook;
	public Jordan() {
		
	}
	public Jordan(int age) {
		this.age = age;
		
	}
	public Jordan(String carName, int year, String color, String hobby) {
		this.carName = carName;
		this.year = year;
		this.color = color;
		this.hobby = hobby;
	}
	public Jordan(String favFood, String favColor, String favBook) {
		this.favFood = favFood;
		this.favColor = favColor;
		this.favBook = favBook;
	}
public String toString() {
		
		return new String( "My name is "+ carName+ " my age is "+ age);
	}

}
