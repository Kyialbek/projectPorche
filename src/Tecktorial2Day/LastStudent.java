package Tecktorial2Day;

import java.util.Scanner;

public class LastStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ListOfNames = "";
		do {
			System.out.println("Please enter your name");
			String name = input.nextLine();
			System.out.println("Are you the last student?");
			String answer =input.nextLine();
			ListOfNames = ListOfNames+name;
			if(answer.equals("yes")) {
				System.out.println(ListOfNames);
			}
			}while(true);
			
		}
		}
	
	


