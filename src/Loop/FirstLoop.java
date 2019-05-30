package Loop;

import java.util.Scanner;

public class FirstLoop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your name");
	String name	= input.nextLine();
	int length = name.length();
	
		for( int i =0  ;i<15 ; i++ ) {
		 
		 System.out.println(i);
	 System.out.println("Welcome, "+ name);
	 }
	 
	}
	
}
