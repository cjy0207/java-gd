package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		//참고 : 잘못 작성된 예시
		for(float i=0.1f; i<=1.0f; i+=0.1f) {
			System.out.println(i); //10번 반복을 기대하지만 실제로는 9번 반복
			
		}
		//정리 초기화 식에 상용되는 변수는 정수 타입을 쓰는게 좋음

	}

}
