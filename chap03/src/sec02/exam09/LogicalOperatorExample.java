package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);
		
		if((charCode>=65)&(charCode<=90)) {//t & t = t
			System.out.println("대문자");
		}
		
		if((charCode>=97)&&(charCode<=122)) {//f && f = f
			System.out.println("소문자");
		}
		
		if((charCode>=48)&&(charCode<=57)) {//t && f = f
			System.out.println("소문자");
		}
		
		int value = 6;
		if((value%2 == 0) | (value%3 == 0)) {// t | t => t(뒤 로직까지 검사
			System.out.println("2또는 3의 배수");
		}
		
		if((value%2 == 0) || (value%3 == 0)) {// t || => t(short circuit 동작
			System.out.println("2또는 3의 배수");
		}
		
		//정리 : 연산의 결과는 같은데 효율성이 더 높으므로  &&, || 이용

	}

}
