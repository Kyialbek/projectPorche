package memoryHashAndStack;

import java.util.Arrays;
import java.util.Scanner;

public class library {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 int ID[] = {1, 2, 3, 4, 5};
	 for(int i = 0, count =0; i<ID.length; i++) {
	 System.out.println("Please enter the ID");
	 int check = input.nextInt();
	 if(ID[i] == check) {
		 System.out.println("ID taken try again");
		  count ++;
	 }
	 else System.out.println("Enter your name");
	 String name = input.next();
	 ID[i] += check;
	 System.out.println(ID[i]);
	//
	 break;
	 
}
	 System.out.println(Arrays.toString(ID));
}
}