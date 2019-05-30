package Loop;

public class Toria {
	public static void main(String[] args) {
		String name = "Techtorial";
		
		for(int a=0; a<=10; a++) {
			for(int number = 0, length = name.length(); number <=length; number ++, length--) {
				System.out.println(name.substring(number, length));
			}
			
		}
	}

}

