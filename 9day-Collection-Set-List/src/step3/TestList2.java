package step3;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(new Friend("������","����",31));
		//����Ʈ ù��° ����� �̸��� ���
		Object obj=list.get(0);
		Friend f=(Friend)obj; //object casting�� �ʿ�
		System.out.println(f.getName());*/
		//Generic�� �����ϸ� ĳ���� ������ �ʿ����.
		ArrayList<Friend> genericList=new ArrayList<Friend>();
		genericList.add(new Friend("������","����",31));
		//generic ����� ����Ʈ�� ù���� ����� �̸��� ���
		//System.out.println(genericList.get(0).getName());
		genericList.add(new Friend("������","����",36));
		genericList.add(new Friend("������","����",24));
		//for �̿��� �ؼ� 30�� �̻� ����� �̸��� ���̸� ���
		for(int i=0;i<genericList.size();i++) {
			if(genericList.get(i).getAge()>=30) {
				System.out.println(genericList.get(i).getName()
						+" "+genericList.get(i).getAge());
			}			
		}
	}
}