package sec01.exam24;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		
		//자동 박싱
		Integer obj = 100; // Wrapper 객체가 생성되고 객체의 변자가 대입
		System.out.println(obj.intValue());
		
		//자동 언박싱
		//대입시
		int value = obj; //Wrapper 객체 안에 있는 기본 타입 값을 꺼내 대입
		System.out.println(value);
		
		//연산시
		int result = obj +100;
		System.out.println(result);

	}

}
