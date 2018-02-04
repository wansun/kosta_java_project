package step7;
class Service{
	public void test1(Person p) {//p는 지역변수 (매개변수)
		p=new Person("이효리");    //p 지역변수에 새로운 객체 주소값 재할당 
		
	}
	public void test2(Person p) {//p는 지역변수 (매개변수)
		p.setName("이상순");      //p 지역변수가 참조하는 객체의 name을 재할당
	}
}
public class TestChangeObject {
	public static void main(String[] args) {
		Service service=new Service();
		Person p=new Person("아이유");
	    service.test1(p);
	    System.out.println(p.getName());
	    service.test2(p);
	    System.out.println(p.getName());
	}
}

 