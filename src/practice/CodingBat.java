package practice;

import java.util.Scanner;

public class CodingBat {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in) ;
 String str = input.nextLine();
 if(str.startsWith("f"))
	  System.out.println("Fizz");
	  if(str.endsWith("b"))
	  System.out.println("Buzz");
	  if(str.startsWith("f") &&( str.endsWith("b")))
	  System.out.println("FizzBuzz");
	  else {
		  System.out.println(str);
	  }
	 
 
	//int aLength = length(a);
	//int sum = a + b;
	//if(aLength == numOfDigits(sum)) {
	//	System.out.println(sum);
	
}
}

