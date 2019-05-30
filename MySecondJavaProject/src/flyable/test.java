package flyable;

public class test extends Object {
	public static void main(String[] args) {
		bird b = new bird();
		b.fly();
		b.sounds();
		System.out.println(b.WINCOUT);
		System.out.println(b.TAILCOUNT);
	}
	@Override
	public String toString() {
		return "bird class";
	}

}
