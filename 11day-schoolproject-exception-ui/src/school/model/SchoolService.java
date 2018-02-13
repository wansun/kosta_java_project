package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import schoole.exception.PersonExistException;
import schoole.exception.PersonNotFoundException;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();
	
	public void addPerson(Person p) throws PersonExistException{
		if(map.containsKey(p.getTel())) {
			throw new PersonExistException(p.getTel()+" tel이 중복되어 추가불가");
		} else {
			map.put(p.getTel(), p);
		}
	}

	public void printAll() {
		Iterator<Person> it=map.values().iterator();
			while(it.hasNext())
				System.out.println(it.next());
	}

	public Person findPersonByTel(String tel) throws PersonNotFoundException{
		if(map.containsKey(tel)) {
			return map.get(tel);
		} else {
			throw new PersonNotFoundException(tel+" tel이 존재하지않아 조회불가");
		}
	}

	public void deletePersonByTel(String tel) throws PersonNotFoundException{
		if(map.containsKey(tel)) {
			map.remove(tel);
		}else{
			throw new PersonNotFoundException(tel + " tel이 존재하지않아 삭제불가");
		}
	}
}