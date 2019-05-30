package WrapperClasses;

public class Warpper {
	public static void main(String[] args) {
		Integer in = new Integer(10);
		
		long ln = new Long(40);
		
		char ch = new Character('F');
		
		boolean bl = new Boolean(true);
		System.out.println(in);
		System.out.println(ch);
		System.out.println(bl);
		System.out.println(ln);
		
		boolean a = true;
		Boolean a1 = a;
		System.out.println(a1);
		
		String name = "Jack";
		
		String nmbr = "12345";
		int convertString = Integer.parseInt(nmbr);
		
		
		System.out.println(convertString+10);
		System.out.println(nmbr+10);
		
		boolean blean = Boolean.parseBoolean("True");
		
		boolean bln1 = Boolean.parseBoolean("10");
		
		System.out.println(blean);
		System.out.println(bln1);
		  
		String num1 = "True"; 
		Boolean num = Boolean.valueOf(num1);
		System.out.println(num);
		
		String number4 = "12345";
		Integer num3 = Integer.valueOf(number4);
		
		int kl = 10;
		System.out.println(num3);
		String doubl = "3.14";
		
		Double d = Double.valueOf(doubl);
		
		double c = Double.parseDouble(doubl);
		System.out.println(c);
		
		System.out.println(d);
		
		String  x = "False";
		
		boolean x1 = Boolean.parseBoolean(x);
		Boolean x2 = Boolean.valueOf(x);
		System.out.println(x1+ " "+x2);
		
		Integer nullvalue = null;
		System.out.println(nullvalue);
		
		
		
		
		
		
		
	}
	

}
