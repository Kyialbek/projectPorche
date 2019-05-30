package ClassOrMethods;

public class Repeating2 {
	public static void main(String[] args) {
		String space = "";
		for(int i=0; i<=5; i++) {
			for(int j =0; j<=i; j++) {
				
				
				space = " ";
				System.out.print(space+"*");
			}
			System.out.println();
		}
	}

}
