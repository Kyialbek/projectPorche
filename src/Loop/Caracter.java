package Loop;

import java.util.Scanner;

public class Caracter {
	public static void main(String[] args) {
		
		char c ;
		// use char method and loop
		//read the word and store into String.
		//Read second word and convert it into the char
		// iterate through the characters of the word
		//each character you iterate keep checking vs given char
		// if same count if not
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word");
		String word =input.nextLine();
		System.out.println("Please enter the character");
		 c = input.next().charAt(0);
		 System.out.println(word);
		 System.out.println(c);
		 int counter = 0;
		 for(int i =0; i< word.length(); i++) {
			 if(c==word.charAt(i)) {
				 counter++;
			 }
		 }
		System.out.println(counter);
	}

}
