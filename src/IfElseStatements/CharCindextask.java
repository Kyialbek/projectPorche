package IfElseStatements;

import java.util.Scanner;

public class CharCindextask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("Enter the name");
		name = input.nextLine();
		name = name.toLowerCase();
		name = name.trim();
		
		if(name.isEmpty()) {
			System.out.println("invalid name");
		}else {
			
		}
		int i =name.length();
		char first =name.charAt(0);
		char last = name.charAt(i-1);
		
		
		if(first==('a') && last==('z')){
			System.out.println("Cool");
		}else {
			System.out.println("Not very cool");
		}
		System.out.println("name: "+name);
	}

}
