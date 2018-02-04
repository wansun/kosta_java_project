package step4.relation;

public class TestAggregation {
	/* aggregation : has s relationship
	 * 사람이 스마트폰을 소유하여 사용하다.
	 */
	public static void main(String[] args) {
		Person p=new Person("아이유",new SmartPhone("갤럭시8",150));
		System.out.println(p.getName()); //아이유
		System.out.println(p.getSmartPhone().getModel()); //갤럭시8
		System.out.println(p.getSmartPhone().getPrice()); //150
	}
}
