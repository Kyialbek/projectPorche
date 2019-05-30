package practice;

import java.util.Scanner;

public class SubsTrim {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1;
		System.out.println("Enter your first and last name?");
		n1 = input.next().trim();
		int n2 = n1.indexOf(" ") +1;
		String lastName = n1.substring(n2);
		System.out.println(lastName);
		
	}

}
