package step3;
class InputWorker implements Runnable{
	public void inputMessage() {
		for(int i=0;i<10;i++)
			System.out.println("친구들의 메세지를 입력받는 Input Thread");
	}
	@Override
	public void run() {
		inputMessage();
	}
}
public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<5;i++)
			System.out.println("친구들에게 메세지를 출력하는 Output main Thread");
	}
	public static void main(String[] args) {
		System.out.println("main thread 시작");
		//InputWorker 스레드 생성 
		Thread inputThread=new Thread(new InputWorker());
		//InputWorker 스레드 실행가능상태로 보낸다 
		inputThread.start();
		//main 스레드 일을 한다 
		new TestThread3().outputMessage();		
		System.out.println("main thread 종료");
	}
}







