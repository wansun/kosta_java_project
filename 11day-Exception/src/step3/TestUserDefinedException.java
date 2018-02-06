package step3;
//사용자 정의 Exception 을 만들기 위해
//java.lang.Exception class를 상속받는다
class TicketingException extends Exception{
	//이후 IO에서 공부할 에정
	private static final long serialVersionUID = 4451532426681270442L;
	//생성자 오버로딩
	public TicketingException() {
		super("매표시 예외 발생");
	}
	public TicketingException(String message) {
		super(message);
	}
}
class MovieService{
	public void watch(int age) throws TicketingException {
		if(age<20)
			throw new TicketingException("20세 미만.. 나이 더 먹고 오세요");
		System.out.println("성인영화 재생");
	}
}
public class TestUserDefinedException {
	public static void main(String[] args) {
		MovieService service=new MovieService();
		int age=22;
		age=22;
		try {
			service.watch(age);
		}catch(TicketingException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("영화서비스 종료");
	}
}
