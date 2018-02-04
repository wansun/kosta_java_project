package step10;

public class DateService {
	/*  2�� : 28�� 
	 *  4,6,9,11�� : 30�� 
	 *  1,3,5,7,8,10,12�� : 31�� 
	 *  �� �ܿ��� �߸��� �Է°� 
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
				System.out.println("�߸��� �Է°��Դϴ�");
		}		
	}
	public void showInfo(int m,int d) {
		System.out.println(m+"���� ������ ���� "+d+"�Դϴ�");
	}
}








