package EraseOrArrays;
import java.util.Arrays;
public class Tricky {
public static void main(String[] args) {
	String [] game =new String[4];
	game[0] = "soccer";
	game[1] = "tennis";
	game[2] = "basketball";
	game[3] = "valleyball";
	
	String [] fun = game;
	System.out.println(Arrays.toString(fun));
}
}
