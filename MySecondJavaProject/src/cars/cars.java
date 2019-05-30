package cars;

public class cars extends vehicles {
	
	public void accelarate() {
		System.out.println("car is accelarating");
	}
	@Override
	public void drive() {
		System.out.println("car is driving");
	}
	
	public cars(String nake, String message) {
		super(nake, message);
		System.out.println("This construcktor is coming from cars class");
	}
	public cars() {
		super();
	}
	//@Override
	//public void drive() {
	//	System.out.println("car drives fast");
		
	//}

}
