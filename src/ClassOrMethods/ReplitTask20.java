package ClassOrMethods;

import java.util.Scanner;

public class ReplitTask20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any word");
		String word = input.nextLine().toLowerCase();
		char ch = word.charAt(word.length()-1);
		System.out.println(ch + word +ch);
		
	}

}
