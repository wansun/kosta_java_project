package step8;
class Parent {
	private String name;
	Parent(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Child extends Parent{
	private String address;
	Child(String name,String address){
		//super(); //부모 클래스인 Parent는 기본생성자 없으므로 컴파일 에러
		super(name);
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class TestSuper2 {
	public static void main(String[] args) {
		
	}
}
