package step10;

public class DateService {
	/*  2월 : 28일 
	 *  4,6,9,11월 : 30일 
	 *  1,3,5,7,8,10,12월 : 31일 
	 *  그 외에는 잘못된 입력값 
	 */
	public void printLastDay(int month) {
		switch(month) {
			case 2: 
				showInfo(month,28);
				break;
			case 4: case 6: case 9: case 11: 
				showInfo(month,30);
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				showInfo(month,31);
				break;
			default:
				System.out.println("잘못된 입력값입니다");
		}		
	}
	public void showInfo(int m,int d) {
		System.out.println(m+"월의 마지막 일은 "+d+"입니다");
	}
}








