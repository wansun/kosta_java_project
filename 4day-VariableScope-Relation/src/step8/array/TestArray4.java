package step8.array;

public class TestArray4 {
	public static void main(String[] args) {
		int point[]= {30,50,10,20};
		int minPoint=Integer.MAX_VALUE;
		//for문 이용해서 최소값 추출
		for(int i=0;i<point.length;i++) {
			if(minPoint>point[i]) { 
				minPoint=point[i];
			}
			
		}
		
		//최소 point값 출력
		System.out.println("포인트 최소값"+minPoint);
	}
}
