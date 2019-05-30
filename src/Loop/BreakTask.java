package Loop;

import java.util.Scanner;

public class BreakTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		for ( ; ;) {
			System.out.println("am I passed the exam?");
			String JolieAnswer = input.nextLine().toUpperCase();
			if(JolieAnswer.equals("YES")) {
				System.out.println("Im very happy");
				break;
			}else{
				continue;
				
			}
			
		}
	}

}
