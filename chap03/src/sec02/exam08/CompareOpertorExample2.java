package sec02.exam08;

public class CompareOpertorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2==v3); //true : v2가 double로 변환
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); 
		//false : v5가 double타입으로 변환, float과 double의 정밀도 떄문에
		System.out.println(v4 + "==" + (double)v5);
		//자바에서 0.1을 float이나 double로 저장하면정확히 0.1이 저장되지 않음
		//이는 부동 소수점 표현의 한계 때문이며, 이진수로 정혹히 표현 할 수 없는 10진수이기 떄문이다
		//v4도 완전한 0.1은 아님
		
		//해결책
		//1. flaot로 바꿔서 비교
		System.out.println((float)v4==v5);
		
		//2. 정수로 바꿔서 비교
		System.out.println((int)(v4*10)==(int)(v5*10));
		
		//정리 : floa타입과 doouble타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		//실수 타입을 하나로 통일하는 것이 좋음(주로 double)
		
		
		//정밀도 테스트
		double rel = 7*0.1;
		System.out.println(rel);
		//부동소수점 방식에서 실수 연산을 하다보면 근사값이 나옴
		//1. 정수로 바꿔 계산해서 실수타입으로 변경
		//
		

	}

}
