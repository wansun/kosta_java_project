package step3;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(new Friend("이윤희","수원",31));
		//리스트 첫번째 요소의 이름만 출력
		Object obj=list.get(0);
		Friend f=(Friend)obj; //object casting이 필요
		System.out.println(f.getName());*/
		//Generic을 적용하면 캐스팅 절차가 필요없다.
		ArrayList<Friend> genericList=new ArrayList<Friend>();
		genericList.add(new Friend("이윤희","수원",31));
		//generic 적용된 리스트의 첫번쨰 요소의 이름을 출력
		//System.out.println(genericList.get(0).getName());
		genericList.add(new Friend("강동원","강남",36));
		genericList.add(new Friend("아이유","마포",24));
		//for 이용을 해서 30세 이상 요소의 이름과 나이를 출력
		for(int i=0;i<genericList.size();i++) {
			if(genericList.get(i).getAge()>=30) {
				System.out.println(genericList.get(i).getName()
						+" "+genericList.get(i).getAge());
			}			
		}
	}
}