package step2_practice;

public class TestMethod {
	public static void main(String[] args) {
		Friend f=new Friend();
		
		f.eat();                            //먹다
		                                 
		f.eat2("자장면");						//자장면 먹다
											
		f.eat3(3);							//3인분 먹다
		
		f.eat4("김밥",5);						//김밥 5인준 먹다
		
		String returnValue=f.eat5("라면",2);	// 호출해서 리턴받은 정보: 라면2인분먹다
		System.out.println("호출해서 리턴받는 정보 :"+returnValue);
	}
}
