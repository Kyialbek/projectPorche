package SwitchStatement;

import java.util.Scanner;

public class Tskinaclass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "John";
		String enteredName;
		
		System.out.println("Enter the name");
		enteredName = input.nextLine();
		if(name.equals(enteredName) ) {
			System.out.println("John is a cool name");
		}
			else  {
				System.out.println("Everything else");
			}
		
	}
}
