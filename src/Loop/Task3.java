package Loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String answer;
		int num;
		do {
			System.out.println("Print number");
			input.hasNextLine();
			answer = input.nextLine(); 
		}while(answer.equals("Y")) ;
	}

}
