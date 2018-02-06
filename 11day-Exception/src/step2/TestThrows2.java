package step2;

import java.sql.SQLException;

/* throws, throw
 * try catch finally
 */
//DAO : Data Access Object 데이터베이스 연동 로직을 담당하는 객체
class MemberDAO{
	public void register(String memberInfo) throws SQLException {
		if(memberInfo==null || memberInfo.equals("")) {
			//SQLException 을 발생시키겠다
			throw new SQLException();
		}
		System.out.println(memberInfo+"가입완료^^");
	/*}finally {
		System.out.println("데이터베이스 컨넥션 해제");*/
	}
}
public class TestThrows2 {
	public static void main(String[] args) {
		MemberDAO dao=new MemberDAO();
		String info="아이유";
		info="";
		try {
			dao.register(info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("가입 후 작업");
	}
}
