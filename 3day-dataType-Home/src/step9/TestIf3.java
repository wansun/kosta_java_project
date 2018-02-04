package step9;

public class TestIf3 {
	public static void main(String[] args) {
		MyAccount account=new MyAccount();
		account.setBalance(100);
		System.out.println(account.getBalance());//100
		// 금액은 반드시 0을 초과해야 한다 
		account.setBalance(-1);//잘못된 금액입니다
		System.out.println(account.getBalance());//100
		// 입금 
		account.deposit(200); // 잔액 누적 
		System.out.println(account.getBalance());//300
		account.deposit(-2); // 잘못된 입금액입니다 
		System.out.println(account.getBalance());//300
		System.out.println("*******");
		account.withdraw(200);
		System.out.println(account.getBalance());//100
		account.withdraw(150); // 잔액이 부족합니다  가 출력된다 
		System.out.println(account.getBalance());//100
		account.withdraw(-10); // 잘못된 출금액입니다 가 출력된다 
		System.out.println(account.getBalance());//100
	}
}












