package primitives;

import java.util.Scanner;

public class Group5 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    int a;
		double f;
		String k;
		System.out.println("How are you?");
	 k = input.nextLine();
	 System.out.println("" + k);
	 System.out.println("How old are you?");
	 f = input.nextInt();
	 System.out.println(f);
	 System.out.println("How many days in a week");
	 f = input.nextInt();
	 System.out.println(f);
	 
	int length;
	int width;
	System.out.println("please enter the length");
	length= input.nextInt();
	System.out.println("please enter the width");
	width= input.nextInt();
	 
	System.out.println("the area of rectangle is   "   +length*width);
	
	System.out.println("perimeter of your rectangle is  "  + 2*(length+width));
	
			
		
	 
	 
		
		
		
		
		
		
	}

}
