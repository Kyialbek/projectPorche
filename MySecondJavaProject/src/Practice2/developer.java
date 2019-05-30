package Practice2;

public class developer extends scrumTeam{
	
	String position ="Java Developer";
	
	@Override
	public void work() {
		System.out.println(position +" is developing Application");
	}
	@Override
	public Integer calculateSalary(int hours) {
		return hours*getSalary();
	}

}
