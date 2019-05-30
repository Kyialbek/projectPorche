package practice;

import java.util.Scanner;

public class ProjectYesterday {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int unitPrice;
	int quantity;
	double grandTotal = 0.0;
	double total = 0.0;
	double discount =0.0;
	double discountApplied = 0.0;
	
	System.out.println("Enter unit per price");
	unitPrice = input.nextInt();
	System.out.println("Enter quantity");
	quantity = input.nextInt();
	grandTotal = unitPrice*quantity;
	if(quantity>120) {
		discount = 15;
	}
	if(quantity>=100 && quantity<=120) {
		discount =10;
	}
	discountApplied = (grandTotal*discount)/100;
	total =grandTotal - discountApplied;
	System.out.println("Grand Total");
}
}
