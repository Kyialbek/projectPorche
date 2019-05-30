package EraseOrArrays;

import java.util.Scanner;

public class AnimalTest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Animal cat = new Animal();
	
	cat.age=3;
	cat.name = "Tom";
	cat.color = "black";
	cat.gender='M';
	cat.heart = true;
	cat.leg = 4;
	System.out.println(cat.heart);
	
	
	Animal dog = new Animal();
	
	dog.leg= 3;
	dog.name = "Chappy";
	dog.color = "white";
	dog.gender = 'M';
	dog.heart = true;
	dog.age = 32;
	
	
	
}
}
