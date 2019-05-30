package IfElseStatements;

import java.util.Scanner;

public class Credentials {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String username = "test";
	String password = "test123";
	
	
	System.out.println("Enter the username");
	username = input.nextLine();
	System.out.println("Please enter the password");
	password = input.nextLine();
	if(username .equals("test") && password .equals("test123")) {
		System.out.println("Welcome");
	}
	else {
		System.out.println("Entered login or password is incorrect, please try again.");
	}
}
}
