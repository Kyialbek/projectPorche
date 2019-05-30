package STUDENT;

public class person {
	String name;
	int age;
	char gender;
	String job;
	int salary;
	public  void run(int miles) {
		System.out.println(name + " is running "+ miles+" miles");
	}
	  
	
	public void swim () {
		System.out.println(name+ " is swimming.");
	}
	public void personJobdetails() {
		
		System.out.println(name + " is working as "+ job +" and making "+salary);
	}

}
