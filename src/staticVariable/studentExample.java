package staticVariable;

import javax.swing.text.ChangedCharSetException;

public class studentExample {
	public static void main(String[] args) {
		student s1= new student();
		student s2 = new student();
		
		s1.name = "John";
		s2.name = "Jack";
		
		System.out.println("s1: " +s1.name);
		System.out.println( "s2: " +s2.name);
		
		
		System.out.println(s1.name);
		
		
		s1.study();
		s1.name = "David";
		s2.study(5);
		s2.study("Java assignment (combineArrays)");
	}

}
