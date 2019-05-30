package ClassOrMethods;

import java.util.Scanner;

public class ReplitTask24 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter Your E-mail?");
	String str = input.nextLine();
	String[] str2 = str.split("@");
	

		System.out.println("id: "+str2[0]);
		System.out.println("domain: " +str2[1]);
	
	
}
}
