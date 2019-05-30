package shapes;

public class circle extends shape{
	
	int radius;
	public circle() {
		super("circle");
	}

	public circle(int radius) {
		this();
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}
	
	public void draw() {
		System.out.println("Drawing circle with radius "+radius);
	}

}
