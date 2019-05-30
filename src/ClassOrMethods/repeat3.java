package ClassOrMethods;

import java.util.Arrays;
import java.util.Scanner;

public class repeat3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		System.out.println("Please enter any 5 words");
		for(int i = 0; i<5; i++) {
			arr[i] = input.nextLine();
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].substring(0,3));
		}
		
	}
	

}
