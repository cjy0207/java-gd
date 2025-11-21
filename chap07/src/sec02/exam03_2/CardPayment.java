package sec02.exam03_2;

public class CardPayment extends PaymentService{

	@Override
	public void pay(int amount) {
		System.out.println("카드결제 선택");
		System.out.println("카드사 승인 요청중...");
		System.out.println("카드로"  + amount + "원 결제 완료");
	}
}
