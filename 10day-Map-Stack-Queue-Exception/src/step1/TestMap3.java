package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestMap3 {
	public static void main(String[] args) {
		Food f1=new Food("a","미래에셋백반",4500);
		Food f2=new Food("b","쌀국수",8000);
		Food f3=new Food("c","미래에셋백반",6000);
		LinkedHashMap<String, Food> map=new LinkedHashMap<String, Food>();
		//key는 Food을 id로 저장, Food 객체를 Value로 저장
		map.put(f1.getId(), f1);
		map.put(f2.getId(), f2);
		map.put(f3.getId(), f3);
		//b id인 key로 Food 객체를 검색
		System.out.println(map.get("b"));
		Food f4=new Food("b","감자탕",20000);
		//ket 가 중복되므로 value가 업데이트 된다.
		map.put(f4.getId(), f4);
		System.out.println(map.get("b"));
		System.out.println(map.size());
		//map 의 key중에 a가 있는지 true or false
		System.out.println(map.containsKey("a"));
		/* 음식명 : 미래에셋백반  가격 : 4500
		 * 음식명 : 감자탕  가격 : 20000
		 * 음식명 : 순대국  가격 : 6000
		 */
		System.out.println("**** 메뉴판 ****");
		Collection<Food> collection=map.values();
		Iterator<Food> it=collection.iterator();
		while(it.hasNext()) {
			Food f=it.next();
			System.out.println("음식명 : "+f.getName()+"  가격 : "+f.getPrice());
		}
		
	}
}
