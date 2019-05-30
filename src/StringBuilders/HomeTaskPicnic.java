package StringBuilders;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTaskPicnic {
	public static void main(String[] args) {
		//Muammer [10:37 PM]
				// Create the application for picnic organization.
				       // if person wanna come to picnic ad his/her name to the list
				       // after adding person to the list if he/she doesn’t wanna come anymore delete person from list.
				       // if you wanna replace the person with another person you should be able to replace the person from list.
				       // If you wanna see the all list. You should be able to print all of them.
				       // if you wanna check the person is coming to the picnic or not
				       // Sort the persons with alphabetical order

				       //0 - add
				       //1 - remove 
		// Your code here;
		
		Scanner input = new Scanner (System.in);
		ArrayList <String> picnic = new ArrayList();
		int count = 0;
		for(int i = 0; i<3; i++) {
			
		System.out.println("Do you want to come to the picnic? y/n");
			 String answer = input.nextLine();
			 if(answer.equals("y")) {
				 count ++;
				 System.out.println("Enter your name" );
				picnic.add(input.next());
				System.out.println("Does the person want to come to picnic again y/n");
				
				if()
			 }
			 else {
				continue;
			 }
			
			
		}
		System.out.println(picnic);
		
		if()
		
	}

}
