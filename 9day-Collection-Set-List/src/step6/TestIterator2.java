package step6;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator2 {
	public static void main(String[] args) {
		ItemService service=new ItemService();
		String requestType="상품종류";
		//requestType="상품목록";
		Collection<String> col=service.delivery(requestType);
		/*  delivery 메서드의 반환형은 Collection interface 타입이다.
		 *  실제 구현체는 어떤 타입에 객체가 반환될지는 보장되지는 않는다
		 *  (List 계열일수도 있고 Set 계열일 수도 있다)
		 *  Colletion 인터페이스의 하위 구현체인것은 보장되어 있으므로
		 *  Iterator 라는 단일한 표준화된 방법으로 
		 *  요소들을 모두 반복, 열거 할 수 있다
		 *  ex) 실세계의 모든 캔(음료캔 등등)을 따는 방법은 같다.
		 */
		//정보를 열거 
		System.out.println(requestType);
		Iterator<String> sv=col.iterator();
		while(sv.hasNext())
			System.out.println(sv.next());
			
	}
}
