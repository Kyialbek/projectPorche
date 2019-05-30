package practice;

import java.util.Scanner;

public class Newreview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username1 = "test";
		String username2  = "james";
		System.out.println("Please enter username to create: ");
		String enterdUsername = input.nextLine();
		if(enterdUsername.equals(username1) || enterdUsername.equals(username2)) {
			System.out.println("username is taken");
		
		}
		else {
			System.out.println("username created! ");
			System.out.println("Please enter the password to create:");
			String password = input.nextLine();
			if(password.length() >= 5 && password.length() <=12) {
				System.out.println("Password created successfully!");
				System.out.println("Congratulations, account is created successfully");
				System.out.println("username: " + enterdUsername);
				System.out.println("password: " + password);
				
			}
			else {
				System.out.println("Invalid password .Please enter the password length between 5 and 12 ");
			}
		}
		
	}

}
