 package IfElseStatements;

import java.util.Scanner;

public class AmOrPm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String AmOrPm;
		
		int time;
		System.out.println("Please enter the time");
		time = input.nextInt();
		System.out.println("is it AM or PM");
		AmOrPm = input.next();
		AmOrPm = AmOrPm.toUpperCase();
		switch (AmOrPm){
		case "AM":
			System.out.println("It is day time");
			break;
		case "PM":
		System.out.println("Night Time");
		break;
		default:
			System.out.println("unknown command");
		}
	}

}
