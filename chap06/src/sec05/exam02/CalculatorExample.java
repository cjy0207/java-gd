package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		//반지름이 10cm인 원의 넓이
		
		//잘못된 방식(객체 생성) => 굳이 메모리를 낭비
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi;
//		
//		System.out.println(result1);
		
		//정적 접근방식
		double result1 = 10 * 10 * Calculator.pi; // 클레스명.객체; //Math.pi
		System.out.println(result1);
		
		int result2 = Calculator.plus(5, 3);
		int result3 = Calculator.minus(5, 3);
		//참고 : 주로 유틸리티성 기능에 쓰임
		
		
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
