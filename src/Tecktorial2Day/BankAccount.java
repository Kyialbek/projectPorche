package Tecktorial2Day;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 1500;
		do {
			System.out.println("Enter the item price to purchase");
			int item = input.nextInt();
			 balance-=item  ;
			if(balance<=0) {
				System.out.println("Balance is empty");
				System.out.println("your balance is "+balance);
				break;
			} 
			}while(true);
			
			
		
}

}
