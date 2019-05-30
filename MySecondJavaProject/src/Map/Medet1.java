package Map;

import java.util.HashMap;
import java.util.Map;

public class Medet1 {
	public static Map<String, String> myMap(String name, String country){
		
	
	Map<String, String> man = new HashMap<> ();
	man.putIfAbsent(name, country);
	
	for(int i =0; i<man.size(); i++) {
		man.put(name, country);
	}
	
	return man;
}
	public static void main(String[] args) {
		Map<String, String> man = new HashMap<> ();
	man.put(null, "Bishkek");
	coutry("John", "Jalalabad");
//	man.put(null, "Osh");
//		man.put(null, "Osh");
//		man.put(null, "Osh");
	man.put("Medet", null);
	man.put("Aidina", null);
	man.put("Beck", null);
		man.put("Tansholpan", null);
	man.put("Chynar", null);
	//	man.putIfAbsent("Salamat", "Jalalabat");
//		man.containsKey("Medet");
//		System.out.println(man.get("Chynar")+ " is a good person from "+man.get("Bishkek"));
//		
//				
	}}


