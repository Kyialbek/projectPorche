package practice;

import java.util.Scanner;

public class Ifandboolean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n;
		System.out.println("Enter a word");
		n = input.nextLine().trim().toLowerCase();
		if (n.contains("a") ||n.contains("e") ||n.contains("o") || n.contains("i") ||n.contains("u")) {
			System.out.println("Vowel");
			
		}else {
			System.out.println("not vowel");
		}
	}

}
