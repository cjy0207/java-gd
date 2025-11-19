package sec05.exam02_2;

public class BankAccount {
	static double interestRate = 2.5; //금리, static이 붙으면 공용데이터 -> 모든 계좌에 공통 적용
	//금리를 바꾸면 전체 고객에게 영향을 미침
	String owner; //계좌주
	double balance; //잔액
	
	//생성자 자동 생성 = 우클릭 + source + Generate..
	public BankAccount(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	public void printInfo() {
		System.out.println(owner + "님의 잔액 : " + balance + ", 금리 : " + interestRate + "%");
	}
	
	
	
}
