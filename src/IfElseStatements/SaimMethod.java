package IfElseStatements;

import java.util.Scanner;

public class SaimMethod {
	public static void main(String[] args) {
		
				
				String username= "test";
				String password= "test123";
				String inputUsername;
				String inputPassword;
				
				Scanner input= new Scanner(System.in);
				
				System.out.println("Please enter your username:");
				inputUsername = input.nextLine();
				
				if (inputUsername.equals(username)) {
				
					System.out.println("Please enter your password");
					inputPassword = input.nextLine();
						if (inputPassword.equals(password)) {
						System.out.println("Welcome, " + username);
				} else 
					System.out.println("Invalid Password");
				
				} else 
						System.out.println("Invalid Username");
						
			}
		
	}


