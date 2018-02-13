package step1;
// 단일 스레드(main thread) 환경 테스트 
class Worker{
	public void work() {
		for(int i=0;i<10;i++)
			System.out.println("Worker 일하다 "+i);
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		new Worker().work();
		System.out.println("**main thread 종료**");
	}
}





