package casting;

public class PrimitiveCasting {
	public static void main(String[] args) {
		short s = 4;
				
		int age = s;
		System.out.println(age);
		int size = age;
		System.out.println(size);
		byte b = (byte)size;
		System.out.println(b);
		String str = "0.81";
		double d = Double.valueOf(str);
		System.out.println(d +1);
		String kk = "0.81";
		System.out.println(kk+5);  
	}
  
}
