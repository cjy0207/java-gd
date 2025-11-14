package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {
		
		String hobby = null;
		//System.out.println(hobby.length()); //NPE 예외 발생(참조 하는 객체가 없으니 메소드 이용불가)
		
		
		hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "김재현";
		name = null;// 참조 끊기
		//이때 김재현이라는 문자열 객체는 쓰레기 객체가 됨
		//Garbage Collector가 CPU가 한가할 때나 메모리가 부족할 때 메모리에서 자동 제거함
		//추가 + .hashCode()하면 주소가 나오는것 같음
		
		

	}

}
