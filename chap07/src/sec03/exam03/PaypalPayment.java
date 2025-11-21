package sec03.exam03;

public class PaypalPayment extends PaymentService{
	@Override
	public void pay(int amount) {
		System.out.println("Paypal 선택");
		System.out.println("Paypal 서버 연결중...");
		System.out.println("Paypal로"  + amount + "원 결제 완료");
	}
}
