package IfElseStatements;

import java.util.Scanner;

public class EsensExample {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	String name;
	String status;
	boolean currentStudent;
	System.out.println("enter your name");
	name = input.nextLine();
	System.out.println(" r u a student currently? \n yes / no");
	status = input.nextLine();
	if (status.equals("yes")) {
		
currentStudent = true;
	}
	else
	currentStudent = false;
System.out.println("Name: " +name);
System.out.println("Current student: "+currentStudent);
if(currentStudent) {
	System.out.println(name + " you are Rock");
}
}
 
}

