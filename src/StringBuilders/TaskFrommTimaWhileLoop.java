package StringBuilders;

public class TaskFrommTimaWhileLoop {
	public static void main(String[] args) {
        cutTheLongWord(12, "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun");
    }
    public static  String cutTheLongWord (int num, String name) {
          
         String result= " ";
    // String name= "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";//47
      //  System.out.println(name.length());
       int count=0;
      if (name.length()>num) {
        while (name.length()>=num) {
        name=name.substring(0,name.length()-1);
          count++;
   }
             System.out.println( name + ", and we iterated for " + count + " times") ;
             return name;
//store every remaining char of the string to a list and convert the list to array
// print out array without using loops
           }
      return "Sorry number is too big" ;
      
    }
    //public void remainderList(String name) {
    
    	
    	
    	
  //  }
}
