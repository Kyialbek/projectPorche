package StringBuilders;

import java.util.ArrayList;
import java.util.List;

public class ArrayRecap {
	public static void main(String[] args) {
		convertListToArray();
	}
	
	
	public static void convertListToArray() {
		String name = "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
		String name1 = cutTheLongWord(name, 10);
		
		List <Character> list = new ArrayList<>();
		
		for(int i =0; i<name.length(); i++) {
			list.add(name.charAt(i));
		}
		System.out.println(list);
		
	}
	
	
	public char[] convertToArray(List<Character>listOfChars) {
		char[] charArray = new char[listOfChars.size()];
		for(int i = 0; i<charArray.length; i++) {
			charArray [i] =listOfChars.get(i);
			
		}
		return charArray;
		
	}
	
	private static String cutTheLongWord(String name, int i) {
		String name1 = "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
		return name1;
	}
}
