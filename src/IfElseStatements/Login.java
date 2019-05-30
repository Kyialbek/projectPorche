package IfElseStatements;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age ;
		
		age = input.nextInt();
		System.out.println(age);
		if (age >= 21) {
			System.out.println("valid age");
		}
		else {
			System.out.println("invalid");
			int difference = 21-age;
			System.out.println("Please comeback after " + difference + " years");
		
		}
	}

}
