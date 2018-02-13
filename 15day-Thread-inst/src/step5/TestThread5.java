package step5;
/* ������ ������ �ϴ� �ټ��� �����带 ������
 * �����ϴ� ���� 
 * ���� ����(������ ���೻��)�� �����Ƿ� �ϳ��� Ŭ�������� 
 * �ټ��� �����带 �����غ���  
 */
class ServerWorker implements Runnable{
	private String companyName;
	ServerWorker(String companyName){
		this.companyName=companyName;
	}	
	@Override
	public void run(){
		try {
			service();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}	
	public void service() throws InterruptedException {
		for(int i=0;i<10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(companyName+"���� �˻�����"+i+" "+name);
			Thread.sleep(1000);
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		System.out.println("**���� ������ ����**");
		// ���� �������� ������ �̸��� ��ȯ 
		//System.out.println(Thread.currentThread().getName());
		ServerWorker worker=new ServerWorker("���̹�");
		Thread t1=new Thread(worker,"ù��° ������ ������");
		Thread t2=new Thread(worker,"�ι�° ������ ���ϼ�");
		t1.start();
		t2.start();
		System.out.println("**���� ������ ����**");
	}
}







