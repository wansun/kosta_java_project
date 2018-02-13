package step2;
// step1의 단일 스레드(main thread) 환경과 
// step2의 멀티 스레드 환경을 비교 
class Worker extends Thread{//Thread 를 상속받아 Worker 스레드 클래스를 정의
	@Override
	public void run() {// jvm에 의해 호출된다. Worker thread의 실행내용을 정의
		work();		
	}
	public void work() {
		for(int i=0;i<10;i++)
			System.out.println("Worker 일하다 "+i);
	}	
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		//new Worker().work();
		//Worker Thread를 생성해 start() 를 이용해 실행가능상태로 보낸다
		Worker w=new Worker();
		w.start();		
		System.out.println("**main thread 종료**");
	}
}





