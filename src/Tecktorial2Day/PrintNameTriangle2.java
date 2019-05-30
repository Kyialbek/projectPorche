package Tecktorial2Day;

public class PrintNameTriangle2 {
	public static void main(String[] args) {
		String name = "Cybertek";
		for(int i=0; i<=5; i++) {
			for(int number = 0, length=name.length(); number<=length; number ++, length--) {
				System.out.println(name.substring(number, length));
				
			}
		}
	}

}
