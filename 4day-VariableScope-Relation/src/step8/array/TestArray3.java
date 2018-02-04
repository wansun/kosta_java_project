package step8.array;

public class TestArray3 {
	public static void main(String[] args) {
		//배열 선언 생성 할당 동시에
		int point[]= {500,300,200,600};
		int avg=0;
		int sum=0;
		//for
		for(int i=0;i<point.length;i++) {
			sum+=point[i];
		}
		avg=sum/point.length;
		System.out.println("평균 포인트:"+avg);
	}
}
