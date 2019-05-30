package shapes;

public abstract class shape extends superShape {
	
	String name;
	double area;
	
	
	public abstract double calculateArea();
	
	public void draw() {
		
	}
	public shape(String name) {
		this.name =name;
		
		triangle t = new triangle("triangle");
		t.draw();
		t.len1 = 5;
		t.len2 =4;
		t.len3 = 3;
		
		System.out.println( "Drawing a triangle.");
	}

	
	

}
