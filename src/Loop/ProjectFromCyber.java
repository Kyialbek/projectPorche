package Loop;

import java.util.Scanner;

public class ProjectFromCyber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.println("Do you want to continue? Y/N");
		String answer = input.next().toLowerCase();
		if (number>0) {
			System.out.println("positive number");
		}else if(number<0) {
			System.out.println("negative number");
	}else if (number==0) {
		System.out.println("zero number");
	}
		
		
		do {
			System.out.println("");
			
		}while(answer == "y");
		do {
			
			
			
	}while(answer == "n");
		break;
	
			
	
	}

}
