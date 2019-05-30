package SwitchStatement;

import java.util.Scanner;

public class Blablablabla {
public static void main(String[] args) {
Scanner input =new Scanner(System.in);
int age;
System.out.println("please enter your age");
age = input.nextInt();
if(age >= 0 && age<= 120) {
 
	switch (age) {
 case(16):
	 System.out.println("almost done with high school");
 break;
 case (24):
	 System.out.println("Almost done with university");
 break;
	 default:
		 System.out.println("Keep living");
 }
}
else {
	System.out.println("Invalid age");

}
}}
