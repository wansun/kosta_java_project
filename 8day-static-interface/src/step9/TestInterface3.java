package step9;

public class TestInterface3 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService(10);
		service.add(new GomPlayer());
		service.add(new AlSongPlayer());
		service.add(new CDPlayer());
		service.executeAll();
		/* ���÷��̾ �������� ����ϴ�
		 * �˼��÷��̾ ������ ����ϴ�
		 * �õ��÷��̾ cd�� ����ϴ�
		 */
	}
}
