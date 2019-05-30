package Project1;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		
		for(int i=0; i<=20; i++) {
			System.out.println("Please enter any letter?");
			char letter = input.next().charAt(0);
			if(letter =='a' || letter == 'o'|| letter =='u'||letter ==i || letter =='y') {
				System.out.println("vowel");
			}else {
				System.out.println("constant");
			}
						
			
		}
	}

}
