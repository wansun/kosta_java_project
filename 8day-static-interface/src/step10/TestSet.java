package step10;

import java.util.TreeSet;

/* java.util.Collection �迭�� TreeSet �� �׽�Ʈ
 * Set �迭�� ��ҷ� ���� ������ �ߺ��� ������� �ʴ� Ư¡
 * Set interface �� ����Ŭ����(����ü) �� TreeSet �� �����ϴ� ����� ����
 */
public class TestSet {
	public static void main(String[] args) {
		// <E> : <String>  -> Generic : ��� Ÿ���� ���
		TreeSet<String> set=new TreeSet<String>();
		set.add("������");
		set.add("����");
		set.add("������"); //������ �����Ͱ� �ߺ��ǹǷ� �߰����� �ʴ´�.
		set.add("�迬��");
		System.out.println(set.size()); //3
		//TreeSet �̹Ƿ� ���ĵǾ� ��µȴ�
		System.out.println(set);
		System.out.println("*************");
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set2.add(5);
		set2.add(3);
		set2.add(7);
		set2.add(3); //�ߺ��Ǿ� �߰����� �ʴ´�.
		System.out.println(set.size());//3
		//TreeSet�̹Ƿ� �������� ���ĵǾ� ��µȴ�
		System.out.println(set2);
		System.out.println(set2.descendingSet());
	}
}
