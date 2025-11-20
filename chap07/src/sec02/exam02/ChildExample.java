package sec02.exam02;

public class ChildExample {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); //자식 쪽의 재정의 된 메소드가 호출
//		parent.method3(); //Parent 타입에 없는 필드나 메소드 접근 불가능
		
		//정리 : 참조변수의 타입은 객체를 다룰 수 있는 리모컨이라고 생각하자
		
		Child child2 = (Child) parent; //강제 타입 변환
		child.method3(); //사용 가능
		
		
	}

}
