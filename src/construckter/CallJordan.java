package construckter;

public class CallJordan {
	public static void main(String[] args) {
		Jordan person = new Jordan();
		Jordan person2 = new Jordan(34);
		Jordan person3 = new Jordan("Good", 11, "Music", "Box");
		Jordan person4 = new Jordan("Ash", "white", "aitmatov");
	
		System.out.println(person3);	
	}
	

}
