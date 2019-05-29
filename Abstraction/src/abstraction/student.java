package abstraction;

public abstract class student {
	
	int studentID;
	String name;
	
	public void study() {
		System.out.println("Studying");
	}
	
	public abstract void attendClass();

}
