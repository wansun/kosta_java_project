package step1;

public class TestStringEquals {
	public static void main(String[] args) {
		/* 문자열을 생성하는 방법은 다양하다
		 * 문자열 비교시에는
		 *  == 이 아니라
		 *  String calss의
		 *  equals 메서드를 이용해야 한다.
		 */
		String name1="아이유";
		String name2=new String("아이유");
		System.out.println(name1+" "+name2); //아이유 아이유
		System.out.println(name1==name2); //false
		//문자열 비교시에는 equals를 이용해야 한다.
		System.out.println(name1.equals(name2)); //true
		StringBuilder sb=new StringBuilder("아이유");
		System.out.println(sb); //아이유
		//System.out.println(name1==sb);//type이 다르므로 컴파일 에러
		System.out.println(name1.equals(sb.toString())); //true
	}
}
