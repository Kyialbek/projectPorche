
package StringBuilders;

public class stringBuilders1 {
	public static void main(String[] args) {
		String alf ="";
		for(char character = 'a'; character>='z'; character ++ ) {
		
		alf+=character;
		}
		System.out.println(alf);
		Car1 k = new Car1();
		StringBuilder bb = new StringBuilder("Key to success");
		bb.append(" self study ");
		bb.append(" hard work");  
		bb.append(" repeat ");
		StringBuilder bro = bb.append("working har is not the way to be seccessfull");
		System.out.println(bb );
		System.out.println(bro);
		
		StringBuilder performance = new StringBuilder("Extraordinary ");
		StringBuilder success = performance.append("working");
		success =success.append(" hard on java").append(" in 2019");
		System.out.println(performance);
		System.out.println(success);
		
		
		StringBuilder location = new StringBuilder("Deslpaines");
		
		char name = location.charAt(2);
		
		int number =location.indexOf("P");
		
		int length = location.length();
		
		
		String str = location.substring(2, 5);
		
		
		StringBuilder car = new StringBuilder ("toyota");
		
		car.append(2019);
		
		
		StringBuilder state = new StringBuilder("California 66");
		state.delete(11, 13);
		System.out.println(state);
		String state3 ="Illinoi s";
		for(int x =state3.length()-1; x>=0; x--) {
		//	int r=state3.charAt(x);
			
			System.out.print(state3.charAt(x));
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
