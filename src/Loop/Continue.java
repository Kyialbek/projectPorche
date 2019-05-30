package Loop;

public class Continue {
public static void main(String[] args) {
	for( int i = 0; i <= 50; i++) {
	
		//if (i==3 || i ==13 || i ==23 || i == 33||  i == 43) {
		//if(i%10==3) {
		String s = i+"";
		if(s.endsWith("3")) { 
			continue;
		}
		System.out.println(i);
	}
}
}
