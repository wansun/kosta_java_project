package step5;
/* 동일한 업무를 하는 다수의 스레드를 생성해
 * 실행하는 예제 
 * 서비스 내용(스레드 실행내용)이 같으므로 하나의 클래스에서 
 * 다수의 스레드를 생성해본다  
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
			System.out.println(companyName+"서버 검색서비스"+i+" "+name);
			Thread.sleep(1000);
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		System.out.println("**메인 스레드 시작**");
		// 현재 실행중인 스레드 이름을 반환 
		//System.out.println(Thread.currentThread().getName());
		ServerWorker worker=new ServerWorker("네이버");
		Thread t1=new Thread(worker,"첫번째 스레드 이윤희");
		Thread t2=new Thread(worker,"두번째 스레드 류완선");
		t1.start();
		t2.start();
		System.out.println("**메인 스레드 종료**");
	}
}







