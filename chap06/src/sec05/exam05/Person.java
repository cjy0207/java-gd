package sec05.exam05;

public class Person {
	// final필드를 초기화 하는 두가지 방법
	final String nation = "Korean"; // 1. 선언 시 초기화
	final String ssn; // 2. 생성자에서 초기화 
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
//		this.nation = "American"; // 선언과 동시에 초기화 시킨 final 필드는 생성자에서도 변경 불가
	}
	
	
}
