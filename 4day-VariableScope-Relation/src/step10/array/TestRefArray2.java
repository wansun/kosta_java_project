package step10.array;

public class TestRefArray2 {
	public static void main(String[] args) {
		//배열 선언 생성 할당 동시에
		Person pa[]= {new Person("박보검",25),new Person("유동규",27),new Person("설현",22)};
		//for 문 이용해 이름과 나이 모두 출력
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName()+" "+pa[i].getAge());
		}
		System.out.println("*************");
		
		//pa 배열의 모든 요소의 나이를 10살 증가시킨다
		for(int i=0;i<pa.length;i++) {
			pa[i].setAge(pa[i].getAge()+10);
		}
		
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName()+" "+pa[i].getAge());
		}
	}
}
