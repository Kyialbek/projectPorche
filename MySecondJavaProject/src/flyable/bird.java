package flyable;

public class bird implements flyable, sound {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" Fly like bird");
		
	}

	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		System.out.println("quack quack");
		
	}
	

}
