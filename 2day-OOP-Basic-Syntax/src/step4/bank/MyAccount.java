package step4.bank;

public class MyAccount {
	//public 은 어디서나 접근 가능
	public String name;
	//private 은 현 클래스 내에서만 접근 가능
	private String capsulName;
	//password정보는 노출되면 안되므로 private으로 선언
	private int password;
	public String getCapsulName() {
		return capsulName;
	}
	public void setCapsulName(String capsulName) {
		//메서드에서는 검증할 수 있는 로직을 명시할 수 있다.
		this.capsulName = capsulName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
