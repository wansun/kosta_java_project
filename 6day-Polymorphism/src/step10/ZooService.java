package step10;

import step7.Animal;
import step7.Person;

public class ZooService {
	public void executeAll(Animal[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i] instanceof Person)
				((Person)a[i]).ticketing();
			a[i].play();
		}
	}
}
