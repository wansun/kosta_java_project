package step10;

import step7.Animal;
import step7.Monkey;
import step7.Person;
import step7.Tiger;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		Animal a[]= {new Tiger(),new Person(),new Monkey()};
		service.executeAll(a);
		/*호랑이가 사냥하며 놀다
		 * 사람이 티켓을 구매하다
		 * 사람이 데이트하며 놀다
		 * 원숭이가 나무타며 놀다
		 */

	}
}
