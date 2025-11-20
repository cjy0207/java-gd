package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		// 부모 생성자가 호출되고 자식 객체가 생성이 됨
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
	}
}
