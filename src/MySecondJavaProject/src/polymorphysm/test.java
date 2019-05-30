package polymorphysm;

public class test {
	public static void main(String[] args) {
		
		human h = new boy();
		h.eat();
		((men)h).feed();
		((men)h).shave();
		
		
		human h2 = new men();
		//h2.eat();
		//((boy)h2).feed();
		
		men m = new boy();
		m.shave();
		m.eat();
		m.feed();
	}

}
