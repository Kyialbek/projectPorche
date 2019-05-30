package IfElseStatements;

import java.util.Random;
import java.util.Scanner;

public class SecondEsens {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int number;
		int randomNumber;
		
		boolean found = false;
		System.out.println("Wright a number from 0 to 10 to start the GAME");
		number = input.nextInt();
		randomNumber = random.nextInt(10);
		if  (number == randomNumber) {
			System.out.println(" Congratulations you found the number");
			System.out.println(randomNumber);
			
			found = true;
			
		}
		else if (number > randomNumber) {
			System.out.println("Your number is high");
			
			
		
			
			
			
		} 
		else {
			System.out.println("Your number is low");
	
		}
		System.out.println("found " +found);
		if(found ==false) {
			System.out.println("This is your last chance");
			int secondNumber = input.nextInt();
		
		if (secondNumber == randomNumber) {
			System.out.println("Congratulations");
		}
		else {
			System.out.println("You lost");
		}
		System.out.println("secret number was "+randomNumber);
	}

}
}