package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		//1. 매개값으로 배열 넘김
		int[] values = {1,2,3};
		int result1 = myCom.sum1(values);
		System.out.println(result1);
		
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		//2. 매개 값으로 값의 목록과 배열 둘 다 허용
		
		//목록
		int result3 = myCom.sum2(1,2,3);
		System.out.println(result3);
		//배열
		int result4 = myCom.sum2(new int[] {1,2,3,4,5});
		System.out.println(result4);
		
		
		//참고 : in JavaScript
		//1. arguments 객체 이용
//		function sum() {
//			sonsole.log(arguments)
//		}
		
		//2. Rest 파라미터 - 최신 표준(권장)
//		function sum(a,b,c ...numbers) {
//		sonsole.log(numbers)
//	}		
		
	}

}
