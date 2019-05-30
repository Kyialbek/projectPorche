package EraseOrArrays;

import java.util.Scanner;

public class MuammarsTsk {
	public static void main(String[] args) {
		
		String [] stringName = new String[6];
				Scanner input = new Scanner(System.in);
				for(int i=1; i<=6; i++) {
				
				System.out.println("Please enter the name of the product "+i +" product");
				stringName[i] =input.nextLine();
			
				
				
				
				}
				for(int j=1; j <=6; j++) {
					System.out.println(stringName[j]+" "+j);
				}
	}

	
}
