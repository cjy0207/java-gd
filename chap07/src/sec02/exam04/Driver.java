package sec02.exam04;

public class Driver {
	
	//부모 타입의 매개변수(참조 타입)이면 Vehicle 자신의 객체 뿐만 아니라 자식 객체도 들어올 수 있다.
	//즉, 운전자는 버스, 택시 모두 운전 가능
	public void driver(Vehicle vehicle) { 
		vehicle.run();
	}
	
	//매개변수의 다형성을 안쓰면?
	// -> drive() 메소드를 여러개 만들어야함
	// 자량이 늘어날 수록 메소드 오버로딩이 계속 늘어남
	//비슷한 기능 반복 -> 코드 중복 -> 유지보수, 유연성 떨어짐
	public void driver(Bus bus) { 
		bus.run();
	}
	public void driver(Taxi taxi) { 
		taxi.run();
	}

}
