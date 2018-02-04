package step2;
class AnimalService{
	public void pass(Animal a) {
		a.eat();
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		AnimalService service=new AnimalService();
		service.pass(new Dog());
		service.pass(new Person());
		service.pass(new Animal());
		/* 개가 사료를 먹다
		 * 사람이 수저로 먹다
		 * 먹다
		 */
	}
}
