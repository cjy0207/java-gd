package sec05.exam04;

public class Singleton {
	//Step2
	private static final Singleton SINGLETON = new Singleton();
	// private로 외부에서 변경 못하게 막기
	// => 단하나의 객체만 만들어서 사용하기 위함
	
	//Step1 
//	public Singleton() {//외부에서 호출 가능-> 여러개의 객체 생성 가능
	private Singleton() {//외부에서 new 연산자로 호출 불가
		
	}
	
	//Step3
	public static Singleton getInstance() {//싱글톤 객체를 반환하는 메소드
		return SINGLETON;
	}
}
