package step1;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		//TreeSet : Set�迭�̹Ƿ� �ߺ�������� �ʰ�
		//          TreeSet�� ���ı���� �����Ѵ�.
		TreeSet<String> set=new TreeSet<String>();
		set.add("������");
		// set.add(1); //Generic�� String���� ���������Ƿ� ���ڿ��� ���尡��
		set.add("�迬��");
		set.add("�տ���");
		set.add("������"); //Set �̹Ƿ� �ߺ����x, �߰� �ȵ�
		System.out.println(set); //3���� ���ĵǾ� ��µȴ�.
		System.out.println("*******************");
		//�ߺ�������� �ʰ� �߰� ������� ����ȴ�.
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(100);
		set2.add(300);
		set2.add(200);
		set2.add(100); //�ߺ��ǹǷ� �߰��ȵ�
		System.out.println(set2); //�߰��� ������� ��µȴ�.
	}
}
