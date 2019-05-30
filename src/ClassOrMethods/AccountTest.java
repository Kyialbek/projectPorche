package ClassOrMethods;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.clientName = "James";
		account.balance = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the deposit amount");
		
		account.addDepost(input.nextInt());
		
		
		
		System.out.println("Please enter the amount you want to withdraw");
		account.withdrawDeposit(input.nextInt());
	
	
	}

}
