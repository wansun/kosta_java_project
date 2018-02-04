package step9;

public class MyAccount {
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int money) {
		if(money>0)
			this.balance = money;
		else
			System.out.println("잘못된 금액입니다");
	}	
	public void deposit(int money) {
		if(money>0)
			balance+=money;
		else
			System.out.println("잘못된 입금액입니다");
	}
	/* 1. money 출금액이 0원 이하인 경우  잘못된 출금액 메세지 출력 
	 * 2. money 출금액이 balance 현재 잔액보다 클 경우 
	 *    잔액 부족 메세지 출력 
	 * 3. money 출금액이 balance 이하일 경우 정상 출금처리 ( 잔액 차감 ) 
	 */
	public void withdraw(int money) {
		if(money<=0)
			System.out.println("잘못된 출금액입니다");
		else if(money>balance)
			System.out.println("잔액이 부족합니다");
		else {
			balance-=money;
			System.out.println(money+"원 출금..현재 잔액은 "+balance+"원");
		}//else 	
	}//withdraw method
}//class                     ctrl + shift + f  코드정리 




















