package casting;

import java.util.Scanner;

public class TaskTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a; 
		System.out.println("Please enter the message");
		a = input.nextLine().trim();
		int check =a.charAt(0);
		if ((check>=65 && check <=90) && (a.endsWith(".") || a.endsWith("!"))) {
			System.out.println("good message");
		}else {
			System.out.println("error message");
			
		}
	}

}
