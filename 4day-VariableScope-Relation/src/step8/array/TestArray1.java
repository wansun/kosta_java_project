package step8.array;

public class TestArray1 {
	public static void main(String[] args) {
		/*
		 * 배열(Array)
		 * primitive data type의 data를 저장하는 배열
		 */
		//1. 배열 선언
		int age[];
		//2. 배열 객체 생성
		age=new int[3]; //3 lenght
		//3. 배열 요소에 값 할당
		age[0]=20;
		age[1]=30;
		age[2]=26;
		System.out.println(age[1]); //30
		System.out.println(age.length); //3
		//for 문을 이용해서 age 배열요소를 모두 출력하시오
		for(int i=0;i<age.length;i++)
			System.out.println(age[i]);
	}
}
