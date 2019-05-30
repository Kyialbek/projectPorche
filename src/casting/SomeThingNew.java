package casting;

public class SomeThingNew {
	public static void main(String[] args) {
		int age = 45;
		double b = (int)age;
		System.out.println(b);
		int a = 65;
		char w =(char)a;
		System.out.println(w); // it came from ascii table
		char lls = 'v';
		int kll = lls;
		System.out.println(kll);
		String se ="500";
		int i = Integer.valueOf(se);
		System.out.println(i);
	}

}
