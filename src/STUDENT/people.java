package STUDENT;

public class people {
	public static void main(String[] args) {
		
		person p1 = new person();
		
		p1.name = "Shon";
		
		p1.age = 30;
		p1.gender = 'm';
		 p1.job = "Sdet";
		 p1.salary = 130000;
		 
		 p1.run(10);
		 p1.swim();
		 p1.personJobdetails();
		 
		 System.out.println("=============== SECOND OBJECT============");
		 person p2 = new person();
		 
		 
		 p2.name = "Tima";
		 p2.age = 25;
		 p2.gender = 'M';
		 p2.job = "Developer";
		 p2.salary = 135000;
		 
		 p2.personJobdetails();
		 p2.swim();
		 p2.run(20);
		 
		 System.out.println(p2.name+ p1.name+" are working together");
		
	}

}
