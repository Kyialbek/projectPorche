package STUDENT;

public class cars {
	public static void main(String[] args) {
		car c1 =new car();
		c1.model ="toyota";
		c1.make = "camry";
		c1.year = 2007;
		c1.currentSpeed = 55;
		
		c1.start();
		c1.accelerate(65);
		c1.slowdown(50);
		System.out.println(c1.getCarInfo());
		c1.getDirection("rigth", "left", "right");
		long[] distances = {2,5,22,66,8,1};
		c1.getTotalDistance(distances);
		
		System.out.println(c1.getTotalDistance(distances));
		System.out.println(c1.getMaxdistance(distances));
		
		
		long[] newDistances = c1.removeLongestDistance(distances);
		
		for(long d: newDistances) {
			System.out.println(d+" ");
		}
	}

}
