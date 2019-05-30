package practice;

import java.util.Scanner;

public class IfAndElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amont of $");
		int balance;
		balance = input.nextInt();
	if (balance<=600) {
		System.out.println("Approved");
	}
	else {
	
	System.out.println("Declined");
	}
	}

}
