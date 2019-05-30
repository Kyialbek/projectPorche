package interfaceExample;

public class iphone extends phone{

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("Location");
		
	}

	@Override
	public void capacity() {
		// TODO Auto-generated method stub
		System.out.println("Iphone's memory");
		
	}

	@Override
	void hi() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is saying hi");
		
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is locked");
		
	}

	@Override
	public void call(long number) {
		// TODO Auto-generated method stub
		System.out.println("Iphone is calling "+number);
		
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is texting");
		
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is taking picture");
		
	}

	@Override
	public String FaceId() {
		// TODO Auto-generated method stub
		return "my face";
	}
	

}
