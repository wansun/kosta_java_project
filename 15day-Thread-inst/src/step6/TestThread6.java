package step6;
/*
 * 스레드 우선순위 부여해서 
 * 스케줄링을 테스트 
 */
class Worker implements Runnable{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(long l=0;l<9000000000L;l++) {			
		}
		System.out.println(name+" 스레드 실행완료! 우선순위 "+priority);
	}
	
}
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("main thread 시작");
		Worker w=new Worker();
		/*Thread t1=new Thread(w,"첫번째 일꾼");
		t1.setPriority(Thread.MAX_PRIORITY);//가장 높은 우선순위 할당 
		t1.start();*/
		// 스레드 20개 생성 
		for(int i=0;i<20;i++) {
			Thread t=new Thread(w,i+"번째 일꾼스레드");
			if(i==9)//하나의 스레드에게만 높은 우선순위 부여
				t.setPriority(Thread.MAX_PRIORITY);
			t.start();
			System.out.println(i+"번째 일꾼스레드 start");
		}
		System.out.println("main thread 종료");
	}
}









