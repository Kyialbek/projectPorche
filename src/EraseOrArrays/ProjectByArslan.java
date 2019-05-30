package EraseOrArrays;

import java.util.Scanner;

public class ProjectByArslan {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter any number");
		int oddNum = input.nextInt();
		for(int i =0; i<=oddNum; i++) {
			if(i%2==1) {
				System.out.println("odd numbers are "+i);
			}
			
		}
		
	}

}
