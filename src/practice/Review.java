package practice;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String a;
		String b;
		String c;
		System.out.println("ur name");
		a = input.nextLine();
		System.out.println("ur name   "  + a);
		System.out.println("please enter ur age");
		b = input.nextLine();
		System.out.println("your age is  "  +b);
		System.out.println("where u`re from");
		c = input.nextLine();
		System.out.println(c + "  is the place ur from");
	}

}
