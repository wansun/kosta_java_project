package step2.method;

public class Friend {
	public void eat() {
		System.out.println("먹다");
	}
	/* menu : 매개변수 or parameter
	 * 호출하는 측에서 전달한 데이터를 받아
	 * 일시적으로 저장해서 사용하기 위한 임시변수
	 * 메서드 실행이 종료되면 메모리에서 해제된다
	 */
	public void eat2(String menu) {
		System.out.println(menu + "먹다");
	}
	public void eat3(int count) {
		System.out.println(count + "인분 먹다");
	}
	public void eat4(String menu, int count) {
		System.out.println(menu +" " + count + "인분 먹다");
	}
	public String eat5(String menu, int count) {
		//return keyword는 호출한 측으로 정보를 반환
		//리턴할 때는 void 대신 리턴값의 타입을 명시해야 한다.
		return menu+" "+count+" "+"인분 먹다";
	}
}

