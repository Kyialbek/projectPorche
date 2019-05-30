package ClassOrMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Repeat4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.println("enter your e-mail adress");
String str = input.nextLine();
String[] str2 = str.split("@");
System.out.println("id: "+str2[0]);
System.out.println("domain: "+str2[1]);
}
}
