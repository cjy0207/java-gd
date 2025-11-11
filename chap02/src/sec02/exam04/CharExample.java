package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		//char(2byte)
		//하나의 문자를 유니코드로 저장한다
		//유니코드 : 세계 각국의 문자들을 2byte(0-65535) 범위의 매핑한 표준 규약
		
		
		char c1 = 'A';
		char c2 = 65;
		//char cc = -65; //음수 값 저장 안됨. 유니코드는 0부터 시작
		char c3 = '\u0041'; //유니 코드를 의미 + 16진수 (잘안씀)
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//(참고) 유니코드 값 알아내기
		char var = '각';
		int unicode = var; // 자동타입 변환
		System.out.println(unicode);
		System.out.println((int) var); //강제 타입 변
		
		//참고 : 문자를 숫자로 변환
		//문자 0 -> 유니코드 48
		System.out.println('1'-0); //49-1 연산
		System.out.println('1'-'0'); //49-48
		
		//이런 방식은 문자를 숫자로 변환할 떄 쓰일 수 있음
		char digit = '8';
		int numericValue = digit -'0';
		System.out.println(numericValue);
		
		/*
		 * 중요
		 * 1)문자열과 문자는 다르다
		 * 2)빈 문자 처리에 대
		 * */
		//char c = '';//컴파일 에
		char c = ' '; //공백 문자 (유니코드: 32)
		System.out.println((int) ' ');
		
		String str = ""; //공백 가능
		System.out.println(str);
		
	}

}
