package Practice2;

public class scrumTeam {
	 private String ID;
	   private String position = "Team scrum member";
	   private int salary;



	   public static String company = "Google";
	   public static final String CITY;
	   static {
	       CITY="Silicon Valley";
	       System.out.println("Scrum team class static block");
	       System.out.println(company);
	   }
	   {
	       System.out.println("Scrum team instatnce block");
	   }
	   public scrumTeam(){
	       System.out.println("Scrum team constructor");
	   }
	   public void work() {
		   System.out.println("Scrum team in the 5th sprint");
	   }
	   public Number calculateSalary(int hours) {
		   return hours*salary;
	   }
	   public String getID() {
	       return ID;
	   }

	   public void setID(String ID) {
	       this.ID = ID;
	   }

	   public String getPosition() {
	       return position;
	   }

	   public void setPosition(String position) {
	       this.position = position;
	   }

	   public int getSalary() {
	       return salary;
	   }

	   public void setSalary(int salary) {
	       this.salary = salary;
	   }

	}