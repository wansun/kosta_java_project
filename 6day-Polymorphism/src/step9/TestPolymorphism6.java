package step9;

import step7.Animal;
import step7.Monkey;
import step7.Person;

class Car{}
public class TestPolymorphism6 {
	public static void main(String[] args) {
		Animal a[]=new Animal[3];
		a[0]=new Animal();
		//a[1]=new Car(); //컴파일 에러, 선언된 배열 타입의 요소객체만 가능
		a[1]=new Person(); //자식객체는 부모타입의 배열에 요소로 가능
		a[2]=new Monkey(); 
		//for문 이용해 play()을 호출해본다
		for(int i=0;i<a.length;i++)
			a[i].play();
	}
}
