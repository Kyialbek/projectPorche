package EraseOrArrays;

import java.util.Random;
import java.util.Scanner;

public class TaskFromEsen11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		int b = ran.nextInt(100);
		for(; ;) {
			System.out.println("Guess the number from 1 to 99");
			int a = input.nextInt();
		
			if (a==b) {
			System.out.println("Congratulations you found the number");
			System.out.println("Your number is "+a +" Secret number was " +b);
			break;
			}
			else if(a <b) {
				System.out.println("Your number is low, please try again");
				
			
		}else if(a>b) {
			System.out.println("Your number is high, please try again");
		}
		
		}
			
	}
}
	


