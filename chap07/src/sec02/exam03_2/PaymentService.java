package sec02.exam03_2;


//부모 클래스 /; 공통 결제 서비스 -> 추상화 -> 추상 클래스 : 결제 서비스의 미완성된 공통 설계도
public class PaymentService {
	
	public void pay(int amount) {
		System.out.println(amount);
		System.out.println("결제를 처리 합니다.");
		
	}

}
