package step4;
/* ��Ƽ ������ �׽�Ʈ 
 * ���� �۾� ������ 
 * ���� �۾� ������ 
 */
class VideoWorker implements Runnable{
	@Override
	public void run() {		
		try {
			work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void work() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("���� ���� ������ "+i);
			Thread.sleep(1000);
		}
	}
}
class AudioWorker implements Runnable{
	@Override
	public void run() {		
		try {
			work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void work() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("���� ���� ������ "+i);
			Thread.sleep(1000);
		}
	}
}
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main ������ ����**");
		//Video Thread �����ϰ� start() ��Ų�� 
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("**main ������ ����**");
	}
}











