package step2;
// step1�� ���� ������(main thread) ȯ��� 
// step2�� ��Ƽ ������ ȯ���� �� 
class Worker extends Thread{//Thread �� ��ӹ޾� Worker ������ Ŭ������ ����
	@Override
	public void run() {// jvm�� ���� ȣ��ȴ�. Worker thread�� ���೻���� ����
		work();		
	}
	public void work() {
		for(int i=0;i<10;i++)
			System.out.println("Worker ���ϴ� "+i);
	}	
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		//new Worker().work();
		//Worker Thread�� ������ start() �� �̿��� ���డ�ɻ��·� ������
		Worker w=new Worker();
		w.start();		
		System.out.println("**main thread ����**");
	}
}





