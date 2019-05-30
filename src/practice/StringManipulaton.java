
package practice;

public class StringManipulaton {public static void main(String[] args) {
	String a = "$22.00";
	int b = 22;
	a =a .replace("$", "").substring(0,a.indexOf(".")-1);
	System.out.println(a);
	boolean check = true;
	if (a.equals(b) ) {
		check = true;
		
	}else {
		check =false;
	}
	System.out.println(check);
}
	
	
	
	
	 
	
	}
	


