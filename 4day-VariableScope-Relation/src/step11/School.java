package step11;

import step10.array.Person;


public class School {
//	public void printArray(Person[] p) {// 배열 타입 
//		for(int i=0;i<p.length;i++) {
//			System.out.println(i+1+" "+p[i].getName()+" "+p[i].getAge());
//		}
//	}
	public void printMaxAge(Person[] p) {
		int maxAge=Integer.MIN_VALUE;
		for(int i=0;i<p.length;i++) {
			if(p[i].getAge()>maxAge) {
				maxAge=p[i].getAge();
			}
		}
		System.out.println(maxAge);
	}
	public void printMinAgePersonInfo(Person[] p) {
		int minAge=Integer.MAX_VALUE;
		Person person=null;
		for(int i=0;i<p.length;i++) {
			if(p[i].getAge()<minAge) {
				minAge=p[i].getAge();
				person=p[i];
			}
		}
		System.out.println(person.getName()+" "+person.getAge());
	}
}

