package ClassOrMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitTask27 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter any word");
	String[] str = new String[5];
	for(int i =0; i <5; i++ ) {
		str[i] = input.nextLine();
	}
	System.out.println(Arrays.toString(str));
	
	
	}
}
