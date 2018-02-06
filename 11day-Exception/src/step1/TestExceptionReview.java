package step1;

import javax.transaction.InvalidTransactionException;

/* Exception Handling의 목적 : 10day txt에 정리
 * try, catch, finally 를 복습
 */
public class TestExceptionReview {
	public static void main(String[] args) {
		int balance=10000;
		int money=30000;
		try {// try 블럭은 출금작업단위, 출금 transaction
		System.out.println("카드를 넣는다.");//검증필요, 예외 발생가능성
		System.out.println("비밀번호를 넣는다.");//검증필요, 예외 발생가능성
		System.out.println("출금액을 입력한다.");//검증필요, 예외 발생가능성
		if(balance<money) {//잔액보다 출금액이 클 경우
			//Exception을 고의로 발생시킨다.
			throw new InvalidTransactionException("출금 잔액부족!!");
		}
		System.out.println(money+"원을 지급받는다.");
		}catch(Exception e) {
			System.out.println("거래 불가 메세지 : "+e.getMessage());
		}finally {//항상 수행하므로 꼭 해야하는 작업을 명시한다.
		System.out.println("카드를 돌려받는다.");
		}
		//출금 작업 완료 후 전개할 업무
		System.out.println("초기화면으로 간다");
	}
}
