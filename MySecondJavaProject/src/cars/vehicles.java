package cars;

public class vehicles {
	
	protected static String nake;
	public vehicles() {
		System.out.println("Creating construcktors with no args");
	}
	
	public vehicles (String nake) {
		this();
		this.nake = nake;
		System.out.println("Created vehicle make "+ nake);
	}
	public vehicles(String nake, String message) {
		this(nake);
		System.out.println(message);
	}
	
	void drive() {
		System.out.println("Driving");
	}
	
	public static void stop() {
		
		System.out.println("Stopping");
	}

}
