package sec01.exam03;

public class Computer extends Calculator{
	
	//자바에서 제공하는 정확한 PI값을 사용해 정밀한 값을 게산하도록 변경 -> 오버라이딩
	@Override // 어노테이션 : 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
	double aresCircle(double r) {
		System.out.println("Computer의 areaCircle() 사용");
		return Math.PI * r * r;
	}
	
	
}
