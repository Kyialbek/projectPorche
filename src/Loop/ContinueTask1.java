package Loop;

import java.util.Scanner;

public class ContinueTask1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		for( ;  ;){
			
	System.out.println("enter the password");
			String password = input.nextLine().toLowerCase();
			attempts++;
			
			if(password.equals("secret478")) {
				System.out.println("welcome to your profile");
				break;
			
			}
			if (attempts == 3) {
				System.out.println("Your account is locked");
				break;
			}
		}
	}

}
