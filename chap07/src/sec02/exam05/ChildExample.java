package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent = new Child(); //부모타임에 자식타입의 객체를 넣음 -> 자동 형변환
		
		parent.field1 = "data";
		parent.method1();
		parent.method2();
		
		//Parent 타입에는 쓸 수 없음
//		parent.field2 = "data";
//		parent.method3();
		
		//해결법 : 강제 캐스팅
		Child child = (Child) parent; //강제 타입 변환
		child.field2 = "data2";
		child.method3();
		
		
		
		

	}

}
