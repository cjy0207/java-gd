package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.driver(bus); //타입이 부모 타입이므로 타입 변환
		
		Taxi taxi = new Taxi();
		driver.driver(taxi); 

	}

}
