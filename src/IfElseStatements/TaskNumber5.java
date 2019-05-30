package IfElseStatements;

import java.util.Random;
import java.util.Scanner;

public class TaskNumber5 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		String message;
		boolean sent = true;
		System.out.println("Wright a program to send");
		message = input.nextLine();
		int length = message.length();
		if (length>=15) {
			
			sent = true;
		
		}
		else  {
			sent = false;
		}
		System.out.println("message "+message);
		System.out.println("sent: " +sent);
		if (sent) {
		
		Random random = new Random();
		int randomNumber;
		randomNumber = random.nextInt(100);
	boolean sendStatus = true;
	
		randomNumber =randomNumber%2;
		if(randomNumber ==1) {
			
			sendStatus = false;
		}
		else {
			
			sendStatus = true;
		}
		System.out.println(randomNumber+ " randomnumber");
		System.out.println("Delivered: " +sendStatus);
	}
	}
	}

