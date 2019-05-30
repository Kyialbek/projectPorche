package staticVariable;

public class staticObject {
	public static void main(String[] args) {
		
		student s1 = new student();
		s1.name = "James";
		student s2 =new student();
		s2.name = "John";
		System.out.println(s1.name +" "+ s2.name);
		student s3 = s1;
		System.out.println(s3.name);
		
		System.out.println("s1: " +s1.hashCode());
		System.out.println("s3: " +s3.hashCode());
		System.out.println("s2: " +s2.hashCode());
		s2 = s1;
		System.out.println(s1.hashCode()+ " "+s2.hashCode()+" "+ s3.hashCode());
		System.out.println("=======================================");
		
		method(s1);
	}
	public static void method (student s) {
		s = new student();
		s.name = "Sarah";
		System.out.println("s: " +s.hashCode());
	}

}
