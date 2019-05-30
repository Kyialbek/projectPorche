package Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
	public static void main (String [] args) {
		Map< String, Integer> mapOfGroceries = new HashMap<> ();
		 
		mapOfGroceries.put("orange", 2);
		mapOfGroceries.put("onion", 1);
		mapOfGroceries.put("tomato", 1);
		mapOfGroceries.put("potato", 2);
		mapOfGroceries.put("carrot", 1);
		mapOfGroceries.put("cabbage", 3);
		mapOfGroceries.put("cucumber", 5);
		mapOfGroceries.put("apple", 3);
		mapOfGroceries.put("melon", 9);
		mapOfGroceries.put("mushroom", 6);
		
		System.out.println(mapOfGroceries +" price");
		
		mapOfGroceries.remove("melon");
		System.out.println(mapOfGroceries +"alredy found");
		
		System.out.println("I did not find " + mapOfGroceries.get("orange")+ " i will find from next grocery");
		
		System.out.println(mapOfGroceries.keySet());
		System.out.println(mapOfGroceries.values());
		
		Map <String, String> qualityOfPerson = new HashMap<> ();
		
		qualityOfPerson.put("Aidina", "smart");
		qualityOfPerson.put("Tolgonai", "kind");
		qualityOfPerson.put("Beck", "hardworker");
		
		System.out.println(qualityOfPerson);
		//System.out.println(qualityOfPerson +" and"+ qualityOfPerson);
		
	}

}
