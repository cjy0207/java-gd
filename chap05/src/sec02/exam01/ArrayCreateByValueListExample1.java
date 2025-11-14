package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		//값의 목록을 이용해서배열 생성
		//1. 배열 변수 선언과 동시에 값 대입
		//int[] scores = new int[] {83, 90, 87}; //정석
		
		int[] scores = {83, 90, 87}; //편의성을 위한 리터럴 방식
		
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		//반복문 이용
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)(sum/3));
		
		String[] fruit = {"사과", "바나나", "오렌지", "포도", "딸기"};
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		
	}

}
