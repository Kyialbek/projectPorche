package practice;

import java.util.Scanner;

public class FindMiddle {
	public static void main(String[] args) {

	    System.out.println("Please enter word:");
	    Scanner scanner = new Scanner(System.in);
	    String n1 = scanner.nextLine();
	    int length = n1.length();
	    int index = length-1;
	    int evenOrodd = length%2;
	    
	    if ((evenOrodd ==1) && (length >2)){
	    	System.out.println(n1.charAt(evenOrodd));
	    }else {
	    	System.out.println(n1);
	    }
	   
	}

}
