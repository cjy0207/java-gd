package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();

		// 정사각형
		double result1 = myCalc.areaRactangle(5);

		// 직사각형
		double result2 = myCalc.areaRactangle(5, 6);

		System.out.println(result1);
		System.out.println(result2);

		// println 오버로딩 구현해보기

		// Quiz
//		아래에 제시된 메소드들을 보고 위에서부터 아래로 하나씩 추가한다고 했을 때 
//		오버로딩이 성립되어 오류가 발생하지 않는 메소드는 무엇인가요?
//		주석을 풀지 말고 결과를 유추해 보세요.
		//
//		public void test(int i) {} // 기준
		//
//		public void test(String str) {}             // 1번
//		public void test(int i, String str) {}      // 2번
//		public void test(int num) {}                // 3번
//		public char test(int point) {}              // 4번
//		public void test(int i, int k) {}           // 5번
//		public void test(int num, String string) {} // 6번
//		public void test(String str, int i) {}      // 7번

//		정답: 1257

	}

}
