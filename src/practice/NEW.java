package practice;

import java.util.Scanner;

public class NEW {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String name;
		String hobby;
		String citizenship;
		int age;
		System.out.println("Please enter ur name");
		name = input.nextLine();
		System.out.println("name is  " + name);
		System.out.println("what is ur hobby");
		hobby = input.nextLine();
		System.out.println(hobby + "  that is nice)");
		System.out.println("where do u live");
		citizenship = input.nextLine();
		System.out.println(citizenship + " - i love that place");
		System.out.println("enter ur age");
		age = input.nextInt();
		System.out.println(age );
		
	}

}
