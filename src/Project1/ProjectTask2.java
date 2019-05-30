package Project1;

import java.util.Scanner;

public class ProjectTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any mumber");
		 int num = input.nextInt();
		 for(int i =0;i<=num; i ++) {
			 if(i%3==0 && i%5==0) {
				 System.out.println(i);
			 }
			 }
			 
				 
		 }
		
	}


