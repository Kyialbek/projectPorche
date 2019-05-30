package primitives;

import java.util.Scanner;

public class Seconds {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("welcome to time calculator)");
	System.out.println("Please enter the seconds");
	int seconds;
	seconds = input.nextInt();
	int minutes = seconds/60;
	int hours = minutes/60;
	int leftminutes = minutes%60;
	int remainingSeconds = seconds % 60;
	System.out.println(seconds + "  seconds converted into");
	System.out.println(hours + " hours");
	System.out.println(leftminutes + " left minutes");
	System.out.println(remainingSeconds + " seconds");
	
	

	
	
	
}
}
