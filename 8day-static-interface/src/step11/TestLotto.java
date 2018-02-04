package step11;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		TreeSet<Integer> lottoSet=service.createLottoSet();
		System.out.println(lottoSet);
		//1이상 45이하의 임의의 수가 중복없이 6개 반환되어야 한다
		//ex) [3,6,9,11,18,27]
	}
}
