package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90~");
			System.out.println("등급 : A");
		}else if(score>=80) {
			System.out.println("점수가 80~89");
			System.out.println("등급 : B");
		}else if(score>=70) {
			System.out.println("점수가 70~79");
			System.out.println("등급 : C");
		}else {
			System.out.println("점수가 0~69");
			System.out.println("등급 : D");
		}
		
		/*정리
		 * 1. 조건식을 여러개 작성 할 수 있더
		 * 2. 위에서부터 차례대로 비교하고 조건식이 true가 되는 블록만 실행하고 빠져나감
		 * 3. 필요에 따라 중첩가능
		 * */
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//		(문자끼리 대소비교가 가능, 문자 타입이 정수 타입으로 변환됨)
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		
		
		Scanner sc= new Scanner(System.in);
		
        char ch = sc.nextLine().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("대문자");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("소문자");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("숫자");
        } else {
            System.out.println("기타문자");
        }
		
		
	}

}
