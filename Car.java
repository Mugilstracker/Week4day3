package week4day3;

public class Car extends Vehicle{
	
	public void turnOnAc() {
		System.out.println("Turn On AC");
		
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyBarke();
		obj.soundHorn();
		obj.applyBarke();
}
}