package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "김재현";
		String strVal2 = "김재현";
		
		if(strVal1 == strVal2) { //번지 비교 => 동일한 객체인지 비교
			System.out.println("strVal1와 strVal2는 참조가 같음");
		}else {
			System.out.println("strVal1와 strVal2는 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) { //순수 문자열 비교
			System.out.println("strVal1와 strVal2는 문자열이 같음");
		}
		
		
		
		String strVal3 = new String("김재현");
		String strVal4 = new String("김재현");
		
		if(strVal3 == strVal4) { //번지 비교 => 동일한 객체인지 비교
			System.out.println("strVal3와 strVal4는 참조가 같음");
		}else {
			System.out.println("strVal3와 strVal4는 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) { //순수 문자열 비교
			System.out.println("strVal3와 strVal4는 문자열이 같음");
		}
		
	}

}
