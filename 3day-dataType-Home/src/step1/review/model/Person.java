// 1. 팩키지 선언 
package step1.review.model;
// 2. import : 다른 팩키지 자원을 사용하고자 할 때 명시
// import step2.Phone;
// 3. class 선언 
public class Person {
// 4. instance variable 선언 
	private int age; 
// 5. method 정의 
	public int getAge() {
		return age;
	}
	public void setAge(int age) { // age 는 매개변수 
		//this 는 현 인스턴스(객체)를 가르킨다 
		this.age = age;
	}	
}
