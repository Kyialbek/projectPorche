package EraseOrArrays;

import java.util.Scanner;

public class RepliTask11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(; ;) {
			System.out.println("Please enter any character");
			String letter = input.nextLine();
			
			
		 if(letter=="a"|| letter=="e"|| letter=="i"|| letter =="o"|| letter =="u" ||letter=="y") {
				System.out.println(letter+" is Vowel");
			}else if(letter=="b"||letter=="c"||letter=="d"||letter=="f"||letter=="g"||letter=="h"||letter=="j"||letter=="k"||letter=="l"||letter=="m"||letter=="n"||letter=="p"||letter=="q"||letter=="r"||letter=="s"||letter=="t"||letter=="v"||letter=="w"||letter=="x"||letter=="z") {
				System.out.println(letter+" -this letter is Consontant");
			}else {
				System.out.println("Error");
			}
			
		}
	}

}
