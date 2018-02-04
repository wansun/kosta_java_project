package step8;

public class TestIf2 {
	public static void main(String[] args) {
		int month=2;
		MyDate date=new MyDate(month);
		System.out.println(date.getMonth());//2 
		int month2=0;
		MyDate date2=new MyDate(month2); // 잘못된 월 정보입니다
		System.out.println(date2.getMonth());//1 
	}
}
