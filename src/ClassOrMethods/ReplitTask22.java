package ClassOrMethods;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Spring;

public class ReplitTask22 {
	public static void main(String[] args) {
		
	 String[] arr = {"one", "two", "three", "four"};
	 String[] arr2= new String[arr.length];
	 int count = 0;
	 
	 for (int i =0; i<arr.length; i++) {
		 if(arr[i].contains("e")) {
			 arr2[count++] = arr[i];
			 
			 
			 
		 }
		
		
		System.out.println(Arrays.toString(arr2));// }
	 }
	} 

}
