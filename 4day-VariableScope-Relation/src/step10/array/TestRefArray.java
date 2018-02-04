package step10.array;

public class TestRefArray {
	public static void main(String[] args) {
		//참조형 데이터 타입의 데이터(객체)를 저장하는 배열
		Person pa[]=new Person[3];
		pa[0]=new Person("박보검",26);
		pa[1]=new Person("아이유",22);
		pa[2]=new Person("이효리",40);
		// pa 배열요소의 이름을 모두 출력하세요.
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName());
		}
		System.out.println("*****");
		int sum=0;
		for(int i=0;i<pa.length;i++) {
			sum+=pa[i].getAge();
		}
		System.out.println(sum); //88
	}
}
