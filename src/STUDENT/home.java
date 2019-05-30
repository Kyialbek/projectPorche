package STUDENT;

public class home {
	int size;
	int floor;
	int bedroom;
	int livingRoom;
	int restRoom;
	boolean garden;
	String name;
	int window;
	String color;
	int temperature;
	int gardenLength;
	int gadenWidth;
	
	public int tempIncrease(int addedTemperature) {
	temperature +=addedTemperature;
	return temperature;
	
	}
	public int tempDecrease(int minusTemperature) {
		temperature -=minusTemperature;
		return temperature;
	}
public int calculateGardeArea(boolean checkGarden, int length, int width) {
	
}
	
}

