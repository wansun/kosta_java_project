package step11;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		TreeSet<Integer> lottoSet=service.createLottoSet();
		System.out.println(lottoSet);
		//1�̻� 45������ ������ ���� �ߺ����� 6�� ��ȯ�Ǿ�� �Ѵ�
		//ex) [3,6,9,11,18,27]
	}
}
