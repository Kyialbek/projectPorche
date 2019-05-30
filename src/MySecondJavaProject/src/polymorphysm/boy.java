package polymorphysm;

public class boy extends men{
	
	public void drive() {
		System.out.println("Boy is driving");
	}
	@Override
	public void feed() {
		System.out.println("Boy is feeding");
	}

}
