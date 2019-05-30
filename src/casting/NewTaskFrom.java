package casting;

public class NewTaskFrom {
	public static void main(String[] args) {
		String garage ="Toyota, Nissan, Honda, BMW, Mazeratti, Ford".toLowerCase();
		System.out.println(garage);
		if(garage.isEmpty()) {
			System.out.println("garage is empty");
		}else
					
			if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is japanese car");
		}
		else {
			System.out.println("no japanese car");
		}if(garage.contains("bmw")) {
			System.out.println("there is german car");
		}else {
			System.out.println("no german car");
		} if (garage.contains("mazeratti")) {
			System.out.println("there is italian car");
		} else {
			System.out.println("no italian car");
		} if (garage.contains("jaguar")) {
			System.out.println("there is a british car");
		}else {
			System.out.println("there is no british car");
		}
	}

}
