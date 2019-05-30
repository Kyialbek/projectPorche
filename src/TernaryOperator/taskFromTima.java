package TernaryOperator;

import java.util.Scanner;
//1
public class taskFromTima {
	public static void main(String[] args) {
		int x = 2;
		int y =0;
	System.out.println(y = (x > 0) ? 1 : -1);
	//2
	Scanner input = new Scanner(System.in);
	int age = input.nextInt();
	int ticketPrice;
	System.out.println(ticketPrice = (age >= 16)? 20: 10);
//3	
	int max, num1=2, num2=4;
	if(num1 > num2) {
		System.out.println(max = num1);
	}
	else {
		System.out.println(max = num2);
		//4
		int num =4; 
		if(num %2==0) {
			System.out.println(num+" even");
		
		}else {
			System.out.println(num+ " is odd");
		}
		  //5 a
		int score;
		int scale=2;
		int x1 =5;
		if(x1 >10) {
			System.out.println(score = 3 * scale);
		}else {
			System.out.println(score = 4* scale);
		}
		// 5B
		
		double tax, income = 50000;
		if (income > 10000) {
	tax = income * 0.2;
		} else {
			tax = income *0.17;
		}
		//5C
		int number =7, i =1, j =2;
		if(number%3==0) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
	}
	}

}
