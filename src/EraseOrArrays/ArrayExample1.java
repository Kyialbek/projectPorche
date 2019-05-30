package EraseOrArrays;

import java.util.Scanner;

public class ArrayExample1 { 
	public static void main(String[] args) {
		int[] nums = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		for(int i =0; i<nums.length; i++) {
			nums[i] = input.nextInt();
			
		}
		System.out.println("Do you want sum X or + result");
		String answer = input.next();
		int result = 1;
		if (answer.equals("x")){
			for(int i = 0; i<nums.length; i++) {
				result = nums[i]*result;
			}
			System.out.println(result);
		}
	}
	

}
