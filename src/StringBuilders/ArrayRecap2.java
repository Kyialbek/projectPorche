package StringBuilders;

import java.util.ArrayList;

public class ArrayRecap2 {
	public static void main(String[] args) {
		
		
		
		        List<Character> listWithChars = getSom();

		        ArrayRecap arRe = new ArrayRecap();

		        char[] c = arRe.convertToArray(listWithChars);

		        
		        System.out.println(“This is char array: ” + Arrays.toString(c));
		    }

		    public static List<Character> getSom() {
		        String name = “WeHaveBeen”;
		        String name1 = cutTheLongWord(name, 10);
		        List<Character> list = new ArrayList<>();
		        for (int i = 0; i < name1.length(); i++) {
		            list.add(name1.charAt(i));
		        }
		        System.out.println(“This is list: ” + list);
		        return list;

		    }

		    public char[] convertToArray(List<Character> listOfChars) {
		        char[] charArray = new char[listOfChars.size()];
		        for (int i = 0; i < charArray.length; i++) {
		            charArray[i] = listOfChars.get(i);
		        }
		        return charArray;

		    }

		    private static String cutTheLongWord(String name, int i) {

		        String name1 = “WeHaveBeen”;
		        return name1;

		    }

		}

		Message Input


		Message Medet