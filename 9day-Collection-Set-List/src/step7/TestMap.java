package step7;

import java.util.LinkedHashMap;

public class TestMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String,String>();
		//key �� value �������� ������ �����ϰ� ����
		map.put("A","������");
		map.put("B","���ϼ�");
		map.put("C","�ѻ�"); //map�� ��Ҹ� �߰�
		System.out.println(map);
		System.out.println(map.get("B"));//key�� �̿��� �˻�
		//������ key�� put �� ��쿡�� value�� ������Ʈ�Ѵ�
		map.put("A","������");
		System.out.println(map);
		//key�� �̿��� ����
		String info=map.remove("A");
		System.out.println("����:"+info);
		System.out.println(map);
	}
}
