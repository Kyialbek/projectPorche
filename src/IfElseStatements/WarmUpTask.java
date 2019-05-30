package IfElseStatements;

import java.util.Random;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Scanner -> a class witch comes from java library.
		// Random -> a class that comes from Java and helps us to generate some random numbers.
		Random random = new Random();
		int i = random.nextInt(10*10);
		// bound =>  boundary => limit;
		System.out.println(i);
		 
		 i = i%2;
		 if (i == 1){
			 System.out.println("odd " );
			 
		 }
		 else {
			 System.out.println( " even");
		 }
		 
	}

}
