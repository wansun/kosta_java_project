package model;
/**
 * 학교 구성원 정보를 관리하는 서비스 클래스
 * @author KOSTA16
 *
 */
public class SchoolService {
	/**
	 * 학교 구성원(학생, 교사, 직원)정보를 저장하는 배열
	 */
	private Person[] list=new Person[10];
	/**
	 * 학교 구성원 수를 저장
	 */
	private int count;
	/**
	 * 등록, 추가, 검색, 수정, 삭제 업무에서 <br>
	 * 공통으로 사용하는 로직을 구현한 메서드 <br>
	 * 배열 요소의 구성원 tel과 매개변수로 전달된 tel을 <br>
	 * 비교하여 tel이 일치하는 요소의 인덱스를 반환한다. <br>
	 * 만약 tel에 일치하는 구성원이 없으면 -1을 반환한다.
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
	 * 구성원 정보를 추가하는 메서디 <br>
	 * 정원 초과시에는 추가 불가 메세지를 출력한다. <br>
	 * 기존 구성원 tel과 중복될 경우 tel이 중복됨 메세지 출력 <br>
	 * 위 두가지 사항에 해당되지 않는 정상적인 구성원은 <br> 
	 * 순차적으로 배열요소를 저장한다. <br>
	 * @param person
	 */
	public void addPerson(Person person) {
		if(count==list.length) {
			System.out.println("!! 정 원 초 과 !! 추가할 수 없습니다.");
		}else {
			int index=findIndexByTel(person.getTel());
			if(index!=-1) //기존 tel 이 존재하면 중복되어 추가 불가
				System.out.println("!! 중복 !! 추가할 수 없습니다.");
			else
				list[count++]=person;
		}
	}
	/**
	 * 구성원 리스트를 출력하는 메서드
	 */
	public void printAll() {
		for(int i=0;i<count;i++)
			System.out.println(list[i]);
	}
	/**
	 * tel로 구성된 정보를 검색하여 반환하는 메서드 <br>
	 * 존재하지 않으면 null을 반환한다.
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
	 * 구성원 정보를 수정하느 메서드 <br>
	 * tel과 일치하는 배열 요소의 정보를 수정한다. <br>
	 * 만약 매개변수로 전달된 구성원 객체의 tel이 일치하는 <br>
	 * 배열 요소가 없을 경우에는 tel 에 해당하는 구성원이 없어 수정불가<br>
	 * 메세지를 출력한다.
	 * @param person
	 */
	public void updatePerson(Person person) {
		int index=findIndexByTel(person.getTel());
		if(index>-1)
			list[index]=person;
		else
			System.out.println("!! tel에 해당하는 구성원 없어서 수정불가 !!");
	}
	/**
	 * 학교 구성원 정보를 삭제하는 메서드 <br>
	 * 매개변수로 전달받은 tel 과 일치하는 배열 요소를 삭제한다 <br>
	 * 전달받은 tel이 몇번쨰 인덱스에 위치하는 지 알아낸다 <br>
	 * 삭제 대상 요소 인덱스 위치에 인덱스+1 한 요소의 주소값을 <br>
	 * 재할당하는 방식으로 삭제하면 된다. <br>
	 * 만약 삭제대상이 배열의 가장 마지막일 경우에는<br>
	 * 직접 null을 입력한다. <br>
	 * 삭제작업이 완료되면 현재 인원수 count를 -1 감소시킨다.
	 * @param tel
	 */
	public void deletePerson(String tel) {
		int index=findIndexByTel(tel);
		if(index>-1) {
			for(int i=index;i<count;i++) {
				if(i+1==list.length) //마지막 요소를 삭제할 경우
					list[i]=null;
				else
				list[i]=list[i+1];
			}
			count--;
		}else {
			System.out.println("!! 삭제 할 구성원 없습니다. !!");
		}
	}
	
}









