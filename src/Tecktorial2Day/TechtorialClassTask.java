package Tecktorial2Day;

import java.util.Scanner;

public class TechtorialClassTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String space = "";
		
		//for(int i= 1; i<=1; i++) {
			for(int number = 0, length = name.length(); number<=length; number++, length--) {
				space+=" ";
				System.out.println(space+name.substring(number, length));
				
					
				}
				
			}
		}
	

//}
