package primitives;

import java.util.Scanner;

public class Heloo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstNam, lastName, adress, creditCard;
		System.out.println("Please enter your firstname");
		firstNam = input.nextLine();
		System.out.println("Please enter your lastname");
		lastName = input.nextLine();
		System.out.println("Please enter the adress?");
		adress =input.nextLine();
		System.out.println("Please enter the credid card number?");
		creditCard = input.nextLine();
		System.out.println("Information that you add");
		System.out.println("Name" +firstNam);
		System.out.println("Lastname  "+lastName);
		System.out.println("Adress  " +adress);
		System.out.println("Credit  " +creditCard);
		Boolean a;
		
		System.out.println( "Save this info?");
		System.out.println("Yes");
		System.out.println("No");
		a = input.hasNext();
		System.out.println("yes");
		System.out.println("Thank you!");
	}

}
