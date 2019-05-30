package SwitchStatement;

import java.util.Scanner;

public class TaskFromEsen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter three numbers to cmpare");
		a= input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if (a >b && ( a >c)) {
			System.out.println(a);
			
		
		}
		else if (b>a && (b>c)) {
			System.out.println(b);
		}
		else if (c>a&& (c>b)) {
			System.out.println(c);
		}
		else if (a==b && a==b) {
			System.out.println("They are all equal");
		}
		else {
		System.out.println	("there are two numbers are equal");
			
		}
}

}
