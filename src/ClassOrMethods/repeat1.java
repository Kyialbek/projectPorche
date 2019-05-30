package ClassOrMethods;

import java.util.Scanner;

public class repeat1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please  enter any word?");
	String word = input.nextLine();
	//char lastCharacter = word.charAt(word.length()-1);
	//System.out.println(lastCharacter+word+lastCharacter);
	char lastCharacter = word.charAt(word.length()-1);
	System.out.println(lastCharacter+word+lastCharacter);
	
}
}

