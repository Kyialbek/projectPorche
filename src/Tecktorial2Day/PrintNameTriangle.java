package Tecktorial2Day;

public class PrintNameTriangle {
	public static void main(String[] args) {
		String name = "Techtorial";
		for(int i = 1; i <= 1; i++) {
			for(int number = 0, length =name.length(); number <= length; number++, length-- ) {
				System.out.println(name.substring(number, length));
				for(int a=0; a<=number; a++) {
					System.out.print(" ");
				}
			}
		}
	}

}
