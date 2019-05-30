package IfElseStatements;

import java.util.Random;
import java.util.Scanner;

public class SaimsTask {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	String songName;
	boolean valid, evenOdd = true;
System.out.println("Enter the name of your favourite song");
songName = input.nextLine();
if (songName.length() >= 10) {
	System.out.println(songName +" - songname");
	valid = true;
	
}
else {
	System.out.println("the song is not valid try again");
	valid = false;
	
}
if(valid) {
	
	int i = random.nextInt(15);
	i = i%2;
	if (i==0) {
		System.out.println(songName +" that's hit song");
		evenOdd= true;
	}
	else {
		System.out.println("okay song");
		evenOdd = false;
	}
	System.out.println(evenOdd);
	System.out.println("the number is "+i);
}
}
}

