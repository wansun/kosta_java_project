package step6;
// this keyword를 테스트 하는 예제
public class TestThis {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.getName()); //String의 디폴트 값 null
		p.setName("아이유");
		System.out.println(p.getName());
		
	}
}
