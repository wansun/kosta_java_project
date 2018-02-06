package model;


import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	private LinkedHashMap<String, Person> map=new LinkedHashMap<String, Person>();
	
	 /** 조건
	 * 1. 10명까지
	 * 2. tel값 중복체크
	 * 3. 1번 2번 아닌 애들만 추가
	 **/ 
	public void addPerson(Person p) {
		if(map.size()>100)
			System.out.println("인원수 초과");
		else if(map.containsKey(p.getTel()))
			System.out.println("tel이 중복되어 추가불가");
		else map.put(p.getTel(), p);
		//		if(map.size()<10) {
//			if(map.containsKey(p.getTel())){
//				System.out.println("** 중복 **");
//			}else {
//				map.put(p.getTel(), p);
//		}
//			}else {
//			System.out.println("*** 구성원 초과 ***");
		}
	public void printAll() {
		Iterator<Person> it=map.values().iterator();
				while(it.hasNext())
					System.out.println(it.next());
					
//					Person p=it.next();
//					System.out.println(p);
				}	
	public Person findPersonByTel(String tel) {
//		if(map.containsKey(tel)) {
//			return map.get(tel);
//		}else {
//			System.out.println("찾는 번호 없음");
//			return null;
//		}
		return map.get(tel);
	}

	public void updatePerson(Person p) {
//		if(map.containsKey(p.getTel())) {
//			map.put(p.getTel(), p);
//		}else {
//			System.out.println("*** 일치하는 정보 없음 ***");
//		}
		map.put(p.getTel(), p);
	}

	public void deletePerson(String tel) {
			map.remove(tel);
		
	}
}
