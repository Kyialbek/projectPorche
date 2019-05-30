package ClassOrMethods;

import java.util.Scanner;

public class ReplitTask25 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter any word");
			String str = input.nextLine();
			String[] str2 = str.split(" ");
			for(int i =str2.length-1; i>=0; i--) {
				System.out.println(str2[i]);
				
			}
	}

}
