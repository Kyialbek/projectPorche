package shapes;

public class triangle extends shape{
	int len1, len2, len3;

	public triangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (len2*len3*(Math.sin(len1)));
	}
	
	public void draw() {
		System.out.println("Drawing a triangle");
	}

}
