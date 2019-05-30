package Loop;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String itemName;
		int itemPrice;
		int balance = 1500;
		while(balance > 0) {
			System.out.println("Please enter name of product you wat to purchase");
			itemName = input.nextLine().toLowerCase();
			System.out.println("Please enter the price of it");
			itemPrice = input.nextInt();
			if(itemPrice>balance || itemName.equals("ak-47")){
				System.out.println("Transaction amount is too high or your item is prohibited");
				break;
			}else {
				System.out.println("Product purchased successfully");
				System.out.println("Your balance is "+balance);
			}
		}
	}

}
