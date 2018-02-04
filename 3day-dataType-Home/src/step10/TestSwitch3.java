package step10;

public class TestSwitch3 {
	public static void main(String[] args) {
		DateService service=new DateService();
		int month=2;
		service.printLastDay(month);//2월의 마지막 일은 28일입니다 
		service.printLastDay(13);//잘못된 입력값입니다 // 1~12 까지만 가능 
		service.printLastDay(1);//1월의 마지막 일은 31일입니다 
		service.printLastDay(4);//4월의 마지막 일은 30일입니다 
	}
}
