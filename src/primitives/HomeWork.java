package primitives;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName;
		String passWord;
		System.out.println("Please enter the username?  " );
		userName = input.nextLine();
		System.out.println(userName);
		System.out.println("Please enter the password");
		passWord = input.nextLine();
		System.out.println(passWord);
		System.out.println("Profile    " + "Pictures   " +"Videos");
		System.out.println("Posts    " + "  Likes    " + "Comments  ");
		System.out.println("Products   "+ "Orders    " +"Feedback");
	}

}
