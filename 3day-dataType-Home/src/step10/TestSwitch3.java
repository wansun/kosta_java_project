package step10;

public class TestSwitch3 {
	public static void main(String[] args) {
		DateService service=new DateService();
		int month=2;
		service.printLastDay(month);//2���� ������ ���� 28���Դϴ� 
		service.printLastDay(13);//�߸��� �Է°��Դϴ� // 1~12 ������ ���� 
		service.printLastDay(1);//1���� ������ ���� 31���Դϴ� 
		service.printLastDay(4);//4���� ������ ���� 30���Դϴ� 
	}
}
