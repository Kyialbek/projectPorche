package practice;

import java.util.Scanner;

public class Kaitaloo {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String login = "janara";
	String password= "jamila";
	System.out.println("Enter the login and password");
	String enterdLogin;
	
	String enteredPassword;
	enterdLogin = input.nextLine();
	enteredPassword = input.nextLine();
	if(enterdLogin.equals(login) ||enteredPassword.equals(password) ) {
		System.out.println("invalid. Login or password is alredy taken");
	}
}
}
