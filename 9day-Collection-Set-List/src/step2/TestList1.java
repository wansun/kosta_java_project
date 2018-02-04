package step2;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		// 인덱스로 관리
		ArrayList<String> list=new ArrayList<String>();
		list.add("공유");
		list.add("아이유");
		list.add("공유");
		System.out.println(list.size());
		System.out.println(list);
		//첫번째 요소를 반환받아 출력
		System.out.println(list.get(0));
		//두번쨰 요소를 삭제
		list.remove(1);
		System.out.println(list);
		list.add("김연아");
		System.out.println(list);
		boolean flag=list.contains("김연아");
		System.out.println(flag);
		list.set(0, "이윤희"); //첫번쨰 요소를 업데이트
		System.out.println(list);
		System.out.println("****for문을 이용해 모두 출력해본다*****");
		
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		list.clear();
		System.out.println(list);
	}
}
