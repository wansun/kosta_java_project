package step2.method; //팩키지는 소문자로 명기한다.
/*
 * 메서드의 다양한 형태를 테스트 해본다
 */
public class TestMethod {
	public static void main(String[] args) {
		// Friend 객체를 생성해 본다
		Friend f=new Friend();
		// eat 메서드 호출해서 실행
		f.eat();
		// eat2 메서드 호출해서 짜장면 먹다를 출력
		f.eat2("자장면");
		// eat3 메서드 호출해서 3인분 먹다를 출력하게 한다
		f.eat3(3);
		// eat4 메서드 호출해서 김밥 2인분 먹다를 출력하게 한다.
		f.eat4("김밥",2);
		// eat5 메서드를 호출해서 라면 2인분 먹다를 반환받는다
		String returnValue=f.eat5("라면", 2);
		System.out.println("호출해서 리터받은 정보:"+returnValue);
		
	}
}
