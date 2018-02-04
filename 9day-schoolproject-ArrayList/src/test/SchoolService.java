package test;

import java.util.ArrayList;

import model.Person;

public class SchoolService {
	
	private ArrayList<Person> list=new ArrayList<Person>();
	
	private int findIndexByTel(String tel) {
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public void addPerson(Person person) {
			if(findIndexByTel(person.getTel())==-1) 
				list.add(person);
			else
				System.out.println("**** 중복불가(tel 중복) ****");
	}

	
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	public Person findPersonByTel(String tel){
		Person person=null;
		int index=findIndexByTel(tel);
		if(index>-1)
			person=list.get(index);
		return person;
	}

	public void updatePerson(Person person) {
		int index=findIndexByTel(person.getTel());
		if(index>-1)
			list.set(index,person);
		else {
			System.out.println("수정할 정보가 없습니다");
		}
	}
	
	public void deletePerson(String tel) {
		int index=findIndexByTel(tel);
		if(index>-1)
			list.remove(index);
		else
			System.out.println("삭제할 정보가 없습니다.");
	}
}









