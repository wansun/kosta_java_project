package step2;

public class TestArray {
	public static void main(String[] args) {
		Friend f[]= {
				new Friend("아이유", 24, "판교"),
				new Friend("장기하", 34, "종로"),
				new Friend("강하늘", 28, "판교")
			
		};
		FriendService service=new FriendService();
		//service.printAllFriendInfo(f);
		service.printFriendByAddress(f,"판교");//주소가 판교인 친구들만 출력
	}
}
