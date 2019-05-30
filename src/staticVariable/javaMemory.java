package staticVariable;

public class javaMemory {
	public static void main(String[] args) {
		String str1 ="apple";
		String str2 = "apple";
		String str3 = new String("apple");
		
		System.out.println(str1== str2);
		System.out.println(str1 == str3);
		
	}

}
