package Practice2;

public class SDET extends scrumTeam{
	
	String position ="Java SDET";
	
	@Override
	public void work() {
		System.out.println(position +" is building automation script");
	}
	static {
		System.out.println("Static block of SDET class");
	}
	{
		System.out.println("Instance block of SDET class");
	}
	public SDET() {
		System.out.println("Construcktor if SDET class");
	}

}
