package step7;

import java.util.Iterator;
import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String,String>();
		//key �� value �������� ������ �����ϰ� ����
		map.put("A","������");
		map.put("B","���ϼ�");
		map.put("C","�ѻ�");
		//��� key ������ ��ȯ�޾� �����ϰ��� �Ѵ�.
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
