package step9;

import step7.Animal;
import step7.Monkey;
import step7.Person;

class Car{}
public class TestPolymorphism6 {
	public static void main(String[] args) {
		Animal a[]=new Animal[3];
		a[0]=new Animal();
		//a[1]=new Car(); //������ ����, ����� �迭 Ÿ���� ��Ұ�ü�� ����
		a[1]=new Person(); //�ڽİ�ü�� �θ�Ÿ���� �迭�� ��ҷ� ����
		a[2]=new Monkey(); 
		//for�� �̿��� play()�� ȣ���غ���
		for(int i=0;i<a.length;i++)
			a[i].play();
	}
}
