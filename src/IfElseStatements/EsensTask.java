package IfElseStatements;

import java.util.Scanner;

public class EsensTask {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
double a ;
double b;
System.out.println("please enter two different numbers");
a =input.nextDouble();
b =input.nextDouble();
String name ="calculating";
System.out.println("Please choose  one of these calculating methods :\n - plus, minus, multiplication, division ");
name = input.next();


  switch (name){
	case "plus":
		System.out.println( "the reslts of" +a +"plus"+b +"is" + (a+b));
		break; 
	case"minus":
		System.out.println(a-b);
		break;
	case "multiplication":
		System.out.println(a*b);
		break;
	case "division":
		System.out.println(a/b);
		break;
		default: 
			System.out.println("unknown command");
		
		
}
	}
}
