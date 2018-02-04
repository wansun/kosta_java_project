package step5.date;

public class MyDate {
	public int day;
	//외부에서 접근할 수 없도록 private 로 선언
	private int capsulDay=1;
	//capsulDay 변수에 간접 접근하여 
	//할당 및 반환 받을 수 있는 setter 와 getter 메서드를 정의한다
	public void setCapsulDay(int d) {
		if(d>0&&d<32) {
		//조건문 0초과 32미만이면 정상값	
			capsulDay=d;
		}else {
			System.out.println("잘못된 day 정보입니다");
		}
	}
	public int getCapsulDay() {
		return capsulDay;
	}
}
// day, setCapsulDay, getCapsulDay 는 인터페이스, capsulDay 는 구현부