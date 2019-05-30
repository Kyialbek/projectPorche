package Map;

import java.util.HashMap;
import java.util.Map;

public class MAP1 {
	public static void main(String[] args) {
		
		Map <String, String>  mapOfString = new HashMap<>();
		mapOfString.put("Bek", "Student");
		mapOfString.put("Tolgonai", "Student");
		mapOfString.put("Kyialbek", "Student");
		mapOfString.put("Arslan", "Mentor");
		System.out.println(mapOfString);
		System.out.println(mapOfString.get("Kyialbek"));
				
		
	}

}
