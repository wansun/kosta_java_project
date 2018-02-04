package ste5;

import java.util.ArrayList;        //Generic 할떄마다 임포트 해야한다.
import java.util.Collection;       //Generic 할떄마다 임포트 해야한다.
import java.util.Iterator;		   //Generic 할떄마다 임포트 해야한다.
import java.util.LinkedHashSet;	   //Generic 할떄마다 임포트 해야한다.

public class TestIterator1 {
	public static void main(String[] args) {
		// Iterator 활용 예제
		Collection<String> list=new ArrayList<String>();
		list.add("이윤희");
		list.add("류완선");
		list.add("한샘");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("***************");
		
		
		Collection<String> set=new LinkedHashSet<String>();
		set.add("한샘");
		set.add("이윤희");
		set.add("류완선");
		//Iterator로 set 요소를 모두 나열해본다.
		Iterator<String> st=set.iterator();
		while(st.hasNext())
			System.out.println(st.next());
	}
}
