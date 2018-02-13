package step4;
/* 멀티 스레딩 테스트 
 * 영상 작업 스레드 
 * 음향 작업 스레드 
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
			System.out.println("영상 서비스 스레드 "+i);
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
			System.out.println("음향 서비스 스레드 "+i);
			Thread.sleep(1000);
		}
	}
}
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main 스레드 시작**");
		//Video Thread 생성하고 start() 시킨다 
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("**main 스레드 종료**");
	}
}











