package sec03.exam02;

//공통 기능 제공 + 하위 클래슥 나머지를 구현하도록 강제
public abstract class Animal {
	
	public String kind;
	
	public void brethe() {
		System.out.println("숨을 쉼니다.");
	}
	
	//추상 메소드
	//미완성 메소드, 실행부({..})가 없는 메소드
	//추상 믈래스 안에서만 정의 기능(즉, 추상 메소드가 하나라도 존재하면그 클래스는 추상 클래스로 선언)
	//꼭 필요하지만 자식마다 다르게 구현할 것으로 예상되는 경우 사용
	//동일한 이름으로 구현을 강제하는 효과
	public abstract void sound();
	
	
}
