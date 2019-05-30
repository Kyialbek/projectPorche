package TernaryOperator;

public class ternaty2 {
	public static void main(String[] args) {
		
	
	String conversation = " In today’s world,d dddd d d d d d d d d d d  d d d d d d d d  d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d  d d reading is basic to everyday life. As children we learn to read, and as adults, we read to learn. We read to learn about the news, to learn about rules, and to learn about how to do things. We also use reading to learn English." ; 
	//String result = conversation.split(" ").length>100 ? new ArrayUtils().arrayHelper(conversation.split(" ")): "It is a short conversation";
	//if(conversation.length()>100) {
		new ArrayUtils().arrayHelper(conversation.split(" "));
	//	System.out.println("in if statement");
//	}else {
		//System.out.println("in else statement");
	//}
		String result = conversation.split(" ").length>100 ? new ArrayUtils().arrayHelper(conversation.split(" ")): "It is a short conversation";
	
	System.out.println(result);
	}
	
}
