package construckter;

public class Construcktor1 {
	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers [0] = 2;
		numbers [1] = 3;
		numbers [2] = 43;
		numbers [3] = 12;
		numbers [4] = 5;
		
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum +=numbers[i];
			
			
		}
		System.out.println(sum);
	}
}
