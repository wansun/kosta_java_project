package step2_practice;

public class TestMethod {
	public static void main(String[] args) {
		Friend f=new Friend();
		
		f.eat();
		
		f.eat2("자장면");
		
		f.eat3(3);
		
		f.eat4("김밥",5);
		
		String returnValue=f.eat5("라면",2);
		System.out.println("호출해서 리턴받는 정보 :"+returnValue);
	}
}
