package step3;

public class TestConstructor2 {
	public static void main(String[] args) {
		CreditCard card=new CreditCard();
		card.setCustomerInfo("아이유 1등급");
		System.out.println(card.getCustomerInfo());
		// 위와 같은 형식은 카드 발급 후 개인정보(신용등급)을
		// 할당받는다 
		// 만약 카드 발급(객체생성)은 반드시 개인정보를 
		// 할당받을 때만 가능하게 하려면 생성자를 정의해야 
		// 한다 
		CreditCard2 card2=new CreditCard2("공유 2등급");
		System.out.println(card2.getCustomerInfo());
		card2.setCustomerInfo("공유 1등급");// set은 수정시 사용
		System.out.println(card2.getCustomerInfo());
	}
}







