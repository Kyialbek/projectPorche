package inputs;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		System.out.println("welcome 2 my program");
		String firstName;
		String lastName;
		String location;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your first name:   ");
		firstName = input.nextLine();
		System.out.println(firstName);
		
		System.out.println("Welcome back, " + firstName);
		lastName = input.nextLine();
	System.out.println("please enter your last name:  "+ lastName );
		
		System.out.println("enter ur location");
		location = input.nextLine();
		System.out.println(location);
		System.out.println("please enter ur age");
		age = input.nextInt();
		 System.out.println(age);
	}

}
