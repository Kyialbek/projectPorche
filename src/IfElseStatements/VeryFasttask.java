package IfElseStatements;

import java.util.Scanner;

public class VeryFasttask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message;
		
		System.out.println("Please enter your message");
		message = input.nextLine().trim().toLowerCase();
		int i = message.indexOf("heck");
		int second = message.indexOf("donkey");
		int third = message.indexOf("monkey");
		System.out.println(i);
		System.out.println(second);
		System.out.println(third);
		if(i>0||second>0||third>0) {
			System.out.println("message is not send");
		}else {
			System.out.println("message is send");
		}
	}

}
