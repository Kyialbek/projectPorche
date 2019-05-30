package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExample {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet();
		
		set.add(22);
		set.add(22);
		set.add(22);
		set.add(22);
		System.out.println(set);
		
		List<Integer> yo = new ArrayList<>();
		
		yo.add(1000);
		yo.add(1000);
		yo.add(1000);
		yo.add(1000);
		System.out.println(yo);
		
		Set<String> ue = new HashSet<>();
		ue.add("Hello Java");
		if(ue.add("Hello Java")) {
			System.out.println("Succes the new data added in your lis");
		}
		else {
			System.out.println("Sorry");
			yo.removeAll(yo);
			System.out.println(yo);
		}
				
	
	
	}

}
