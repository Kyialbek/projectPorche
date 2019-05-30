package encapsulation;

public class hr {
	public static void main(String[] args) {
		employee mp = new employee();
		mp.setGender("Female");
		mp.setName("Arya");
		mp.setLastName("Stark");
		
		System.out.println(mp.getName());
		System.out.println(mp.getLastName());
		System.out.println(mp.getGender());
	}

}
