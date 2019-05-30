package STUDENT;

public class Student {
	String name;
	int age;
	int grade;
	int score;
	String lecture;
	
	 public void calculateScore(int exam1, int exam2, int exam3) {
		 int totalScore =exam1+exam2+exam3;
		  
		 int average = totalScore/3;
		 
		 if(average >= 70) {
			 
			 System.out.println("The is able to go to the next semester");
		 } else if(average >=50 && average < 70) {
			 System.out.println("The sudent is able to go the next semester but with less credit");
			 
		 }else {
			 System.out.println("The student is failed go to the next semester");
		 }
	 }

}
