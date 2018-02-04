package step7;

import java.util.LinkedHashMap;

public class TestMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String,String>();
		//key 와 value 형식으로 정보를 저장하고 관리
		map.put("A","이윤희");
		map.put("B","류완선");
		map.put("C","한샘"); //map에 요소를 추가
		System.out.println(map);
		System.out.println(map.get("B"));//key를 이용한 검색
		//동일한 key가 put 될 경우에는 value를 업데이트한다
		map.put("A","아이유");
		System.out.println(map);
		//key를 이용해 삭제
		String info=map.remove("A");
		System.out.println("삭제:"+info);
		System.out.println(map);
	}
}
