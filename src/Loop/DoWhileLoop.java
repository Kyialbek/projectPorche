package Loop;

public class DoWhileLoop {
public static void main(String[] args) {
	String name = "Techtorial";
	int length = name.length();
	do {
		System.out.println(name.substring(0, length));
		length --;
		
	}while (0<=length); 
		
	}
}

