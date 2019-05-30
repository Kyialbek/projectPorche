package cars;

public class garage {
	public static void main(String[] args) {
		vehicles v1 = new vehicles() ;
			v1.drive();
			v1.nake = "toyota";
			
			cars c1 = new cars();
			c1.drive();
			c1.nake = "Tesla";
			c1.stop();
			
			vehicles v2  = new vehicles("Toyota", "Brand new");
			System.out.println("==========================================================");
			
			cars c2 = new cars("Range Rover", "My car");
			
			
			
		
	}

}
