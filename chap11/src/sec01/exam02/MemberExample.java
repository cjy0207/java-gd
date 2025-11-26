package sec01.exam02;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		//obj1 obj2는 물리적으로는 다른 객체, 논리적(데이터)적으로 동등 객체
		
		
		// equals() : 메소드 재정의 전 - 같은 객체인지 비교(번지 비교
		// equals() : 메소드 재정의 후 - 논리적 동등 비교
		if(obj1.equals(obj2)) {
			System.out.println("1 : equal");
		}else System.out.println("1 : not equal");
		
		if(obj1.equals(obj3)) {
			System.out.println("2: equal");
		}else System.out.println("2 : not equal");
		

	}

}
