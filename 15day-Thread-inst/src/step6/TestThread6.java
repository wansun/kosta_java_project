package step6;
/*
 * ������ �켱���� �ο��ؼ� 
 * �����ٸ��� �׽�Ʈ 
 */
class Worker implements Runnable{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(long l=0;l<9000000000L;l++) {			
		}
		System.out.println(name+" ������ ����Ϸ�! �켱���� "+priority);
	}
	
}
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("main thread ����");
		Worker w=new Worker();
		/*Thread t1=new Thread(w,"ù��° �ϲ�");
		t1.setPriority(Thread.MAX_PRIORITY);//���� ���� �켱���� �Ҵ� 
		t1.start();*/
		// ������ 20�� ���� 
		for(int i=0;i<20;i++) {
			Thread t=new Thread(w,i+"��° �ϲ۽�����");
			if(i==9)//�ϳ��� �����忡�Ը� ���� �켱���� �ο�
				t.setPriority(Thread.MAX_PRIORITY);
			t.start();
			System.out.println(i+"��° �ϲ۽����� start");
		}
		System.out.println("main thread ����");
	}
}









