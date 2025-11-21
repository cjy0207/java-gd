package sec02.exam03_2;

public class PaymentExample {
	
	public static void main(String[] args) {
//		//카드결제
//		CardPayment cardPayment = new CardPayment();
//		cardPayment.pay(50000);
//		
//		//paypal 결제
//		PaypalPayment paypal = new PaypalPayment();
//		paypal.pay(30000);
//		
//		//계좌 이체
//		BankTransferPayment bank = new BankTransferPayment();
//		bank.pay(20000);
		
		//다형성으로 만들기
		PaymentService payment;
		
//		payment = new CardPayment();
//		payment = new PaypalPayment();
		payment = new BankTransferPayment();
		
		//결제 수단을 바꿔도 개발 코드는 바뀌지 않음
		payment.pay(50000);
		
		
		
		
	}

}
