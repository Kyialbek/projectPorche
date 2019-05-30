package Loop;

import java.util.Scanner;

public class WhileLoop2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 1500;
		int transactionAmount;
		
		while(balance >0) {
			System.out.println("Enter the transaction amount:");
			transactionAmount = input.nextInt();
			balance = balance-transactionAmount;
			System.out.println("Your balance is "+balance);
		}
		System.out.println("You are broke");
		System.out.println("Your balance " +balance);
	}

}
