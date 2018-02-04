package step11;

import step10.array.Person;

public class TestRefArray3 {
	public static void main(String[] args) {
		School school=new School();
		Person p[]= {new Person("박보검",25),new Person("유동규",27),new Person("설현",22)};
		//school.printArray(p);
		/* 1 박보검 55
		 * 2 유동규 27
		 * 3 설현 22
		 */
		
		school.printMaxAge(p); //27
		school.printMinAgePersonInfo(p); // 설현22
	}
}
