package model;

public class SchoolService {
	private Person[] p=new Person[10];
	private int count=0;
	
	public void addPerson(Person a) {

		if(count>=10) {
		System.out.println("정 원 초 과   발 생");
		return;
		}
		
		for(int i=0;i<count;i++) {
			if(p[i].getTel().equals(a.getTel())) {
				System.out.println("!! 중 복 발 생 !!");
				return;
			}
		}
		
		p[count]=a;
		count++;
	}
	public void deletePerson(String telNum) {
		for(int i=0;i<count;i++) {
			if(p[i].getTel().equals(telNum)) {
				for(int j=i;j<count-1;j++) {
					p[j]=p[j+1];
				}
			}
		}
	}
	public void updatePerson(Person a) {
		for(int i=0;i<count;i++) {
			if(p[i].getTel().equals(a.getTel())) {
				p[i]=a;
				return;
			}
		}
	}
	public Person findPersonByTel(String telNum) {
		for(int i=0;i<count;i++) {
			if(p[i].getTel().equals(telNum)) {
				return p[i];
			}
		}
		return null;
	}
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(p[i]);
		}
	}
}
