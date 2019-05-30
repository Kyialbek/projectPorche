package casting;

public class CharValue {
	public static void main(String[] args) {
		String s ="Published on feb 12, 2018";
		int indexOfComma = s.indexOf(",");
		s =s.substring(indexOfComma+2);
		System.out.println(s);
		int year = Integer.valueOf(s);
		
		if(year <= 2019) {
			System.out.println("Valid year");
		}else {
			System.out.println("Invalid year");
		}
	}

}
