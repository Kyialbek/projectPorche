package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList(5);
		
		ArrayList list1 = new ArrayList(10);
		
		ArrayList list2 = new ArrayList(list1);
		ArrayList <Integer>list3 = new ArrayList<Integer>();
		
		List animal=new ArrayList(); 
		
		animal.add("Dog");
		animal.add("cat");
		animal.add("bird");
		animal.add("elephant");
		animal.add(0,"eagle");
		animal.add(1, 123);
		animal.add(2, true);
		
		animal.add(3,Boolean.TRUE);
	//	Collections.sort(animal);
		
		System.out.println(animal);
		
		System.out.println(animal.get(1));
		for(int i=0; i < animal.size(); i++) {
			System.out.println(i+"Animal kind is "+animal.get(i));
			animal.remove("eagle");
			animal.remove(1);
			
			
		}
		System.out.println(animal);
		
		List advanced = new ArrayList();
		
		advanced.add("Aidina");
		advanced.add("Tolgonai");
		advanced.add("Beck");
		advanced.add("Tansholpan");
		advanced.add("Chynar");
		
		advanced.remove(0);
		advanced.remove("Aidina");
		advanced.set(0, "Kiki");
		System.out.println(advanced);
		System.out.println(advanced.size());
		System.out.println(advanced.isEmpty());
		
		List yo = new ArrayList();
		 yo = advanced;
		 System.out.println(yo);
		 
		 List groceryItems = new ArrayList();
		 
		 groceryItems.add("romato");
		 groceryItems.add("Potato");
		 groceryItems.add("Onion");
		 
		 groceryItems.set(0, "Tomato");
		//Collections.sort(groceryItems);
		 System.out.println(groceryItems);
		// groceryItems.clear();
		 System.out.println(groceryItems.isEmpty());
		 System.out.println(groceryItems.contains("Tomato"));
		 System.out.println(groceryItems.contains("Corn"));
		// 
		 
		 List <String> animal1=new ArrayList(10); 
			
			animal1.add("Dog");
			animal1.add("cat");
			animal1.add("bird");
			animal1.add("elephant");
			animal1.add(0,"eagle");
			
		//	String  [] = str = animal1.toArray(new String[2]);
			
			String [] application = { "Instagram", "Twitter", "facebook", "VK"};
			List <String> phoneApplication = Arrays.asList(application);
			
			System.out.println(phoneApplication.get(0));
			
			phoneApplication.set(0, "OK");
			System.out.println(phoneApplication);
		//	System.out.println(phoneApplication.sort());
			
			List <Integer> nm = new ArrayList<>();
			
			nm.add(11);
			nm.add(12);
			nm.add(23);
			nm.add(44);
			nm.add(100);
			
			
			Collections.sort(nm);
		System.out.println(nm);
		
		 
		
		
	}

}
