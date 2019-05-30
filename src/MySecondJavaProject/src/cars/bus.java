package cars;

public class bus extends vehicles {
	String model;
	public bus(String nake, String model) {
		
		super.nake = nake;
		this.model = model;
		
	}
	public bus() {
		this("Toyota", "camry");
	}
	
	//@Override
	public static void stop() {
		
	}

}
