package Tecktorial2Day;

import java.util.Scanner;

public class SwitchStatementTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What type of car do you have?");
		String carType = input.next().toLowerCase().trim();
		switch (carType) {
		case "car":
			System.out.println("You've been charged 1 $");
		
			
			break;
		case "bus":
			System.out.println("You've been charged 2");
			break;
		case "truck":
			System.out.println("You've been charged 5");

		default:
			break;
		}
	}

}
