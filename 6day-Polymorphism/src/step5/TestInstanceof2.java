package step5;
class Animal{}
class Dog extends Animal{}
class Person extends Animal{}
class ZooService{
	public void enter(Animal a) {
		if(a instanceof Person)
			System.out.println("���� ����̴�");
		else if(a instanceof Dog)
			System.out.println("���� ����");
		else if(a instanceof Animal)
			System.out.println("���� �����̴�");
	}
}
public class TestInstanceof2 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.enter(new Person()); //���� ����̴�.
		service.enter(new Dog()); //���� ����
		service.enter(new Animal()); //���� �����̴�

		
	}
}
