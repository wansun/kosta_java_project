package ste5;

import java.util.ArrayList;        //Generic �ҋ����� ����Ʈ �ؾ��Ѵ�.
import java.util.Collection;       //Generic �ҋ����� ����Ʈ �ؾ��Ѵ�.
import java.util.Iterator;		   //Generic �ҋ����� ����Ʈ �ؾ��Ѵ�.
import java.util.LinkedHashSet;	   //Generic �ҋ����� ����Ʈ �ؾ��Ѵ�.

public class TestIterator1 {
	public static void main(String[] args) {
		// Iterator Ȱ�� ����
		Collection<String> list=new ArrayList<String>();
		list.add("������");
		list.add("���ϼ�");
		list.add("�ѻ�");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("***************");
		
		
		Collection<String> set=new LinkedHashSet<String>();
		set.add("�ѻ�");
		set.add("������");
		set.add("���ϼ�");
		//Iterator�� set ��Ҹ� ��� �����غ���.
		Iterator<String> st=set.iterator();
		while(st.hasNext())
			System.out.println(st.next());
	}
}
