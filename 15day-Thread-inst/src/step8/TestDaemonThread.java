package step8;
/*  Daemon Thread : ��׶��忡�� ����Ǵ� ������ 
 * 						 �ڽ��� �����Ų �����尡 ����Ǹ� ���� ����ȴ�
 * 						 ex) ���� �۾��� ����ÿ� 
 * 							  ��׶��忡�� ���� �ð��� �ֱ�� ����� 
 * 							  �ؾ� �Ѵ� 
 * 							  ���� ������� ��������尡 �ʿ��ϰ�
 * 							  ��������尡 Daemon Thread �� �Ǹ� �ȴ� 
 * 
 */
class BackUpWorker implements Runnable{
	@Override
	public void run() {	
		while(true) {			
			try {
				Thread.sleep(3000);
				backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	public void backup() {
		System.out.println("**���� ���ó��**");
	}
}
class Word implements Runnable{
	@Override
	public void run() {
		//�������α׷��� ���۵� �� ��� �����带 start �Ѵ� 
		Thread backupThread=new Thread(new BackUpWorker());
		backupThread.setDaemon(true);//��׶��忡�� �����ϴ� Daemon 
		backupThread.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���� �۾� "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
		new BackUpWorker().backup();
	}	//run
}//class
public class TestDaemonThread {
	public static void main(String[] args) {
		new Thread(new Word()).start();
	}
}















