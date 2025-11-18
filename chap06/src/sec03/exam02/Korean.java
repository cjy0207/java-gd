package sec03.exam02;

public class Korean {
	
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	
	public Korean(String n, String s) {
//		name = name; //양쪽 다 배개변수 name을 가리킴
//		ssn = ssn;
		
		this.name = name;
		this.ssn = ssn;
		//여기서 this는 객체 자기 자신을 참조한다.
		//객체 내부에서 자기 자신을 가리킬 때 사용
	}
	
	
	
	
}
