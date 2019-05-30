package Loop;

import java.util.Scanner;

public class TaskTech {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = input.nextInt();
		for(int i = 0; i<=10; i++) {
			System.out.println(number+ " X "+i+" = "+(number*i));
		}
	}

}
