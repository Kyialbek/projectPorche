package EraseOrArrays;

public class ArraysInt {
	public static void main(String[] args) {
		int[] number = new int[5];
		number[0]= 10;
		number [1] = 10;
		number [2] = 10;
		number [3] = 10;
		number [4] = 10;
		int sum = 0;
		for(int i = 0; i<number.length; i++) {
		sum = sum+number[i];}
		System.out.println(sum);
	}

}
