package week4day3;

public class Audi extends Car {
	
	public void sunRoof() {
		System.out.println("Open Car Sunroof");
	}

	public static void main(String[] args) {
		Audi aud = new Audi();
		aud.applyBarke();
        aud.sunRoof();
        aud.sunRoof();
         
	}

	
}
