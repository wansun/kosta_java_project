package step6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class ItemService {
	
	public Collection<String> delivery(String requestType) {
		Collection<String> col=null;
		if(requestType.equals("��ǰ����")) {
			col=new LinkedHashSet<String>();
			col.add("����");
			col.add("����");
			col.add("ġ��");
		}else if(requestType.equals("��ǰ���")) {
			col=new ArrayList<String>();
			col.add("����");
			col.add("������");
			col.add("�粿ġ");
			col.add("Ī����");
		}
		return col;
	}

}
