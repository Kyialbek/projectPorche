package interfaceExample;

public class test {
	public static void main(String[] args) {
		iphone ip = new iphone();
		
		ip.call(3128378552l);
		ip.FaceId();
		ip.hi();
		ip.location();
		
		
		samsung sam = new samsung();
		System.out.println(sam.FaceId());
		sam.location();
		sam.capacity();
		
		
		System.out.println("=======================================================================================");
		
		memory m1 = new iphone();
		m1.FaceId();
		System.out.println(((phone)m1).memory);
		
	}

}
