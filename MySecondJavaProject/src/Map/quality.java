package Map;

import java.util.HashMap;
import java.util.Map;

public class quality {
	public static void main(String[] args) {
	Map <String, String> qualityOfPerson = new HashMap<> ();
		
		qualityOfPerson.put("Aidina", "smart");
		qualityOfPerson.put("Tolgonai", "kind");
		qualityOfPerson.put("Beck", "hardworker");
		
	//	System.out.println(qualityOfPerson);
		qualityOfPerson.putIfAbsent("Aidina", "stupid");
		System.out.println(qualityOfPerson);
		
		Map<String, String> copyOfQuality = new HashMap<> ();
		copyOfQuality.putAll(qualityOfPerson);
		for(int i = 0; i<copyOfQuality.size(); i ++) {
		System.out.println(copyOfQuality.get(i));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// my map variable called
		
		 // name of map is qualityOfPerson
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
