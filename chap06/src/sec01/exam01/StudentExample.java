package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(); //student객체를 하나 만들고 생성번지를 s1에 저장
		System.out.println("s1변수가 Student객체를 찹조합니다.");
		System.out.println(s1.toString());//객체를 문자열로 반환해서 출력
		System.out.println(s1.hashCode());//10진수 해시코드 출력
		
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student객체를 찹조합니다.");
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		
		if (s1==s2) {
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("다른 객체 참조");
		}

	}

}
