package Loop;

import java.util.Scanner;

public class RacistPerson {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (; ; ) {
			System.out.println("Enter the name");
			String name = input.nextLine().toLowerCase();
			if (name.equalsIgnoreCase("james")) {
				continue;
			}else {
				System.out.println("good job");
			}
		}
	}

}
