package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'b';
		
		//char 타입도 변수로 올 수 있음(대소문자 구분함
		switch (grade) {
		case 'A': System.out.println("우수 회원"); break;
		case 'B': System.out.println("일반 회원"); break;
		default: System.out.println("손님");
		}
		
		switch (grade) {
		case 'A', 'a' : System.out.println("우수 회원"); //이렇게도 가능, : 대신 -> 사
		case 'B', 'b': System.out.println("일반 회원"); break;
		default: System.out.println("손님");
		}
		
		if(grade=='A' || grade=='a') System.out.println("우수 회원");
		else if(grade=='B' || grade=='b') System.out.println("일반 회원");
		else System.out.println("손님");
		
	}
}
