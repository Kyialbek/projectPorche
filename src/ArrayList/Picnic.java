package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Picnic {
	//public class Picnic {
		   public static void main(String[] args) {
		       Scanner input = new Scanner(System.in);
		       ArrayList<String>name=new ArrayList<>();
		       System.out.println("Welcome to the picnic list:");
		       for(;;){

		           System.out.println("0 => add name, 1 => remove, 2 => replace, 3 =>finish");
		           int in=input.nextInt();
		           if (in == 3) {
		               break;
		           }
		           if (in==0){
		               for (int i=0;i<2;i++){
		               String na=input.nextLine();
		               name.add(na);
		           }}
		           if (in==1){
		               for (int i=0;i<2;i++){
		               name.remove(input.nextLine());}}

		           if (in == 2) {
		               for (int i = 0; i < 1; i++) {
		                   System.out.println("first enter index then new name");
		                   name.set(input.nextInt(),input.nextLine());
		               }}
		       }

		           Collections.sort(name);
		           System.out.println(name);





		   }
		}


