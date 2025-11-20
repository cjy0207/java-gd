package homework.homework11;

public class Bank {
	
	public void transfer(Account sender, Account receiver, int amount) {
        if (sender.getBalance() >= amount) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println(amount + "원 송금");
        } else {
            System.out.println("송금 실패: 잔액 부족");
        }
    }

}
