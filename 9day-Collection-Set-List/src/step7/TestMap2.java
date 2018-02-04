package step7;

import java.util.Iterator;
import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String,String>();
		//key 와 value 형식으로 정보를 저장하고 관리
		map.put("A","이윤희");
		map.put("B","류완선");
		map.put("C","한샘");
		//모든 key 정보를 반환받아 나열하고자 한다.
//		Set<String> st=new LinkedHashSet<String>();
//		st=map.keySet(); // return Set<String>
//		Iterator<String> it=st.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
	
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
