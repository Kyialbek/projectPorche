package practice;

import java.util.Scanner;

public class TaskFromReplit {
	public static void main(String[] args) {

	    System.out.println("Please enter:");
	    Scanner scanner = new Scanner(System.in);
	    String n = scanner.next();
	    if (n.length() < 5 && n.contains("a")) {
	    	System.out.println("A perfect");
	    	
	    }else if(n.contains("b") && n.contains("a") && n.length()<=7 && n.length()>=10) {
	    	System.out.println("B Perfect");
	    }else if(!n.contains("a" )&& n.contains("b"))  {
	    	System.out.println("Perfect" );
	    	
	    	
	    }else if (n.contains("a")) {
	    	System.out.println("");
	    }else {
	    	System.out.println("Sorry");
	    }
	}

}
