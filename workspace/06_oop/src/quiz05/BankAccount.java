package quiz05;

public class BankAccount {

	private String accNo; // 계좌번호
	private long balance;

	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(long money) {
		if (money > 0) {
			this.balance += money;
			System.out.println(money + "원 입금");
		} else {
			System.out.println("마이너스 입금은 불가능합니다.");
		}
	}

	// 실제로 출금된 금액을 반환하는 메소드
	public long withdraw(long money) { // long money : 요청 금액
		if (money <= 0) {
			System.out.println("마이너스 출금은 불가능합니다.");
			return 0;
		} else if (this.balance < money) {
			System.out.println("잔고 부족으로 불가능합니다.");
			return 0;
		} else {
			System.out.println(money + "원 출금");
			this.balance -= money;
			return money;
		}
	}

	public void inquiry() { // 계좌번호: 1111, 잔액: 10000원
		System.out.println("계좌번호: " + accNo + ", 잔액: " + this.balance + "원");
	}

	public void transfer(BankAccount you, long money) {
		// withdraw(money);
		// you.deposit(money);
		// 내 통장에서 출금된 금액을 네 통장에 입금해 준다.
		you.deposit(withdraw(money));
	}

}
