package IfElseStatements;

import java.util.Scanner;

public class dataValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("Please enter your name?");
		name = input.nextLine().trim();
		boolean multipleWords;
		if(word.isEmpty()) {
			System.out.println("please enter the data");
		}
		if (name.isBlank()) {
			System.out.println("you did not provide the name");
			
		}else {
			System.out.println("Your name: " +name);
		
		}
	}

}
