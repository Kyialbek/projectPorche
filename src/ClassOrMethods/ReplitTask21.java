package ClassOrMethods;

import java.util.Scanner;

public class ReplitTask21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = input.nextLine();
		for(int i = 0; i<word.length(); i++) {
			for(int j =i+1; j<word.length(); j++) {
				if(word.charAt(i)==word.charAt(j)) {
					System.out.println(word.charAt(word.length()));
				}
			}
		}
	}

}
