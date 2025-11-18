package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator(); //기본 생성자 호출
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result : " + result1);
		
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); //int로 자동 타입 변환
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
	
		

	}

}
