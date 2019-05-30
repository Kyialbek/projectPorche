package staticVariable;

public class statickBlock {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public statickBlock(){
		System.out.println("3");
		
	}
	static {
		System.out.println("4");
	}
	{
		System.out.println("5");
	}

}
