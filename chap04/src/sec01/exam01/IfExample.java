package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 크다");
			System.out.println("등급 : A");
		}
		
		//중괄호 생략 테스
		if(score<90) //중괄호가 생략 돤 if문의 범위는 다음 실행문 하나까
			System.out.println("점수가 90보다 작다");
			System.out.println("등급 : B");

	}

}
