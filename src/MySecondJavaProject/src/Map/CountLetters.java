package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLetters {
	public static void main(String[] args) {
		//List<String> str = new ArrayList<> ();
		 //str.add("Eraliev");
		 
		String str = "eeeeraliev".toLowerCase();
		//for(int i = 0; i< str.)
		Map <Character, Integer> map = new HashMap <>();
		
		for(int i =0; i<str.length(); i++) {
			if(!map.containsKey(i)) {
				map.put(str.charAt(i), 1);
				}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i)+1));
				System.out.println("Hi");
			}

		}
		System.out.println(map);
		}}
