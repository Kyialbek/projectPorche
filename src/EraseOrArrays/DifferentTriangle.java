package EraseOrArrays;

public class DifferentTriangle {
public static void main(String[] args) {
	
	for(int i=0; i<=8; i++) {
		for(int x=7; x>=i; x--) {
			System.out.print(" ");
		}
		for(int y=1; y<=i; y++) {
			System.out.print("*");
		}
		
		for(int y=0; y<=i; y++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	
//	String a="*";
//	String name = "***************";
//	String space ="";
//	System.out.println(a);
//	for(int num =0, length=name.length();num<=length/2; num++) {
//		space +=" ";
//		System.out.println(space+name.substring(length/2-num, length/2+num ));
//			}
}
}
