package Loop;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num =input.nextInt();
		for(int x =1; x<=num; x++)
		if( x%2==0 && x%3==0) {
			int sum =x*x;
			System.out.println(sum+" ");
			
		}
		
	}

}
