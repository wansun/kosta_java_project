package step3;
class InputWorker implements Runnable{
	public void inputMessage() {
		for(int i=0;i<10;i++)
			System.out.println("ģ������ �޼����� �Է¹޴� Input Thread");
	}
	@Override
	public void run() {
		inputMessage();
	}
}
public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<5;i++)
			System.out.println("ģ���鿡�� �޼����� ����ϴ� Output main Thread");
	}
	public static void main(String[] args) {
		System.out.println("main thread ����");
		//InputWorker ������ ���� 
		Thread inputThread=new Thread(new InputWorker());
		//InputWorker ������ ���డ�ɻ��·� ������ 
		inputThread.start();
		//main ������ ���� �Ѵ� 
		new TestThread3().outputMessage();		
		System.out.println("main thread ����");
	}
}







