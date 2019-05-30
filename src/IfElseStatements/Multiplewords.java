package IfElseStatements;

import java.util.Scanner;

public class Multiplewords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		boolean areThey;
		System.out.println("please enter the word(s)");
		word = input.nextLine();
		word = word.trim();
		if(word.contains(" ")) {
		areThey = true;
		} else {
			areThey = false;
		}
		System.out.println("multiple words: "+ areThey);
		}

}
