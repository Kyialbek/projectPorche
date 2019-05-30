package memoryHashAndStack;

import java.util.Scanner;

public class totalNunOfBooks {
	Scanner input = new Scanner(System.in);
	static int total = 1000;
	int book = 0;
	public void minus() {
		System.out.println("how many books do toy want?");
		book = input.nextInt();
		total-=book;
		System.out.println(total);
	}
	public void plus() {
		System.out.println("How many books do you bring");
		book = input.nextInt();
		total += book;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		totalNunOfBooks test1 = new totalNunOfBooks();
		test1.minus();
		test1.plus();
	}

}
