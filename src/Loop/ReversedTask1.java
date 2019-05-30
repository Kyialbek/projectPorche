package Loop;

import java.util.Scanner;

public class ReversedTask1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word");
		String word = input.nextLine();
		int last = word.length()-1;
		for(int i = last; i >= 0; i --) {
			System.out.println(word.charAt(i) );
		}
	}

}
