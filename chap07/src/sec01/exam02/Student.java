package sec01.exam02;

public class Student extends People{
	int studentNo;
	
	
	//부모에 빈 생성자가 없어서 에러뜸
//	public Student() {
//	super();
//}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 클래스가 책임지는 초기화는 부모 생성자에세 맡기는게 원칙적이고 안전한 방법
		this.studentNo = studentNo;
		System.out.println("자식 생성자 호출");
		
	}
	

	
	
}
