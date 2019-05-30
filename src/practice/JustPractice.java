package practice;

public class JustPractice {
	public static void main(String[] args) {
		String FullMessage = "Sender:<Mike Smith>. From Number:[202-123-3456]."
				+"Message:{I love programing and problem solving} ";
	String sender = FullMessage.substring(FullMessage.indexOf("<")+1,FullMessage.indexOf(">"));
	System.out.println(sender);
	String fromNumber = FullMessage.substring(FullMessage.indexOf("[")+1,FullMessage.indexOf("]"));
	System.out.println(fromNumber);
	String message = FullMessage.substring(FullMessage.indexOf("{")+1,FullMessage.indexOf("}"));
	System.out.println(message);
	}

}
