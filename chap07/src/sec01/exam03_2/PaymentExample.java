package sec01.exam03_2;

public class PaymentExample {
	
	public static void main(String[] args) {
		//카드결제
		CardPayment cardPayment = new CardPayment();
		cardPayment.pay(50000);
		
		//paypal 결제
		PaypalPayment paypal = new PaypalPayment();
		paypal.pay(30000);
		
		//계좌 이체
		BankTransferPayment bank = new BankTransferPayment();
		bank.pay(20000);
		
	}

}
