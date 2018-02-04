package step3;
//이차원 배열
public class Test2DArray {
	public static void main(String[] args) {
		/*
		 * 배열의 배열
		 * 
		 * ex) 총 3년 매월 강수량을 저장
		 *     일차원 배열 3년 length
		 *     이차원 배열 년도별 length 12
		 */
		int rain[][]=new int[3][12];
		rain[0][0]=20;
		//........
		rain[2][11]=40;
		System.out.println(rain[2][11]);
		/* ex) 판교중학교 총 3학년의 각반 학생수를 저장
		 *      1학년은 2반
		 *      2학년은 4반
		 *      3학년은 5반으로 구성
		 * 
		 */
		int ms[][]=new int[3][];
		//학년별 반수가 다름으로 이차원배열길이는 각각 지정
		ms[0]=new int[2]; //1학년 2반으로 구성
		ms[1]=new int[4]; //2학년 4반으로 구성
		ms[2]=new int[5]; //3학년 5반으로 구성
		//3학년 5반의 학생수를 30명으로 할당해본다
		ms[2][4]=30;
		System.out.println(ms[2][4]);
	}
}
