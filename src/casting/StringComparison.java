package casting;

public class StringComparison {
	public static void main(String[] args) {
		//String s = "cartoon";
		//String s2 = "create";
		//int i = s.compareTo(s2);
		//System.out.println(i);
		String fullMessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		String name ="<Mike Smith>";
		String phoneNumber = "[202-123-3456]";
		String message ="{I love programming and problem solving}";
		name = name.replace("<", "").substring(0,name.indexOf(">")-1);
		phoneNumber =phoneNumber.replace("[", "").substring(0, phoneNumber.indexOf("]")-1);
		message = message.replace("{", "").substring(0, message.indexOf("}")-1);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(message);
	}

}

