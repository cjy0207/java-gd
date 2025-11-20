package homework.homework11;

public class Account {

	private String accountNumber;
	private int balance;

	public Account() {

	}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원 입금. 현재 잔액: " + balance);
    }

    
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액 부족: 출금 실패");
        }
    }

}
