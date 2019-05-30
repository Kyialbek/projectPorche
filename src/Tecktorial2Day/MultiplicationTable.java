package Tecktorial2Day;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	//int x,y;
	//for(x =2; x<=10; x++) {
//		for(y=1; y<=10; y++) {
		//	System.out.println(x+" x "+ y+" ="+ x*y);
		//}
	//}
	Scanner input = new Scanner(System.in);
	int arr[] = new int [10];
	int studentId;
	int count = 0;
	System.out.println("Please enter ther sudent id number");
	arr[0] = input.nextInt();
	for(int i = 1; i<=10; i ++) {
		for (int b=0; b<=i; b++) {
		System.out.println("Please enter ther sudent id number");
		studentId = input.nextInt();
		if (arr[b] == studentId) {
			b=0;
			System.out.println("Please enter another sudent id number");
			studentId = input.nextInt();
	
		
		}
		else if (arr[b] != studentId) {
			continue;
		}
		else if (b+1==i) {
			arr[i]=studentId;
		}
		}
	} 
		
	}
}

