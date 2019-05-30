package TernaryOperator;

import java.util.Scanner;

public class ternary1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n ;
		n = input.nextInt();
		int l =18;
		if(n>=l) {
			System.out.println("You are eligible to drive a truck");
		}
		else {
			System.out.println("You are young come after "+(l-n) +" years");
		}
		int x = 19;
		
		String result = x/3>4? "Good math skills" : "Need to practice more on coding bat";
		
		System.out.println(result);
	}

	
}

 