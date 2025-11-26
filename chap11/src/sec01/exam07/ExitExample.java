package sec01.exam07;

public class ExitExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 5) {
//				System.exit(0);// 0 : 정상종료를 의미 // JVM 종료
//				break; //반복문 빠져나오기
//				return; //메소드 종료
			}

		}

		System.out.println("마무리 코드");

	}
}
