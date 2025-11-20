package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원 면적 : " + calculator.aresCircle(r));
		System.out.println();
		
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.aresCircle(r));
		//자식 클래스의 재정의 된 메소드 호출
		
		
		

	}

}
