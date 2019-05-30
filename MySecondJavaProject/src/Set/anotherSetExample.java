package Set;

import java.util.HashSet;
import java.util.Set;

public class anotherSetExample {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet <>();
		Set<String> set2 = new HashSet <>();
		 set1.add("cat");
		 set1.add("horse");
		 set1.add("dog");
		 set1.add("fish");
		 set2.addAll(set1);
		 System.out.println(set2);
		set1.clear();
		 int count = 0;
		 
		 for(String i: set2) {
			 count++;
			// if(set1.equals(set2)) {
				// set1.removeAll(set1);
				 System.out.println(count+i);
				 
				 
			 }
		 }
		 
		
		
		
		
	
	

}
