package practice;

import java.util.Scanner;

public class NewProjectYesterday {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str2;
		System.out.println("enter the word");
		str2 = input.nextLine() .trim().toLowerCase();
		int length = str2.length();
		int index = length-1;
		int calculator = length%2;
		int middle;
		int middle2;
		char middleLetter;
		char middLetter2;
		String convert;
		String convert2;
		String adder;
		String adder2;
		
		if(calculator == 0) {
			middle=index/2;
			middle2 = middle+1;
			middleLetter =str2.charAt(middle);
			middLetter2 = str2.charAt(middle2);
			convert = middleLetter+"";
			convert2 = middLetter2+"";
			convert = convert.toUpperCase();
			convert2 = convert2.toUpperCase();
			adder = str2.substring(0, middle);
			adder2 = str2.substring(middle2+1);
			System.out.println(adder + convert +convert2 + adder2);
			
			
			
			
		} else {
			middle=index/2;
			middleLetter =str2.charAt(middle);
			convert = middleLetter+"";
			convert = convert.toUpperCase();
			adder = str2.substring(0, middle );
			adder2 = str2.substring(middle+1);
			System.out.println(adder + convert + adder2);
		}
	}

}
