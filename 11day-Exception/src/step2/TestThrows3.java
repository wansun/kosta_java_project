package step2;

import java.sql.SQLException;
//Exception 실행 흐름을 예상하는 예제
class Test{
	public void ex(int i) throws SQLException {
		try {
			if(i<=0)
				throw new SQLException();
			System.out.println("a");
		}finally {//finally는 무조건 출력
			System.out.println("b");
		}
	}
}

public class TestThrows3 {
	public static void main(String[] args) {
		Test t=new Test();
		int i=0; //1을 입력했을때 출력 내용 : a b c e
		//i=0; //0을 입력했을때 출력 내용 : b d e
		try {
			t.ex(i);
			System.out.println("c");
		} catch (SQLException e) {
			System.out.println("d");
		}
		System.out.println("e");
	}
}
