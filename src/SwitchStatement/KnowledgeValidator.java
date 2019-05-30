package SwitchStatement;

import java.util.Scanner;

public class KnowledgeValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String grade;
		System.out.println("enter the grade");
		grade = input.nextLine(); 
grade = grade.toUpperCase();
		switch (grade) {
	 case "A":
		 System.out.println("excellent");
	 break;
	 case "B":
		 System.out.println("not bad");
	 break;
	 case ("D"):
		 System.out.println("ok");
 break;
		 case ("F"):
			 System.out.println("fail");
		 break;
			 default:
				 System.out.println("invalid grade");
		}
		
	
	}

}
