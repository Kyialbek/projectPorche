package flyable;

public class plane implements flyable, sound{

	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		System.out.println("noisy");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly like a plane");
		
	}

}
