package Map;

import java.util.HashMap;
import java.util.Map;

public class TaskMapRecap {
	public static void main(String[] args) {
		Map<String, Integer> s1 = new HashMap();
		s1.put("Tomato", 5);
		s1.put("Potato", 3);
		Map<String, Integer> s2 = new HashMap();
		s2.put("Corn", 10);	
		s2.put("Coke" , 3);
		printSimilarValues(s1,s2);
		//System.out.println((s1.get("Tomato").equals(s2.get("Corn"))));
		//System.out.println((s1.get("Potato").equals(s2.get("Coke"))));
		System.out.println(compareMyMaps(s1, s2));
		//System.out.println("My maps are equal: ");
		
	}
	public static boolean compareMyMaps(Map<String, Integer> firstMap, Map<String, Integer> secondMap) {
		return firstMap.equals(secondMap);
	}
	public static void printSimilarValues(Map <String, Integer> s1, Map<String, Integer> s2) {
		
		for(String val: s1.keySet()) {
			for(String second: s2.keySet()) {
				if(s1.get(val)==(s2.get(second))) {
					System.out.println(" The first map key: " +val+"\n the second map key "+second );
				}
				
			}
			
		}
	}

}
