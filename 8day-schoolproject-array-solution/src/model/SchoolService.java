package model;
/**
 * �б� ������ ������ �����ϴ� ���� Ŭ����
 * @author KOSTA16
 *
 */
public class SchoolService {
	/**
	 * �б� ������(�л�, ����, ����)������ �����ϴ� �迭
	 */
	private Person[] list=new Person[10];
	/**
	 * �б� ������ ���� ����
	 */
	private int count;
	/**
	 * ���, �߰�, �˻�, ����, ���� �������� <br>
	 * �������� ����ϴ� ������ ������ �޼��� <br>
	 * �迭 ����� ������ tel�� �Ű������� ���޵� tel�� <br>
	 * ���Ͽ� tel�� ��ġ�ϴ� ����� �ε����� ��ȯ�Ѵ�. <br>
	 * ���� tel�� ��ġ�ϴ� �������� ������ -1�� ��ȯ�Ѵ�.
	 * @param tel
	 * @return index
	 */
	public int findIndexByTel(String tel) {
		int index=-1;
		for(int i=0;i<count;i++) {
			if(tel.equals(list[i].getTel())) {
				index=i;
				break;
			}
		}
		return index;
	}
	/**
	 * ������ ������ �߰��ϴ� �޼��� <br>
	 * ���� �ʰ��ÿ��� �߰� �Ұ� �޼����� ����Ѵ�. <br>
	 * ���� ������ tel�� �ߺ��� ��� tel�� �ߺ��� �޼��� ��� <br>
	 * �� �ΰ��� ���׿� �ش���� �ʴ� �������� �������� <br> 
	 * ���������� �迭��Ҹ� �����Ѵ�. <br>
	 * @param person
	 */
	public void addPerson(Person person) {
		if(count==list.length) {
			System.out.println("!! �� �� �� �� !! �߰��� �� �����ϴ�.");
		}else {
			int index=findIndexByTel(person.getTel());
			if(index!=-1) //���� tel �� �����ϸ� �ߺ��Ǿ� �߰� �Ұ�
				System.out.println("!! �ߺ� !! �߰��� �� �����ϴ�.");
			else
				list[count++]=person;
		}
	}
	/**
	 * ������ ����Ʈ�� ����ϴ� �޼���
	 */
	public void printAll() {
		for(int i=0;i<count;i++)
			System.out.println(list[i]);
	}
	/**
	 * tel�� ������ ������ �˻��Ͽ� ��ȯ�ϴ� �޼��� <br>
	 * �������� ������ null�� ��ȯ�Ѵ�.
	 * @param tel
	 * @return person
	 */
	public Person findPersonByTel(String tel) {
		Person person=null;
		int index=findIndexByTel(tel);
		if(index>-1)
			person=list[index];
		return person;
	}
	/**
	 * ������ ������ �����ϴ� �޼��� <br>
	 * tel�� ��ġ�ϴ� �迭 ����� ������ �����Ѵ�. <br>
	 * ���� �Ű������� ���޵� ������ ��ü�� tel�� ��ġ�ϴ� <br>
	 * �迭 ��Ұ� ���� ��쿡�� tel �� �ش��ϴ� �������� ���� �����Ұ�<br>
	 * �޼����� ����Ѵ�.
	 * @param person
	 */
	public void updatePerson(Person person) {
		int index=findIndexByTel(person.getTel());
		if(index>-1)
			list[index]=person;
		else
			System.out.println("!! tel�� �ش��ϴ� ������ ��� �����Ұ� !!");
	}
	/**
	 * �б� ������ ������ �����ϴ� �޼��� <br>
	 * �Ű������� ���޹��� tel �� ��ġ�ϴ� �迭 ��Ҹ� �����Ѵ� <br>
	 * ���޹��� tel�� ����� �ε����� ��ġ�ϴ� �� �˾Ƴ��� <br>
	 * ���� ��� ��� �ε��� ��ġ�� �ε���+1 �� ����� �ּҰ��� <br>
	 * ���Ҵ��ϴ� ������� �����ϸ� �ȴ�. <br>
	 * ���� ��������� �迭�� ���� �������� ��쿡��<br>
	 * ���� null�� �Է��Ѵ�. <br>
	 * �����۾��� �Ϸ�Ǹ� ���� �ο��� count�� -1 ���ҽ�Ų��.
	 * @param tel
	 */
	public void deletePerson(String tel) {
		int index=findIndexByTel(tel);
		if(index>-1) {
			for(int i=index;i<count;i++) {
				if(i+1==list.length) //������ ��Ҹ� ������ ���
					list[i]=null;
				else
				list[i]=list[i+1];
			}
			count--;
		}else {
			System.out.println("!! ���� �� ������ �����ϴ�. !!");
		}
	}
	
}









