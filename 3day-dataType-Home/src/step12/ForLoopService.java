package step12;

public class ForLoopService {
	public void printInfo(String item, int count,int limit) {
		for(int i=1;i<=count;i++) {
			System.out.println(item+" "+i+"��");
			if(limit==i)
				break; //for���� ����� 
		}
	}
}
