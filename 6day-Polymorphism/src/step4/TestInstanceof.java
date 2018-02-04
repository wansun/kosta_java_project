package step4;
/*
 *  instanceof : is a 관계 성립시 true를 반환
 *  			객체 타입을 비교한다
 */
class Employee{}
class Engineer extends Employee{}
class Manager extends Employee{}
class Dog{}
public class TestInstanceof {
	public static void main(String[] args) {
		Employee m=new Manager();
		//m이 참조하는 객체는 Manager 이므로 true
		System.out.println(m instanceof Manager); //ture
		//m이 참조하는 객체는 Manager이고 Employee 자식이므로 true
		System.out.println(m instanceof Employee);//true
		//컴파일 에러, 비교불가 (실행 불가한 애는 컴파일조차 안해서 실행이 안된다)
		//System.out.println(m instanceof Dog);
		//m이 참조하는 객체는 Manager 이고 Engineer가 아니므로 false
		System.out.println(m instanceof Engineer); //false
	}
}
