package step6;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator2 {
	public static void main(String[] args) {
		ItemService service=new ItemService();
		String requestType="��ǰ����";
		//requestType="��ǰ���";
		Collection<String> col=service.delivery(requestType);
		/*  delivery �޼����� ��ȯ���� Collection interface Ÿ���̴�.
		 *  ���� ����ü�� � Ÿ�Կ� ��ü�� ��ȯ������ ��������� �ʴ´�
		 *  (List �迭�ϼ��� �ְ� Set �迭�� ���� �ִ�)
		 *  Colletion �������̽��� ���� ����ü�ΰ��� ����Ǿ� �����Ƿ�
		 *  Iterator ��� ������ ǥ��ȭ�� ������� 
		 *  ��ҵ��� ��� �ݺ�, ���� �� �� �ִ�
		 *  ex) �Ǽ����� ��� ĵ(����ĵ ���)�� ���� ����� ����.
		 */
		//������ ���� 
		System.out.println(requestType);
		Iterator<String> sv=col.iterator();
		while(sv.hasNext())
			System.out.println(sv.next());
			
	}
}
