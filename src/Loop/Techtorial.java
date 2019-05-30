package Loop;

public class Techtorial {
	public static void main(String[] args) {
		String  name  = "Starbucks";
	
		for( int length = name.length(); 0<=length; length--) {
			System.out.println(name.substring(0, length));
		}
	}

}
