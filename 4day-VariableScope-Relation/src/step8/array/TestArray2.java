package step8.array;

public class TestArray2 {
	public static void main(String[] args) {
		//배열 선언, 생성
		int salary[]=new int[4];
		salary[0]=100;
		salary[1]=300;
		salary[2]=200;
		salary[3]=500;
		//for 문을 이용해서 salary 배열의 총 합을 출력
		int sum=0;
		for(int i=0;i<salary.length;i++) {
			sum+=salary[i];
		}
		System.out.println("총합"+sum);
	}
}
