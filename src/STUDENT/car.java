package STUDENT;

import java.util.Arrays;

public class car {
	String make;
	String model;
	int year;
	double currentSpeed;
	boolean isRunning;
	
	public void start( ) {
		isRunning = true;
	}

	public void stop( ) {
		isRunning = false;
	}
	public void accelerate(int speed) {
		for(double i = currentSpeed; i<=speed; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		currentSpeed = speed;
		
	}
	public void slowdown(int speed) {
		for(double i = currentSpeed; i>=speed; i++) {
			System.out.print(i+" ");
		}
		
	}
	public String getCarInfo() {
	return make+" "+model+" "+year;
	}
	public void getDirection(String direction, String direction1, String direction3) {
		System.out.println("turning "+direction);
		System.out.println("Turning "+direction1);
		System.out.println("Truning "+direction3);
		
		
		
	}
	public long getTotalDistance(long[] distances) {
		long sum = 0;
		for( long d: distances) {
			sum+=d;
		}
		return sum;
		
	}
	public long getMaxdistance(long [] distances) {
		Arrays.sort(distances);
		return distances[distances.length-1];
		
	}
	public long[] removeLongestDistance(long[] distances) {
		Arrays.sort(distances);
		long[] newArray = new long[distances.length-2];
		
		for(int i = 1, count=0; i<distances.length-1; i++ ,count++){
		newArray[count] = distances[i];
	}
		return newArray;
}
} 
	
