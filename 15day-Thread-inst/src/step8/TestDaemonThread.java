package step8;
/*  Daemon Thread : 백그라운드에서 실행되는 스레드 
 * 						 자신을 실행시킨 스레드가 종료되면 같이 종료된다
 * 						 ex) 워드 작업을 수행시에 
 * 							  백그라운드에서 일정 시간을 주기로 백업을 
 * 							  해야 한다 
 * 							  워드 스레드와 백업스레드가 필요하고
 * 							  백업스레드가 Daemon Thread 가 되면 된다 
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
		System.out.println("**문서 백업처리**");
	}
}
class Word implements Runnable{
	@Override
	public void run() {
		//워드프로그램이 시작될 때 백업 스레드를 start 한다 
		Thread backupThread=new Thread(new BackUpWorker());
		backupThread.setDaemon(true);//백그라운드에서 실행하는 Daemon 
		backupThread.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("워드 작업 "+i);
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















