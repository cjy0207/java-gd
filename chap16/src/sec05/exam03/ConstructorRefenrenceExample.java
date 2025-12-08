package sec05.exam03;

public class ConstructorRefenrenceExample {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		Member m1 = p.getMember1((id) -> {
			Member m = new Member(id);
			return m;
		});
		
		m1 = p.getMember1(Member::new);
		
		Member m2 = p.getMember2((id, name) -> {
			Member m = new Member(id, name);
			return m;
		});
		
		//생성자 참조는 두가지 방법 모두 동일하지만, 
		//함수형 인터페이스의 매개변수 개수에 따라 실행되는 Member 생성자가 달라짐
		
		
		

	}

}
