package step6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class ItemService {
	
	public Collection<String> delivery(String requestType) {
		Collection<String> col=null;
		if(requestType.equals("상품종류")) {
			col=new LinkedHashSet<String>();
			col.add("족발");
			col.add("피자");
			col.add("치맥");
		}else if(requestType.equals("상품목록")) {
			col=new ArrayList<String>();
			col.add("삼겹살");
			col.add("감자탕");
			col.add("양꼬치");
			col.add("칭따오");
		}
		return col;
	}

}
