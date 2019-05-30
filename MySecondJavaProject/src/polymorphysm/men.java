package polymorphysm;

public class men  extends human implements dad{
	
	@Override
	public void feed() {
		System.out.println("Man is feeding");
	}
	
	public void shave() {
		System.out.println("Man is shaving");
	}

}
