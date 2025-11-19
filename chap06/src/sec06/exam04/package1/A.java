package sec06.exam04.package1;

public class A {
	
	//필드
	// 같은 클래스 내부에서는 아래 3개의 생성자 전부 가능
	A a1 =  new A(true);
	A a2 =  new A(1);
	A a3 =  new A("문자열");
	
	public A(boolean b) {}
	A(int b){}
	private A (String s) {}
	
	
}
