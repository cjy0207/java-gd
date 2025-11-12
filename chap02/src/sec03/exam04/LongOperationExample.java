package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		//정수 타입의 산술 연산에서 하나라도 long타입이면 long 타압으로 형변환
		
		byte x= 20;
		long y =40;	
		//int result = x+y; // byte가 long으로 형변환
		
		long result = x+y;
		System.out.print(result);

		byte val1= 20;
		int val2 =40;
		long val3 = 1000L;
		long result2 = val1 + val2 + val3; // int+int+long -> long+long
		System.out.print(result2);
	}

}
