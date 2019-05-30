package Map;


	import java.util.HashMap;
	import java.util.Map;

	public class MapsRecap {
		
		public static Map<String, String> country(String name, String country){
			Map<String, String> myMap=new HashMap<>();
			if(!myMap.containsKey(name)) {
				myMap.put(name, country);
				System.out.println(name+ "is a good person from " +country
						
						 );
			}
			return myMap;
		}
		
		public static void main(String[] args) {

			Map<String, String> store=new HashMap<>();
			store.putAll(country("John", "Denmark"));
			store.putAll(country("Aidina", "KG"));
			store.putAll(country("Ken", "Japan"));
			store.putAll(country("Brian", "Taiwan"));
			store.putAll(country("Gulya", "AZ"));
			store.putAll(country("Petro", "Ru"));
			
		

		Map<String, String> cr = new HashMap<> ();
		cr.putAll(store);
		System.out.println(store);
		}
	}


