package IfElseStatements;

import java.util.Scanner;

public class TakInClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username1 = "test";
		String username2 = "james";
		System.out.println("Enter the username");
		String un = input.nextLine();
		
		if (un.equals(username1) || un.equals(username2)){
		System.out.println("username taken");
		} 
		else {
	
		System.out.println("username created");
	}
	}
}





