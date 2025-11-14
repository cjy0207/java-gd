package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		//값의 목록을 이용해서 배열 생성
		//2. 배열 변수 후 나중에 값 저장
		
		int[] scores;
//		scores = {83,90,87}; //컴파일 에러
		//배열을 선언과 동시에 초기화 할 때만 사용 가능
		
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i =0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		
		System.out.println(sum1);
		
		System.out.println(add(new int[] {100,90,87}));
		
	}
	
	//메소드 선언
	public static int add(int[] scores) {
		int sum = 0; 
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
