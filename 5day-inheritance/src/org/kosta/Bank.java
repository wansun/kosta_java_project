package org.kosta;
//접근 제어자 테스트
public class Bank {
	public void testPublic() {
		System.out.println("testPublic public ok");
	}
	public void testProtected() {
		System.out.println("testProtected protected ok");
	}
	void testDefault() {
		System.out.println("testDefault default ok");
	}
	private void testPrivate() {
		System.out.println("testPrivate private ok");
	}
	void test() {testPrivate();}
}
