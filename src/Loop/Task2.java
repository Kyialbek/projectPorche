package Loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter anything");
		String str = scn.nextLine();
		if(str.length()<3 || str.length()>100) {
			System.out.print("Invalid Number");
		}else {
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i) >47 && str.charAt(i)<58) {
					System.out.print(str.charAt(i));
				}
			}
		}
			
	}

}
