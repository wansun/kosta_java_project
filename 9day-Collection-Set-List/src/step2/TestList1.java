package step2;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		// �ε����� ����
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("������");
		list.add("����");
		System.out.println(list.size());
		System.out.println(list);
		//ù��° ��Ҹ� ��ȯ�޾� ���
		System.out.println(list.get(0));
		//�ι��� ��Ҹ� ����
		list.remove(1);
		System.out.println(list);
		list.add("�迬��");
		System.out.println(list);
		boolean flag=list.contains("�迬��");
		System.out.println(flag);
		list.set(0, "������"); //ù���� ��Ҹ� ������Ʈ
		System.out.println(list);
		System.out.println("****for���� �̿��� ��� ����غ���*****");
		
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		list.clear();
		System.out.println(list);
	}
}
