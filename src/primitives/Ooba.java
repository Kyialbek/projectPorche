package primitives;

import java.util.Scanner;

public class Ooba {
	
	   public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("second converter to hours and minutes");
               System.out.println("Please enter seconds");
             int seconds;
             seconds =  input.nextInt();
             int minutes;
       minutes = seconds/60;
       int remainedSeconds;
       remainedSeconds = seconds%60;
       int hours;
       hours = minutes/60;
       int remainingMinutes;
       remainingMinutes = minutes  % 60;
       System.out.println(hours + " hours");
        System.out.println(remainingMinutes +" minutes");
        
       System.out.println(remainedSeconds + "seconds");
      
       
	   }

}
