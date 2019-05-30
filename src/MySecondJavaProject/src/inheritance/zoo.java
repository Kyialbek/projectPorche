package inheritance;

public class zoo {
	public static void main(String[] args) {
		
		
		cat c1 = new cat();
		c1.eat();
		
		domesticAnimals dAn = new domesticAnimals();
		dAn.eat();
		wildAnimals w = new wildAnimals();
		w.eat();
		
	}

}
