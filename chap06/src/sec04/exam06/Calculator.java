package sec04.exam06;

public class Calculator {
	
	//정사각형의 넓이 
	double areaRactangle(double width) {
		return width * width;
	}
	
	
	//직사각형의 넓이
	double areaRactangle(double width, double height) {
		return width * height;
	}

	//메소드 오버로딩의 조건
	//1. 메소드명이 같아야함
	//2. 매개변수의 타입, 갯수, 순서가 달라야함
	//3. 매개변수 명, 리턴 타입이 다르다고 해서 오버로딩이 아님
	
	//메소드 오버로딩의 이유
	// 다양한 형태의 매개값을 받아 처리 할 수 있도록
	// 오버로딩을 안쓰면 같은 기능을 각각 다은 이름의 메소드로 정의행함(불편
	
}
