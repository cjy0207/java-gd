package sec01.exam09;

public class Car {

	String model;
	int speed;
	
	public Car() {}
	
	public Car(String model) {
		this.model = model;
	}
	
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public void stop() {
		System.out.println("차가 멈춤");
	}
	
	public void run() {
		System.out.println("차가 달림");
	}
}
