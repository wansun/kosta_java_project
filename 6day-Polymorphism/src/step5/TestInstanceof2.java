package step5;
class Animal{}
class Dog extends Animal{}
class Person extends Animal{}
class ZooService{
	public void enter(Animal a) {
		if(a instanceof Person)
			System.out.println("나는 사람이다");
		else if(a instanceof Dog)
			System.out.println("나는 개다");
		else if(a instanceof Animal)
			System.out.println("나는 동물이다");
	}
}
public class TestInstanceof2 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.enter(new Person()); //나는 사람이다.
		service.enter(new Dog()); //나는 개다
		service.enter(new Animal()); //나는 동물이다

		
	}
}
