package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import schoole.exception.PersonExistException;

public class SchoolService {
	private LinkedHashMap<String, Person> map=new LinkedHashMap<String, Person>();
	
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
}
